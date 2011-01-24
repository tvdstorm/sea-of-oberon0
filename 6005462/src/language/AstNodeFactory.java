package language;

import java.util.ArrayList;
import java.util.List;

import language.parser.oberonLexer;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class AstNodeFactory {

	private AstNodeFactory() {}
	
	private static AnExpression createExpression(Tree tree){
		assert(tree != null);
		return createExpression((BaseTree) tree); 
	}
	
	public static AnProcDecl createProcDecl(BaseTree tree){		
		//Dit gaan we allemaal uit de tree vissen NOTE: strax de lifespan verkleinen
		assert(tree != null);
		assert(tree.getChildCount() == 2);
		
		//Procheader gerelateerd
		BaseTree btProcHeader = getChildOfType(tree, oberonLexer.PROCHEAD);
		assert(btProcHeader != null);
		assert(btProcHeader.getChildCount() >= 1);
		
		String name = createIdent(getChildOfType(btProcHeader, oberonLexer.IDENT), ValueType.PROCEDURE).getName();
		AnFormalParams formalParams = createAnFormalParams(getChildOfType(btProcHeader, oberonLexer.FPSECTION));
		
		//Procbody gerelateerd
		BaseTree btProcBody = getChildOfType(tree, oberonLexer.PROCBODY);
		assert(btProcBody != null);
		
		List<AnIdent> constDecls = createAnConstDelcs(getChildOfType(tree, oberonLexer.CONST)); 
		AnTypeDecls typeDecls = createAnTypeDecls(getChildOfType(tree, oberonLexer.TYPE));
		List<AnIdent> varDecls = createAnVarDecls(getChildOfType(tree, oberonLexer.VARS));
		List<AnIdent>
		List<AnProcDecl> procDecls = createListOfAnProcDecl(getChildrenOfType(tree, oberonLexer.PROCDECL));
		AnStatementSeq statementSeq = createAnStatementSeq(getChildOfType(tree, oberonLexer.STATEMENTSEQ));
		
		return new AnProcDecl(name, constDecls, typeDecls, varDecls, procDecls, formalParams, statementSeq);
	}

	public static List<AnProcDecl> createListOfAnProcDecl(List<BaseTree> trees){
		List<AnProcDecl> procDecls = new ArrayList<AnProcDecl>();

		for (BaseTree btProcDecl: trees){
			assert(btProcDecl.getType() == oberonLexer.PROCDECL);
			procDecls.add(createProcDecl(btProcDecl));
		}
		
		return procDecls;
	}
	
	public static List<AnIdent> createAnVarDecls(BaseTree tree){
		List<AnIdent> identList = new ArrayList<AnIdent>();
		if (tree == null) {return identList;}
		
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.VAR);
		for (BaseTree child: children){
			BaseTree btIdentList = getChildOfType(child, oberonLexer.IDENTLIST);
			
			BaseTree btType = getChildOfType(tree, oberonLexer.TYPE);
			assert(btType != null && btType.getChildCount() == 1);
			ValueType valType = tokenToValueType(btType.getChild(0).getType());
			
			identList.addAll(createAnIdentList(btIdentList, valType));
		}
		
		return identList;
	}
	
	public static List<AnIdent> createAnIdentList(BaseTree tree, ValueType valType){
		assert(tree != null);
		List<AnIdent> idents = new ArrayList<AnIdent>();
		
		List<BaseTree> children = getChildrenOfType(tree, oberonLexer.IDENT);
		for (BaseTree child : children){
			idents.add(createIdent(child, valType));
		}
		
		return idents;
	}
	
	public static AnTypeDecls createAnTypeDecls(BaseTree tree){
		if (tree == null) {return null;}
		
		return null;
	}
	
	public static AnConstDelcs createAnConstDelcs(BaseTree tree){
		if (tree == null) {return null;}
		
		return null;
	}
	
	public static AnFormalParams createAnFormalParams(BaseTree tree){
		if (tree == null) {return null;}
		
		return null;
	}
	
	public static AnStatementSeq createAnStatementSeq(BaseTree tree){
		assert(tree != null);
		
		List<IStatement> statementList = new ArrayList<IStatement>();
		List<BaseTree> children = tree.getChildren();
		IStatement newStatement;
		for (BaseTree child : children){
			assert (child.getType() == oberonLexer.STATEMENT);
			newStatement = createStatement(tree);
			statementList.add(newStatement);
		}
		return new AnStatementSeq(statementList);
	}
	
	public static IStatement createStatement(BaseTree tree){
		assert(tree != null);
		assert (tree.getChildCount() == 1);
		
		BaseTree btStatement = (BaseTree) tree.getChild(0);
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
		assert (tree.getChildCount() == 2);
		
		AnIdent lhsNode = null;
		BaseTree btLhs = (BaseTree) tree.getChild(0);
		int lhsType = btLhs.getType();
		switch(lhsType){
			case oberonLexer.IDENTIFIER: lhsNode = createIdent(btLhs); break;
			case oberonLexer.DOTSELECTOR: {
				lhsNode = null; 
				throw new UnsupportedOperationException("DOTSELECTOR nog maken");
			}
			case oberonLexer.BRACKETSELECTOR: {
				lhsNode = null; 
				throw new UnsupportedOperationException("BRACKETSELECTOR nog maken");
			}
			default: {
				lhsNode = null; 
				throw new UnsupportedOperationException();
			}
		}
		
		BaseTree btExpr = (BaseTree) tree.getChild(1);
		AnExpression expr = createExpression(btExpr);
		return new AnSmtAssignment(lhsNode, expr);
	}

	
	public static AnExpression createExpression(BaseTree tree){
		assert(tree != null);
		assert(tree.getChildCount() == 1 || tree.getChildCount() == 2);
		
		int exprType = tree.getType();
		switch(exprType){
			//Values
			case oberonLexer.NUMBER:
				AnValue val = createValue(tree);
				return new AnExpression(val);
			case oberonLexer.IDENTIFIER:
				IType ident = createIdent(tree);
				return new AnExpression(ident);
			//Expressions that include an operator
			case oberonLexer.EXPRESSION:
				assert (tree.getChildCount() == 1);
				return createExpression(tree.getChild(0));
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
					return new AnExpression(exprType, createExpression(tree.getChild(0)), createExpression(tree.getChild(1)));
				} else {
					return new AnExpression(exprType, createExpression(tree.getChild(0)));
				}
			default: throw new UnsupportedOperationException();
		}
		
	}
	
	private static AnIdent createIdent(BaseTree tree, ValueType valType){
		assert(tree != null);
		return new AnIdent(tree.toString(), valType);
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
	
	/*private static IType createNumber(BaseTree tree){
		int number = Integer.parseInt(tree.getChild(0).toString());
		return new AnNumber(number);
	}*/
	
	private static AnModule createModule(List<BaseTree> trees){
		AnModule module = new AnModule();
		return module;
	}
	
	private static BaseTree getChildOfType(BaseTree tree, int type){

		List<BaseTree> children = tree.getChildren();
		for (BaseTree child : children){
			if (child.getType() == type) {return child;}
		}
		return null;
	}
	
	private static List<BaseTree> getChildrenOfType(BaseTree tree, int type){
		List<BaseTree> goodChildren = new ArrayList<BaseTree>();
		
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
}
