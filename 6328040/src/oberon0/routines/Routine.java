package oberon0.routines;

import generated.Oberon0Parser;

import java.util.ArrayList;
import java.util.List;

import oberon0.ast.*;
import oberon0.exceptions.*;
import oberon0.listener.InterpreterListener;
import oberon0.routines.builtin.BuiltInRoutines;
import oberon0.variables.*;

public class Routine{
	
	private InterpreterListener _listener;						// default response to messages
	private final String _name;									// routine name
    private VariableSpace _variableSpace;						// declared variables are stored here
    private RoutineSpace _routineSpace;							// declared routines are stored here
    private final OberonAST _root;								// routines root of AST
    private Parameters _params;									// parameters (procedure only)

	public Routine(String name, 
					OberonAST root, ArrayList<IReadableVar> formalParameters){
		_name = name;
		_root = root;
		_variableSpace = new VariableSpace(name);
		_routineSpace = new RoutineSpace(name);
		_listener = new InterpreterListener();
		_params = new Parameters(name, formalParameters);
	}
	
	public void call(ArrayList<IReadableVar> actualParameters){
		_params.setActualParams(actualParameters);
		_variableSpace = new VariableSpace(getName());
		
		try {
			fillInParameters();
		} catch (IllegalVariableValueException e) {
			_listener.error("Formal and Actual Parameters do not match",e);
		}
		
		_routineSpace = new RoutineSpace(getName());
		_routineSpace.add(_name, this); 						//add own routine to allow recursion
		
		execAllChildren(_root);
	}
	
	private void fillInParameters() throws IllegalVariableValueException{
		int numFormalParams = _params.getFormalParamsSize();
		
		for (int paramIndex = 0; paramIndex < numFormalParams; paramIndex++){
			IWriteableVar currentFormalParam = 
				(IWriteableVar) _params.getFormalParamAtIndex(paramIndex);
			IReadableVar currentActualParam = _params.getActualParamAtIndex(paramIndex);
			
			currentFormalParam.setValue(currentActualParam.getValue());
			if (!currentFormalParam.getSourceName().equals("")){
				currentFormalParam.setSourceName(currentActualParam.getName());
			}
			
			_variableSpace.add((IReadableVar) currentFormalParam);
		}
	}
	
	/** visitor dispatch according to node token type */
    private Object exec(OberonAST tree) {
        try {
            switch ( tree.getType() ) {
            	case Oberon0Parser.MODULE		: makeNewRoutineFromAST(tree,null).call(null);
            										break;
                case Oberon0Parser.IFBLOCK 		: execIfBlock(tree); 
                									break;
                case Oberon0Parser.WHILE 		: execWhileBlock(tree); 
                									break;
                case Oberon0Parser.DECLARATIONS : execDeclarations(tree);
                									break;
                case Oberon0Parser.ASSIGNMENT	: execAssignment(tree); 
													break;
                case Oberon0Parser.PROCEDURECALL: execProcedureCall(tree);
													break;
                case Oberon0Parser.BODY			: execAllChildren(tree);
													break;	
                
                //these have been handled, ignore
                case Oberon0Parser.ROUTINENAME		:
                case Oberon0Parser.ACTUALPARAMETERS	:
                case Oberon0Parser.FORMALPARAMETERS	:break;
                
                //TODO How to get rid of this in a neat way? no idea, 
                //an extra node in grammar would mess up the grammercode
                //they are ruining my ncss LOCs
                
                //Arithmetic operators
                case Oberon0Parser.MOD 			: 
            	case Oberon0Parser.ADD 			: 
                case Oberon0Parser.SUBTRACT 	: 
                case Oberon0Parser.MULTIPLY		: 
                case Oberon0Parser.DIVIDE		: 
                //Relations
                case Oberon0Parser.HASH 		: 
                case Oberon0Parser.EQUALS 		: 
                case Oberon0Parser.SMALLERTHEN	: 
                case Oberon0Parser.SMALLEREQUAL	: 
                case Oberon0Parser.GREATERTHEN	: 
                case Oberon0Parser.GREATEREQUAL	: 
                //Logical Operators
                case Oberon0Parser.AMPERSAND	: 
                case Oberon0Parser.OR			: 
                case Oberon0Parser.TILDE		: return evaluateExpressionFromAST(tree);
    
                case Oberon0Parser.INTEGER		: int integerValue = Integer.parseInt(tree.getText());
                								  return new IntegerVar("temp", integerValue);
                
                case Oberon0Parser.IDENT		: return getVarWithOptionalSelector(tree);
                
                case Oberon0Parser.SELECTOR		: OberonAST selectorNode = tree.getLeftmostChild();
                								  return exec(selectorNode);
                default : // catch unhandled node types
                    throw new UnsupportedOperationException("Node "+
                    		tree.getText()+"<"+tree.getType()+"> not handled");
            }
        }
        catch (Exception e) {
            _listener.error("problem executing "+ tree.toStringTree(), e);
        }
        return null;
    }

