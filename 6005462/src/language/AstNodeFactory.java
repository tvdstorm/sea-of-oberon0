package language;

import java.util.ArrayList;
import java.util.List;

import language.parser.oberonLexer;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class AstNodeFactory {

	private AstNodeFactory() {}
	
	private static AnExpression createExpression(Tree tree){
		return createExpression((BaseTree) tree); 
	}
	
	public static AnProcedure createProcedure(BaseTree tree){
		return null;
	}
	
	public static AnStatementSeq AnStatementSeq(BaseTree tree){
		
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
		return null;
	}
	
	public static AnSmtIf createSmtIf(BaseTree tree){
		return null;
	}
	
	public static AnSmtProcCall createSmtProcCall(BaseTree tree){
		return null;
	}
	private static AnSmtAssignment createSmtAssignment(BaseTree tree){
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
	
	private static AnIdent createIdent(BaseTree btIdent){
		return new AnIdent(btIdent.toString());
	}
	
	private static AnValue createValue(BaseTree btValue){
		assert (btValue.getChildCount() == 1);
		
		String strVal = btValue.getChild(0).toString();
		int valType = btValue.getType();
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
			if (child.getType() == type) return child;
		}
		return null;
	}
	
	
	
	
}
