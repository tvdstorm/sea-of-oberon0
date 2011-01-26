package oberon0;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

import oberon0.exceptions.IllegalVariableValueException;
import oberon0.exceptions.SymbolNotInScopeException;
import oberon0.grammar.*;
import oberon0.listener.InterpreterListener;
import oberon0.variables.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;


/*
 * TODO - Make array work for multiple datatypes (is now always array of integers)
 * TODO - Make const work for multiple data
 * TODO - Fix Memory Model
 *  		- Use the getters and setters of Variable (would be safer for CONSTANT usage!)
 * TODO - Fix Procedure declarations
 * TODO - Fix Procedurecalls
 * TODO - builtin Procedures
 * TODO - something something RECORD ?
 * TODO - Allow declaration of BOOLEAN in grammar (not specified directly)
 * TODO - A nice way of assigning to arrays (instead of making a copy of the entire array
 * TODO - Correct use of listener + exceptions
 * 
 * TODO - change all 't' in tree?
 * 
 * TODO - put everything in right package  
 * 
 * TODO - refactor
 * TODO - sort grammar + tokens
 * TODO - document
 * TODO - read assignment for more TODO's
 */

public class Oberon0Interpreter{
    private InterpreterListener listener = 						// default response to messages
        new InterpreterListener();

    /** An adaptor that tells ANTLR to build OberonAST nodes */
    public static TreeAdaptor Oberon0Adaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new OberonAST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((OberonAST)t).token);
        }
        public Object errorNode(TokenStream input, Token start, Token stop,
                                RecognitionException e){
            return new Oberon0ErrorNode(input, start, stop, e);
        }
    };
  
    GlobalScope globalScope;   									// global scope is filled by the parser
    VariableSpace globals = new VariableSpace("globals");       // global memory
    VariableSpace currentSpace = globals;
    Stack<RoutineSpace> stack = new Stack<RoutineSpace>();		// call stack
    OberonAST root;               								// the AST represents our code memory
    TokenRewriteStream tokens;
    Oberon0Lexer lex;              								// lexer/parser are part of the processor
    Oberon0Parser parser;

    public void interp(ANTLRFileStream inputfile) throws RecognitionException, IOException {
        globalScope = new GlobalScope();
        lex = new Oberon0Lexer(inputfile);
        tokens = new TokenRewriteStream(lex);
        parser = new Oberon0Parser(tokens);
        parser.setTreeAdaptor(Oberon0Adaptor);
        Oberon0Parser.oberonprogram_return r = parser.oberonprogram();
        if ( parser.getNumberOfSyntaxErrors()==0 ) {
            root = (OberonAST)r.getTree();
            programBlock(root);
            root.printTree();
        }
    }

	/** visitor dispatch according to node token type */
    private Object exec(OberonAST t) {
    	t.printRootNode();
        try {
            switch ( t.getType() ) {
                case Oberon0Parser.ASSIGNMENT	: assign(t); 
                									break;
                case Oberon0Parser.IFBLOCK 		: ifblock(t); 
                									break;
                case Oberon0Parser.WHILE 		: whileblock(t); 
                									break;
                case Oberon0Parser.PROCEDURECALL: ignoreBranch(t); break;//return procedurecall(t);
                case Oberon0Parser.MODULE		: module (t);
                									break;
                case Oberon0Parser.DECLARATIONS : declare(t);
                									break;
                case Oberon0Parser.SELECTOR		: return exec(t.getLeftmostChild());
                case Oberon0Parser.EQUALS 		: 
                case Oberon0Parser.SMALLERTHEN	: 
                case Oberon0Parser.SMALLEREQUAL	: 
                case Oberon0Parser.GREATERTHEN	:
                case Oberon0Parser.GREATEREQUAL	:               
                case Oberon0Parser.ADD 			: 
                case Oberon0Parser.SUBTRACT 	: 
                case Oberon0Parser.MULTIPLY 	: 
                case Oberon0Parser.DIVIDE	 	: return evaluateExpression(t);
                
                case Oberon0Parser.BODY			:
                case Oberon0Parser.PROCEDURE	: ignoreBranch(t);
													break;
				
                case Oberon0Parser.CONDITION	: evaluateCondition(t);
                									break;
               
                case Oberon0Parser.INTEGER		: return new IntegerVariable(Integer.parseInt(t.getText()));
                case Oberon0Parser.IDENT		: return findSymbolValueInScope(t);
                default : 										// catch unhandled node types
                    throw new UnsupportedOperationException("Node "+
                        t.getText()+"<"+t.getType()+"> not handled");
            }
        }
        catch (Exception e) {
            listener.error("problem executing "+t.toStringTree(), e);
        }
        return null;
    }
   
    private void ignoreBranch(OberonAST t){
    	System.out.print("->ignored: "+ t + "\n");
    	List<OberonAST> statements = t.getChildren();
		for (OberonAST x : statements) {
			exec(x);
		}
    }
  

	private void module(OberonAST t) {
		t.deleteChild(0);										//modulename, not using this 
		List<OberonAST> stats = t.getChildren();
        for (OberonAST x : stats) {
        	exec(x);
        }
	}
	
	 private void declare(OberonAST t) {
		if (t.getChildCount() > 0){
			List<OberonAST> declarations = t.getChildren();
			for (OberonAST declaration : declarations) {
				addDeclaration(declaration);
			}
		}
	}
	 
	private void addDeclaration(OberonAST t){
		OberonAST namechild = (OberonAST) t.getLeftmostChild();
		String name = namechild.getText();
		switch (t.getType()){
			case Oberon0Parser.VAR		: 	VariableTypes type = VariableTypes.valueOf(t.getRightmostChild().toString());
											declareVariable(t, type, name);
											break;
			case Oberon0Parser.CONST	: 	declareVariable(t, VariableTypes.CONSTANT, name); 		
											break; 
			case Oberon0Parser.PROCEDURE: 	//declareVariable(name, new RoutineSymbol(name));
											//TODO add procedures here
											break;
			default 	:
					throw new UnsupportedOperationException("Declaration of node " +
							t.getText()+"<"+t.getType()+"> not handled");
		}	 
	}
	
	private void declareVariable(OberonAST t, VariableTypes type, String name)
	{
		IVariable newVariable = null;
		switch (type){
			case INTEGER:	newVariable = new IntegerVariable();
							break;
			case BOOLEAN:	newVariable = new BooleanVariable();
							break;
			case CONSTANT:	int constantValue = Integer.parseInt(t.getRightmostChild().getText());
							newVariable = new ConstantVariable(constantValue);	
							break;
			case ARRAY:		OberonAST arrayNode = t.getRightmostChild();
							IVariable sizeVariable = (IVariable) exec(arrayNode.getLeftmostChild());
							int arraySize = (Integer) sizeVariable.getValue(); 
							newVariable = new ArrayVariable(arraySize);	
							break;
			default: throw new UnsupportedOperationException("Failed to declare variable of type "+
					type+" ( name " + name + " )");
		}
		currentSpace.put(name, newVariable);
		System.out.print("New variable with name: " + name + "\t declared: ") ; newVariable.print();
	}


	public void programBlock(OberonAST t) {
        if ( t.getType()!=Oberon0Parser.OBERONPROGRAM ) {
            listener.error("not a block: "+t.toStringTree());
        }
        List<OberonAST> stats = t.getChildren();
        for (OberonAST x : stats) exec(x);
    }
    
    public IVariable findSymbolValueInScope(OberonAST t){
    	VariableSpace space = getSpaceWithSymbol(t.getText());
    	return space.get(t.toString());
    }

    private void assign(OberonAST t) throws SymbolNotInScopeException {
        OberonAST lhs = t.getLeftmostChild();   					// get operands
        IVariable oldVariable= findSymbolValueInScope(lhs);
        OberonAST expression = t.getRightmostChild();
        IVariable newVariable = (IVariable) exec(expression);      // walk/evaluate expression
        if (oldVariable.getType() == VariableTypes.ARRAY){
        	assignArray(lhs, oldVariable, newVariable);
        }   
        else{
            VariableSpace space = getSpaceWithSymbol(lhs.getText());
            if ( space==null ) {
            	throw new SymbolNotInScopeException(lhs.getText());
            }
            space.put(lhs.getText(), newVariable);         			// store
        }
    }
    
    private void assignArray(OberonAST lhs, IVariable oldVariable, IVariable newVariable ) throws SymbolNotInScopeException{
    	VariableSpace space = getSpaceWithSymbol(lhs.getText());
        if ( space==null ) {
        	throw new SymbolNotInScopeException(lhs.getText());
        }
    	lhs.getLeftmostChild().printRootNode();
    	IVariable selectorVariable = (IVariable) exec(lhs.getLeftmostChild());
    	int arrayIndex = (Integer) selectorVariable.getValue(); 
    	int[] newArray= (int[]) oldVariable.getValue();
    	newArray[arrayIndex] = (Integer) newVariable.getValue();
    	ArrayVariable newArrayVariable = new ArrayVariable(((ArrayVariable) oldVariable).getLength());
    	try {
			newArrayVariable.setValue(newArray);
		} catch (IllegalVariableValueException e) {
			listener.error("Illegal value", e);
		}
		space.put(lhs.getText(), newArrayVariable);         	// store
    }
    
    private void whileblock(OberonAST t) {
        OberonAST conditionTree = (OberonAST)t.getLeftmostChild();
        OberonAST bodyTree = (OberonAST)t.getRightmostChild();
        Boolean evaluatedCondition = evaluateCondition(conditionTree);
        while ( evaluatedCondition ) {
            exec(bodyTree);
            evaluatedCondition = evaluateCondition(conditionTree);
        }
    }

    public void ifblock(OberonAST t) {
    	List<OberonAST> ifBlockTree = t.getChildren();
    	Boolean passedPreviousCondition = false;
        for (OberonAST astNode : ifBlockTree) {
        	switch(astNode.getType()){
	        	case Oberon0Parser.IF:
	        	case Oberon0Parser.ELSIF:
	        		if (evaluateCondition(astNode.getLeftmostChild())){
	        			passedPreviousCondition = true;
	        			exec(astNode.getRightmostChild());
	        		}
	        		break;
	        	case Oberon0Parser.ELSE:
	        		exec(astNode.getLeftmostChild());
	        		break;
	        	default: throw new UnsupportedOperationException("Failed to process "+
	        			astNode.getType() + "  within If-block\n");
        	}
        	if (passedPreviousCondition){
        		System.out.print("Some condition passed");
        		break;
        	}
        }
    }
    
    public boolean evaluateCondition(OberonAST t)
    {
    	Boolean c = (Boolean)evaluateExpression(t.getLeftmostChild()).getValue();
        if ( ((Boolean)c).booleanValue() ){
        	return true;
        }
        else {
        	return false;
        }
    }

    public IVariable evaluateExpression(OberonAST t) {
    	int expressiontype = t.getType();
        IVariable lhs = (IVariable) exec( (OberonAST)t.getLeftmostChild()  );
        IVariable rhs = (IVariable) exec( (OberonAST)t.getRightmostChild() );
        int x = (Integer) lhs.getValue();
        int y = (Integer) rhs.getValue();
        switch (expressiontype) {
            //calculations
        	case Oberon0Parser.ADD 			: return new IntegerVariable(x + y);
            case Oberon0Parser.SUBTRACT 	: return new IntegerVariable(x - y);
            case Oberon0Parser.MULTIPLY		: return new IntegerVariable(x * y);
            case Oberon0Parser.DIVIDE		: return new IntegerVariable(x / y);
            //comparisons
            case Oberon0Parser.EQUALS 		: return new BooleanVariable(x == y);
            case Oberon0Parser.SMALLERTHEN	: return new BooleanVariable(x < y);
            case Oberon0Parser.SMALLEREQUAL	: return new BooleanVariable(x <= y);
            case Oberon0Parser.GREATERTHEN	: return new BooleanVariable(x > y);
            case Oberon0Parser.GREATEREQUAL	: return new BooleanVariable(x >= y);
            default: throw new UnsupportedOperationException("Failed to process "+
            		expressiontype + " (on "+ x + " and " + y + ")\n");
        }
    }

    /** Return scope holding id's value; current func space or global. */
    public VariableSpace getSpaceWithSymbol(String id) {
        if ( globals.get(id)!=null ) {
        	return globals;        // in globals?
        }
        return null;                                        // nowhere
    }
    
    
    /*======================================
     * THE TERRENCE PARR - CODEGRAVEYARD
     *======================================*/
    //TODO: Delete the graveyard
    
    /*    public void arrayassign(OberonAST lhs, Object value) {
	OberonAST o = (OberonAST) lhs.getChild(0);
	OberonAST f = (OberonAST) lhs.getChild(1);
    String fieldname = f.getText();
    Object a = load(o);
    if ( !(a instanceof ArrayInstance) ) {
        // make a good error message:
        String leftpart = parser.input.toString(lhs.getTokenStartIndex(),
                                                lhs.getTokenStopIndex()-2);
        String all = parser.input.toString(lhs.getTokenStartIndex(),
                                           lhs.getTokenStopIndex());
        listener.error(leftpart+" is not a struct in "+all, o.token);
        return;
    }
    ArrayInstance array = (ArrayInstance)a;
    if ( array.getDef().resolveMember(fieldname) == null ) {
        listener.error("can't assign; "+array.getName()+" has no "+fieldname+
                       " field", f.token);
        return;
    }
//    array.put(fieldname, value);
}*/
    
    /*   public Object fieldload(OberonAST t) { 					// E.g., a.b in tree ^('.' a b)
	OberonAST expr = (OberonAST)t.getChild(0); 			// get left node or subtree
	OberonAST b = (OberonAST)t.getChild(1);    			// must be an ID node
    String id = b.getText();
    ArrayInstance struct = (ArrayInstance)load(expr); 	// find expr
    if ( struct.getDef().resolveMember(id)==null ) { 	// is it a struct?
        listener.error(struct.getName()+" has no "+id+" field", b.token);
        return null;
    }
    return struct.get(id);
}*/

