package language;

import java.util.ArrayList;
import java.util.List;

import language.parser.oberonLexer;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class AstNodeFactory {

	private AstNodeFactory() {}
	
	
	//
	public static AnProcDecl createProcDecl(BaseTree parentTree) throws Exception{		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.PROCDECL);
		
		//Procheader gerelateerd
		BaseTree btProcHeader = getChildOfType(tree, oberonLexer.PROCHEAD);
		assert(btProcHeader != null);
		assert(btProcHeader.getChildCount() >= 1);
		
		String name = getIdentNameFromTree(tree);
		
		List<AnIdentParam> formalParams = createAnFormalParams(btProcHeader);
		
		//Procbody gerelateerd
		BaseTree btProcBody = getChildOfType(tree, oberonLexer.PROCBODY);
		assert(btProcBody != null);
		
		List<AnIdentConst> constDecls = createAnConstDelcs(tree); 
		List<AnTypeDecl> typeDecls = createAnTypeDecls(tree);
		List<AnIdent> varDecls = createAnVarDecls(tree);
		List<AnProcDecl> procDecls = createListOfAnProcDecl(tree);
		List<IStatement> statementSeq = createAnStatementSequence(tree);
		
		return new AnProcDecl(name, constDecls, typeDecls, varDecls, procDecls, formalParams, statementSeq);
	}

	//
	public static List<AnProcDecl> createListOfAnProcDecl(BaseTree parentTree) throws Exception{
		List<BaseTree> children = getChildrenOfType(parentTree, oberonLexer.PROCDECL);
		List<AnProcDecl> procDecls = new ArrayList<AnProcDecl>();
		
		for (BaseTree child : children){
			procDecls.add(createProcDecl(child));
		}
		
		return procDecls;
	}

	//
	public static List<AnIdent> createAnVarDecls(BaseTree parentTree){
		BaseTree tree = getChildOfType(parentTree, oberonLexer.VARS);		
		return createAnVarDeclsList(tree);
	}
	
	//
	public static List<AnIdent> createAnVarDeclsList(BaseTree parentTree){
		List<AnIdent> idents = new ArrayList<AnIdent>();
		
		List<BaseTree> children = getChildrenOfType(parentTree, oberonLexer.VAR);
		for(BaseTree child : children){
			idents.add(createIdent(child, getTypeFromTree(child)));
		}
		
		return idents;
	}
	
	//
	public static List<AnTypeDecl> createAnTypeDecls(BaseTree parentTree){
		List<AnTypeDecl> identList = new ArrayList<AnTypeDecl>();
		if (parentTree == null) {return identList;}
		//oberonLexer.TYPES
		return null;
	}
	
	//
	public static List<AnIdentConst> createAnConstDelcs(BaseTree parentTree) throws Exception{
		BaseTree tree = getChildOfType(parentTree, oberonLexer.CONSTS);
		
		List<AnIdentConst> constsList = new ArrayList<AnIdentConst>();
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.CONST);
		for (BaseTree child : children){
			constsList.add(createAnIdentConst(child));
		}
		return constsList;
	}
	
	//
	public static AnIdentConst createAnIdentConst(BaseTree parentTree) throws Exception{
		AnExpression expr = createAnExpression(parentTree);
		return new AnIdentConst(getIdentNameFromTree(parentTree), expr.eval());
	}
	
	//
	public static List<AnIdentParam> createAnFormalParams(BaseTree parentTree){
		BaseTree tree = getChildOfType(parentTree, oberonLexer.FORMALPARAMS);
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.FPSECTION);
		
		List<AnIdentParam> params = new ArrayList<AnIdentParam>();
		
		boolean isVar;
		ValueType valType;
		for (BaseTree child : children){
			isVar = isVar(child);
			valType = getTypeFromTree(child);
			
			List<BaseTree> btIdents = getChildrenOfType(child, oberonLexer.IDENT);
			for (BaseTree btIdent : btIdents){
				params.add(createAnIdentParam(btIdent, valType, isVar));
			}
		}
		return params;
	}
	
	//
	public static List<IStatement> createAnStatementSequence(BaseTree parentTree){
		BaseTree tree = getChildOfType(parentTree, oberonLexer.STATEMENTSEQ);

		List<IStatement> statements = new ArrayList<IStatement>();
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.STATEMENT);
		
		for (BaseTree child : children){
			statements.add(createIStatement(child));
		}
		
		return statements;
	}
	
	//!
	public static IStatement createIStatement(BaseTree parentTree){
		assert(parentTree != null);
		assert (parentTree.getChildCount() == 1);
		
		BaseTree btStatement = (BaseTree) parentTree.getChild(0);
		int statType = btStatement.getType();
		
		switch(statType){
			case oberonLexer.ASSIGN: return createSmtAssignment(btStatement);
			case oberonLexer.PROCCALL: return createSmtProcCall(btStatement);
			case oberonLexer.IFSTATEMENT: return createSmtIf(btStatement);
			case oberonLexer.WHILE: return createSmtWhile(btStatement);
			default: throw new UnsupportedOperationException();
		}
	}
	
	
	public static AnSmtWhile createSmtWhile(BaseTree tree){
		assert(tree != null);
		return null;
	}
	
	public static AnSmtIf createSmtIf(BaseTree tree){
		assert(tree != null);
		return null;
	}
	
	public static AnSmtProcCall createSmtProcCall(BaseTree tree){
		assert(tree != null);
		return null;
	}
	
	
	private static AnSmtAssignment createSmtAssignment(BaseTree tree){
		assert(tree != null);
		return null;
	}

	

	private static AnExpression createAnExpression(Tree tree){
		assert(tree != null);
		return createAnExpression((BaseTree) tree); 
	}
	
	//
	public static AnExpression createAnExpression(BaseTree parentTree){
		BaseTree tree = getChildOfType(parentTree, oberonLexer.EXPRESSION);
		return createSubExpression(tree);
	}
	
	//
	public static AnExpression createSubExpression(BaseTree tree){
		assert(tree != null);
		assert(tree.getChildCount() == 1 || tree.getChildCount() == 2);
		
		int exprType = tree.getType();
		switch(exprType){
			//Values
			case oberonLexer.NUMBER:
				AnValue val = createValue(tree);
				return new AnExpression(val);
			case oberonLexer.IDENTIFIER:
				//TODO HAAL IDENT UIT CONTEXT?
				IType ident = createIdent(tree);
				return new AnExpression(ident);
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
				if (numChildren == 2){
					return new AnExpression(exprType, createAnExpression(tree.getChild(0)), createAnExpression(tree.getChild(1)));
				} else {
					return new AnExpression(exprType, createAnExpression(tree.getChild(0)));
				}
			default: throw new UnsupportedOperationException();
		}
		
	}
	
	private static AnIdent createIdent(BaseTree parentTree, ValueType valType){
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.IDENT);
		return new AnIdent(tree.toString(), valType);
	}
	
	private static AnIdentParam createAnIdentParam(BaseTree parentTree, ValueType valType, boolean isVar){
		assert(parentTree != null);
		
		BaseTree tree = getChildOfType(parentTree, oberonLexer.IDENT);
		return new AnIdentParam(tree.toString(), valType, isVar);
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

		@SuppressWarnings("unchecked")
		List<BaseTree> children = tree.getChildren();
		for (BaseTree child : children){
			if (child.getType() == type) {return child;}
		}
		return null;
	}
	
	private static List<BaseTree> getChildrenOfType(BaseTree tree, int type){
		List<BaseTree> goodChildren = new ArrayList<BaseTree>();
		
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
		assert(tree != null && tree.getChildCount() == 1);
		assert(tree.getType() == oberonLexer.IDENT);
		
		return tree.getChild(0).toString();
	}
	
	private static ValueType getTypeFromTree(BaseTree parentTree){
		BaseTree tree = getChildOfType(parentTree, oberonLexer.TYPE);
		assert (tree != null);
		return tokenToValueType(tree.getType());
	}
	
	//Private static BaseTree getFirstChild()
	
	private static boolean isVar(BaseTree parent){
		return (getChildOfType(parent, oberonLexer.VAR) != null);
	}
}
