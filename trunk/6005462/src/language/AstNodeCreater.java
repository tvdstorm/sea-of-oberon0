package language;

import java.util.ArrayList;
import java.util.List;

import language.parser.oberonLexer;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class AstNodeCreater {

	private AstNodeCreater() {}
	
	public static AnModule createModule(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.MODULE);
		
		String moduleName = getIdentNameFromTree(tree);
		AnContext decls = createDeclarations(tree);		
		List<IStatement> statementSeq = createAnStatementSequence(tree);
		return new AnModule(moduleName, decls, statementSeq);
	}
	
	public static AnContext createDeclarations(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		BaseTree btDecls = getChildOfType(parentTree, oberonLexer.DECLARATIONS);
		assert(btDecls != null);
		
		List<AnIdentDecl> constDecls = createAnConstDelcs(btDecls, new AnEnvironment()); 
		List<AnTypeDecl> typeDecls = createAnTypeDecls(btDecls);
		List<AnIdentDecl> varDecls = createAnVarDecls(btDecls);
		List<AnProcDecl> procDecls = createListOfAnProcDecl(btDecls);
		
		
		AnContext ctxt = new AnContext();
		ctxt.setIdents(constDecls);
		ctxt.setIdents(varDecls);
		ctxt.setTypes(typeDecls);
		ctxt.setProcs(procDecls);
		return ctxt;
	}
	//
	public static AnProcDecl createProcDecl(BaseTree parentTree) throws Exception{		
		assert(parentTree != null);
		
		BaseTree tree;
		if (parentTree.getType() == oberonLexer.PROCDECL){
			tree = parentTree;
		} else {
			tree = getChildOfType(parentTree, oberonLexer.PROCDECL);
		}
		
		//Procheader gerelateerd
		BaseTree btProcHeader = getChildOfType(tree, oberonLexer.PROCHEAD);
		assert(btProcHeader != null);
		assert(btProcHeader.getChildCount() >= 1);
		
		String name = getIdentNameFromTree(btProcHeader);
		
		List<AnIdentDecl> formalParams = createAnFormalParams(btProcHeader);
		
		//Procbody gerelateerd
		BaseTree btProcBody = getChildOfType(tree, oberonLexer.PROCBODY);
		assert(btProcBody != null);
		AnContext ctxt = createDeclarations(btProcBody);
		List<IStatement> statementSeq = createAnStatementSequence(btProcBody);
		
		return new AnProcDecl(name, ctxt, formalParams, statementSeq);
	}

	//
	public static List<AnProcDecl> createListOfAnProcDecl(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		List<BaseTree> children = getChildrenOfType(parentTree, oberonLexer.PROCDECL);
		List<AnProcDecl> procDecls = new ArrayList<AnProcDecl>();
		
		for (BaseTree child : children){
			procDecls.add(createProcDecl(child));
		}
		
		return procDecls;
	}

	//
	public static List<AnIdentDecl> createAnVarDecls(BaseTree parentTree){
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.VARS);		
		return createAnVarDeclsList(tree);
	}
	
	//
	public static List<AnIdentDecl> createAnVarDeclsList(BaseTree parentTree){
		List<AnIdentDecl> idents = new ArrayList<AnIdentDecl>();
		
		List<BaseTree> vars = getChildrenOfType(parentTree, oberonLexer.VAR);
		for (BaseTree var: vars){
			idents.addAll(createIdentDeclList(var, getTypeFromTree(var)));
		}
		return idents;
	}
	
	public static List<AnIdentDecl> createIdentDeclList(BaseTree parentTree, ValueType type){
		List<AnIdentDecl> idents = new ArrayList<AnIdentDecl>();
		
		List<BaseTree> btIdents = getChildrenOfType(parentTree, oberonLexer.IDENTIFIER);
		for (BaseTree btIdent : btIdents){
			idents.add(new AnIdentDecl(getIdentNameFromTree(btIdent), type));
		}
		
		return idents;
	}
	
	//
	public static List<AnTypeDecl> createAnTypeDecls(BaseTree parentTree){
		List<AnTypeDecl> identList = new ArrayList<AnTypeDecl>();
		if (parentTree == null) {return identList;}
		// TODO >
		//oberonLexer.TYPES
		return null;
	}
	
	//
	public static List<AnIdentDecl> createAnConstDelcs(BaseTree parentTree, AnEnvironment env) throws Exception{
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.CONSTS);
		
		List<AnIdentDecl> constsList = new ArrayList<AnIdentDecl>();
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.CONST);
		for (BaseTree child : children){
			constsList.add(createAnIdentConst(child, env));
		}
		return constsList;
	}
	
	//
	public static AnIdentDecl createAnIdentConst(BaseTree parentTree, AnEnvironment env) throws Exception{
		assert(parentTree != null);
		
		AnExpression expr = createAnExpression(parentTree);
		AnValue val = expr.eval(env);
		AnIdentDecl ident = new AnIdentDecl(getIdentNameFromTree(parentTree), val.getType());
		ident.assign(val);
		ident.setConst(true);
		return ident;
	}
	
	//
	public static List<AnIdentDecl> createAnFormalParams(BaseTree parentTree){
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.FORMALPARAMS);
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.FPSECTION);
		
		List<AnIdentDecl> params = new ArrayList<AnIdentDecl>();
		
		boolean isVar;
		ValueType valType;
		for (BaseTree child : children){
			isVar = isVar(child);
			valType = getTypeFromTree(child);
			
			List<BaseTree> btIdents = getChildrenOfType(child, oberonLexer.IDENTIFIER);
			for (BaseTree btIdent : btIdents){
				params.add(createAnIdentParam(btIdent, valType, isVar));
			}
		}
		return params;
	}
	
	//
	public static List<IStatement> createAnStatementSequence(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		List<IStatement> statements = new ArrayList<IStatement>();
		BaseTree tree = getChildOfType(parentTree, oberonLexer.STATEMENTSEQ);

		if (tree == null) { return null; }
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.STATEMENT);
		
		for (BaseTree child : children){
			statements.add(createIStatement(child));
		}
		
		return statements;
	}
	
	//!
	public static IStatement createIStatement(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		assert (parentTree.getChildCount() == 1);
		
		BaseTree btStatement = (BaseTree) parentTree.getChild(0);
		int statType = btStatement.getType();
		
		switch(statType){
			case oberonLexer.ASSIGN: return createSmtAssignment(btStatement);
			case oberonLexer.PROCCALL: return createSmtProcCall(btStatement);
			case oberonLexer.IFSTATEMENT: return createSmtIf(btStatement);
			case oberonLexer.WHILE: return createSmtWhile(btStatement);
			case oberonLexer.ASSERT: return createSmtAssert(btStatement);
			default: throw new UnsupportedOperationException();
		}
	}
	
	public static AnSmtAssert createSmtAssert(BaseTree tree){
		assert(tree != null);
		assert(tree.getType()== oberonLexer.ASSERT);
		
		AnExpression condition = createAnExpression(tree);
		return new  AnSmtAssert(condition, tree.toStringTree());
	}
	
	public static AnSmtWhile createSmtWhile(BaseTree tree) throws Exception{
		assert(tree != null);
		assert(tree.getType()== oberonLexer.WHILE);

		AnExpression condition = createAnExpression(tree);
		List<IStatement> statements = createAnStatementSequence(tree);
		return new AnSmtWhile(condition, statements);
	}
	
	public static AnSmtIf createSmtIf(BaseTree tree) throws Exception{
		assert(tree != null);
		assert(tree.getType()== oberonLexer.IFSTATEMENT);
		
		AnExpression condition = createAnExpression(tree);
		List<IStatement> statements = createAnStatementSequence(tree);
		return new AnSmtIf(condition, statements);
	}
	
	
	//->  ^(PROCCALL identSelector actualParameters?) ;
	public static AnSmtProcCall createSmtProcCall(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		BaseTree tree;
		if (parentTree.getType() == oberonLexer.PROCCALL){
			tree = parentTree;
		} else {
			tree = getChildOfType(parentTree, oberonLexer.PROCCALL);
		}
		assert(tree != null);
		List<AnExpression> actualParams = createActualParams(tree);
		return new AnSmtProcCall(getIdentNameFromTree(tree), actualParams);
	}
	
	
	private static List<AnExpression> createActualParams(BaseTree parentTree) throws Exception{
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.ACTUALPARAMS);
		
		List<AnExpression> actualParams = new ArrayList<AnExpression>();
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.EXPRESSION);
		AnExpression expr;
		for (BaseTree child : children){
			expr = createSubExpression(child);
			actualParams.add(expr);
		}
		
		return actualParams;
	}
	
	private static AnSmtAssignment createSmtAssignment(BaseTree parentTree){
		assert(parentTree != null);
		assert(parentTree.getType() == oberonLexer.ASSIGN);
		
		String lhsName = getIdentNameFromTree(parentTree);
		AnExpression expr = createAnExpression(parentTree);
		return new AnSmtAssignment(lhsName, expr);
	}

	

	private static AnExpression createAnExpression(Tree tree){
		assert(tree != null);
		return createAnExpression((BaseTree) tree); 
	}
	
	private static AnExpression createSubExpression(Tree tree){
		assert(tree != null);
		return createSubExpression((BaseTree) tree); 
	}
	
	public static AnExpression createAnExpression(BaseTree parentTree){
		assert(parentTree != null);
		
		BaseTree tree;
		if (parentTree.getType() != oberonLexer.EXPRESSION) {
			tree = getChildOfType(parentTree, oberonLexer.EXPRESSION);
		} else {
			tree = parentTree;
		}
		assert (tree.getChildCount() >= 1);
		return createSubExpression(tree.getChild(0));
	}
	
	//
	public static AnExpression createSubExpression(BaseTree tree){
		assert(tree != null);
		assert(tree.getChildCount() == 1 || tree.getChildCount() == 2);
		
		String stringRepr = tree.toStringTree();
		int exprType = tree.getType();
		switch(exprType){
			//Values
			case oberonLexer.NUMBER:
				AnValue val = createValue(tree);
				return new AnExpression(val, stringRepr);
			case oberonLexer.IDENTIFIER:
				IType ident = createIdent(tree);
				return new AnExpression(ident, stringRepr);
			//Expressions that include an operator
			case oberonLexer.EXPRESSION:
				return createAnExpression(tree);
			case oberonLexer.PLUS:
			case oberonLexer.MIN:
			case oberonLexer.TILDEFACTOR:
			case oberonLexer.MULT:
			case oberonLexer.DIV:
			case oberonLexer.MOD:
			case oberonLexer.AMP:
			case oberonLexer.OR:
			case oberonLexer.EQ:
			case oberonLexer.HASH:
			case oberonLexer.LT:
			case oberonLexer.LTEQ:
			case oberonLexer.GT:
			case oberonLexer.GTEQ:
				int numChildren = tree.getChildren().size();
				assert (numChildren == 1 || numChildren == 2);
				AnExpression lhs = createSubExpression(tree.getChild(0));
				if (numChildren == 2){
					AnExpression rhs = createSubExpression(tree.getChild(1));
					return new AnExpression(exprType, lhs, rhs, stringRepr);
				} else {
					return new AnExpression(exprType, lhs, stringRepr);
				}
			default: throw new UnsupportedOperationException();
		}
		
	}
	
	private static AnIdent createIdent(BaseTree parentTree){
		assert(parentTree != null);
		return new AnIdent(getIdentNameFromTree(parentTree));
	}
	
	private static AnIdentDecl createAnIdentParam(BaseTree parentTree, ValueType valType, boolean isVar){
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.IDENT);
		AnIdentDecl param = new AnIdentDecl(tree.toString(), valType);
		param.setVar(isVar);
		return param;
	}
	
	private static AnValue createValue(BaseTree tree){
		assert(tree != null);
		assert (tree.getChildCount() == 1);
		
		String strVal = tree.getChild(0).toString();
		int valType = tree.getType();
		switch(valType){
			case oberonLexer.NUMBER:
				return new AnValue(Integer.parseInt(strVal));
			default: 
				new UnsupportedOperationException();
				return null;	
		}
	}
	
	private static BaseTree getChildOfType(BaseTree tree, int type){
		assert(tree != null);
		
		@SuppressWarnings("unchecked")
		List<BaseTree> children = tree.getChildren();
		for (BaseTree child : children){
			if (child.getType() == type) {return child;}
		}
		return null;
	}
	
	private static List<BaseTree> getChildrenOfType(BaseTree tree, int type){
		List<BaseTree> goodChildren = new ArrayList<BaseTree>();
		if (tree == null){ return goodChildren; }
		
		@SuppressWarnings("unchecked")
		List<BaseTree> children = tree.getChildren();
		for (BaseTree child : children){
			if (child.getType() == type) {
				goodChildren.add(child);
			}
		}
		return goodChildren;
	}
	
	private static ValueType tokenToValueType(int token){
		switch(token){
			case oberonLexer.NUMBER: return ValueType.NUMBER;
			case oberonLexer.ARRAY: return ValueType.ARRAY;
			case oberonLexer.CONST: return ValueType.CONST;
			case oberonLexer.RECORD: return ValueType.RECORD;
			default: throw new UnsupportedOperationException();
		}
	}
	
	private static String getIdentNameFromTree(BaseTree tree){
		assert(tree != null);
		BaseTree ident;
		if (tree.getType() == oberonLexer.IDENTIFIER) {
			ident = tree;
		} else {
			ident = getChildOfType(tree, oberonLexer.IDENTIFIER);
		}
		
		if (ident != null){
			return ident.getChild(0).toString();
		} else {
			return null;
		}
	}

	private static ValueType getTypeFromTree(BaseTree parentTree){
		assert(parentTree != null);
		BaseTree tree = getChildOfType(parentTree, oberonLexer.TYPE);
		assert (tree != null);
		assert (tree.getChildCount() == 1);
		
		String type = getIdentNameFromTree(tree);
		if (type.equals("INTEGER")) { 
			return ValueType.NUMBER; 
		} else if (type.equals("NUMBER")) { 
			return ValueType.NUMBER; 
		}
		
		BaseTree array = getChildOfType(parentTree, oberonLexer.ARRAY);
		if (array != null){
			//Dit zal niet met een valuetype op te lossen zijn. Ik kan niet grootte van array opgeven enz.
			throw new UnsupportedOperationException(); 
		}
		
		BaseTree record = getChildOfType(parentTree, oberonLexer.RECORD);
		if (record != null){
			throw new UnsupportedOperationException();
		}
		return tokenToValueType(tree.getType());
	}
	
	private static boolean isVar(BaseTree parent){
		return (getChildOfType(parent, oberonLexer.VAR) != null);
	}
}