/*public Object load(OberonAST t) {
    if ( t.getType()==Oberon0Parser.SELECTOR ) {
    	return fieldload(t);
    }
    VariableSpace s = getSpaceWithSymbol(t.getText()); 	// just a not a.b
    if ( s!=null ) return s.get(t.getText());
    listener.error("no such variable "+t.getText(), t.token);
    return null;
}*/
    /*public Object procedurecall(OberonAST t) {
    // Resolve function's name
    String pname = t.getChild(0).getText();
    RoutineSymbol procedure = (RoutineSymbol)t.scope.resolve(pname);
    if ( procedure==null ) {
        listener.error("no such function "+pname, t.token);
        return null;
    }
    RoutineSpace procedureSpace = new RoutineSpace(procedure);
    MemorySpace saveSpace = currentSpace;
    currentSpace = procedureSpace;

    int argCount = t.getChildCount()-1;
    // check for argument compatibility
    if ( procedure.formalArgs==null && argCount>0 || 		// args compatible?
    		procedure.formalArgs!=null && procedure.formalArgs.size()!=argCount ) {
        listener.error("function "+procedure.name+" argument list mismatch");
        return null;
    }
    int i = 0; 												// define args according to order in formalArgs
    for (BaseSymbol argS : procedure.formalArgs.values()) {
        VariableSymbol arg = (VariableSymbol)argS;
        OberonAST ithArg = (OberonAST)t.getChild(i+1);
        Object argValue = exec(ithArg);
//        procedureSpace.put(arg.name, argValue);
        i++;
    }
    Object result = null;
    stack.push(procedureSpace);        						// PUSH new arg, local scope
    try { exec(procedure.blockAST); } 						// do the call
    catch (ReturnValue rv) { result = rv.value; } 			// trap return value
    stack.pop();               								// POP arg, locals
    currentSpace = saveSpace;
    return result;
}
*/
}