	private void execAllChildren(OberonAST tree){
    	List<OberonAST> statements = tree.getChildren();
		for (OberonAST currentStatement : statements) {
			exec(currentStatement);
		}
    }
    
    private void execProcedureCall(OberonAST tree) throws UnexpectedNodeException, NotInScopeException {
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.PROCEDURECALL, tree.getType());
    	ArrayList<IReadableVar> actualParameters = getActualParametersFromAST(tree);
	
		String procedureName = tree.getLeftmostChild().getText();
		Routine procedure = _routineSpace.getRoutine(procedureName);
		if (procedure != null){
			procedure.call(actualParameters);
			try {
				_variableSpace.updateVariablesAfterRoutineCall(procedure._variableSpace);
			} catch (IllegalVariableValueException e) {
				_listener.error("Unable to update after routine call",e);
			}
		} else {
			try {
				BuiltInRoutines.BuiltInNames.valueOf(procedureName);
				BuiltInRoutines.call(procedureName, actualParameters);
			} catch (NotInScopeException e) {
				_listener.error("Unable to find routine name",e);
			}
		}
	}
    
    private ArrayList<IReadableVar> getActualParametersFromAST(OberonAST tree) throws UnexpectedNodeException{
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.PROCEDURECALL, tree.getType());
    	
    	ArrayList<IReadableVar> actualParameters = new ArrayList<IReadableVar>();
		ArrayList<OberonAST> parametersNode = new ArrayList<OberonAST>();
		try{  //WriteLn doesnt need any parameter
			parametersNode = tree.getRightmostChild().getChildren(); 
		}catch(NullPointerException e){
			parametersNode = new ArrayList<OberonAST>();
		}finally{
			for(OberonAST currentParameterNode:parametersNode){
				IReadableVar currentParameter = (IReadableVar) exec(currentParameterNode);
				String currentParamSourceName = currentParameter.getSourceName();
				if (!_variableSpace.contains(currentParamSourceName) && !currentParamSourceName.equals("")){
					//currentParameter.setSourceName(currentParameter.getName());
				}
				actualParameters.add(currentParameter);
			}
		}
		return actualParameters;
    }
    
    private ArrayList<IReadableVar> getFormalParametersFromAST(OberonAST tree) throws UnexpectedNodeException{
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.FORMALPARAMETERS, tree.getType());
		
		ArrayList<IReadableVar> parameters = new ArrayList<IReadableVar>();
		
		List<OberonAST> FPSections = tree.getChildren();
		for (OberonAST currentFPSection : FPSections) {
			ArrayList<IReadableVar> newParameters = convertTreeToVariables(currentFPSection);
			if (currentFPSection.getType() == Oberon0Parser.VAR){
				for(IReadableVar currentParameter : newParameters){
					currentParameter.setSourceName("mustbeset");
				}
			}
			parameters.addAll(newParameters);
		}
		return parameters;
    }
    
    private static Routine makeNewRoutineFromAST(OberonAST tree, ArrayList<IReadableVar> formalParameters) {
		String name = tree.getLeftmostChild().getLeftmostChild().getText();
		Routine routine = new Routine(name, tree, formalParameters);
		return routine;
	}

	private void execDeclarations(OberonAST tree) throws UnexpectedNodeException {
		NodeChecker.checkExpectedNodeType(Oberon0Parser.DECLARATIONS, tree.getType());
    	
		List<OberonAST> declarations = tree.getChildren();
		for (OberonAST currentDeclaration : declarations) {
			switch (currentDeclaration.getType()){
				case Oberon0Parser.VAR		: 	declareVariable(currentDeclaration);
												break;
				case Oberon0Parser.CONST	: 	declareConstant(currentDeclaration); 		
												break; 
				case Oberon0Parser.PROCEDURE: 	declareProcedure(currentDeclaration);
												break;
				default 	:
						throw new UnsupportedOperationException("Declaration of node " +
								currentDeclaration.getText()+"<"+currentDeclaration.getType()+"> not handled");
			}
		}
	}
	
	private void declareProcedure(OberonAST tree) throws UnexpectedNodeException {
		NodeChecker.checkExpectedNodeType(Oberon0Parser.PROCEDURE, tree.getType());
		
		ArrayList<IReadableVar> formalParameters = getFormalParametersFromAST((OberonAST) tree.getChild(1));
		Routine procedure = makeNewRoutineFromAST(tree, formalParameters);
		
		_routineSpace.add(procedure.getName(), procedure);
	}
	
	private void declareConstant( OberonAST tree) throws UnexpectedNodeException{
		NodeChecker.checkExpectedNodeType(Oberon0Parser.CONST, tree.getType());
		
		String name = tree.getLeftmostChild().getText();
		int constantValue = Integer.parseInt(tree.getRightmostChild().getText());
		
		_variableSpace.add(new ConstantVar(name, constantValue));
	}
	
	private void declareVariable( OberonAST tree) throws UnexpectedNodeException{
		NodeChecker.checkExpectedNodeType(Oberon0Parser.VAR, tree.getType());
		
		ArrayList<IReadableVar> variables = convertTreeToVariables(tree);
		for (IReadableVar currentVar : variables) {
			_variableSpace.add(currentVar);
		}
	}

	private ArrayList<IReadableVar> convertTreeToVariables(OberonAST tree) throws UnexpectedNodeException
	{
		int[] allowedTypes =  new int[]{Oberon0Parser.VAR, Oberon0Parser.REFVAR};
		NodeChecker.checkExpectedNodeType(allowedTypes, tree.getType());
		
		ArrayList<IReadableVar> varList = new ArrayList<IReadableVar>();
		String typeString = tree.getRightmostChild().toString();
		VariableTypes type = VariableTypes.valueOf(typeString);
		ArrayList<String> names = new ArrayList<String>();
		names = IdentList.getNamesFromIDENTLISTNode(tree.getLeftmostChild());
		for (String name : names){
			IReadableVar newVariable = null;
			switch (type){
				case INTEGER:	newVariable = new IntegerVar(name);
								break;
				case BOOLEAN:	newVariable = new BooleanVar(name);
								break;
				case ARRAY:		OberonAST arrayNode = tree.getRightmostChild();
								IReadableVar arraySizeVariable = (IReadableVar) exec(arrayNode.getLeftmostChild());
								int arraySize = (Integer) arraySizeVariable.getValue(); 
								newVariable = new ArrayVar(name, arraySize);	
								break;
				default: throw new UnsupportedOperationException("Failed to declare variable of type "+
						type+" ( name " + name + " )");
			}
			varList.add(newVariable);
		}
		return varList;
	}

    private void execAssignment(OberonAST tree) throws NotInScopeException, UnexpectedNodeException, IllegalVariableValueException {
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.ASSIGNMENT, tree.getType());
    	
        OberonAST lhs = tree.getLeftmostChild();   								// get operands
        IReadableVar assignToVar= _variableSpace.get(lhs.getText());		
        OberonAST expression = tree.getRightmostChild();
        IReadableVar newVal = (IReadableVar) exec(expression);
        if (assignToVar.getType() == VariableTypes.ARRAY){
        	IReadableVar selectorVar = (IReadableVar) exec(lhs.getLeftmostChild());
        	((ArrayVar) assignToVar).setValueAtSelector(selectorVar, newVal);
        }   
        else{
        	((IWriteableVar) assignToVar).setValue(newVal.getValue());
        }
        _variableSpace.update(assignToVar);         							// store
    }
    
    private void execWhileBlock(OberonAST tree) throws UnexpectedNodeException {
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.WHILE, tree.getType());
    	
        OberonAST conditionTree = tree.getLeftmostChild();
        OberonAST bodyTree = tree.getRightmostChild();
        Boolean evaluatedCondition = evaluateConditionFromAST(conditionTree);
        while ( evaluatedCondition ) {
            exec(bodyTree);
            evaluatedCondition = evaluateConditionFromAST(conditionTree);
        }
    }

    private void execIfBlock(OberonAST tree) throws UnexpectedNodeException {
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.IFBLOCK, tree.getType());
    	
    	List<OberonAST> ifBlockTrees = tree.getChildren();
    	Boolean passedPreviousCondition = false;
        for (OberonAST currentTreeNode : ifBlockTrees) {
        	switch(currentTreeNode.getType()){
	        	case Oberon0Parser.IF:
	        	case Oberon0Parser.ELSIF:
	        		if (evaluateConditionFromAST(currentTreeNode.getLeftmostChild())){
	        			passedPreviousCondition = true;
	        			exec(currentTreeNode.getRightmostChild());
	        		}
	        		break;
	        	case Oberon0Parser.ELSE:
	        		exec(currentTreeNode.getLeftmostChild());
	        		break;
	        	default: throw new UnsupportedOperationException("Failed to process "+
	        			currentTreeNode.getType() + "  within If-block\n");
        	}
        	if (passedPreviousCondition){
        		break;
        	}
        }
    }
    
    private boolean evaluateConditionFromAST(OberonAST tree) throws UnexpectedNodeException{
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.CONDITION, tree.getType());
    	
    	Boolean outcome = (Boolean)evaluateExpressionFromAST(tree.getLeftmostChild()).getValue();
        return outcome;
    }

    private IReadableVar evaluateExpressionFromAST(OberonAST tree) {
    	int expressionType = tree.getType();
        IReadableVar lhsVar = (IReadableVar) exec( tree.getLeftmostChild()  );
        IReadableVar rhsVar = (IReadableVar) exec( tree.getRightmostChild() );
        return Evaluator.evaluateExpression(expressionType, lhsVar, rhsVar);
    }
    
    private IReadableVar getVarWithOptionalSelector(OberonAST tree) throws NotInScopeException, UnexpectedNodeException{
    	NodeChecker.checkExpectedNodeType(Oberon0Parser.IDENT, tree.getType());
    	
    	IReadableVar variable = _variableSpace.get(tree.getText());
    	if(tree.getChildCount()>0){													//if it has a child
	    	if (tree.getLeftmostChild().getType() == Oberon0Parser.SELECTOR){		//and that child is a selector
	    		IntegerVar Selector = (IntegerVar) exec(tree.getLeftmostChild());
	    		return ((ISelectorableVar) variable).getValueAtSelector(Selector);
	    	}
    	}
    	return variable;
    }
    
    public String getName(){
    	return _name;
    }
    
    public OberonAST getRoot(){
    	return _root;
    }
}
