package uva.oberon0.abstractsyntax;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents the BaseNode for the Abstract Syntax Tree.
 * This class is an inheritance root for all Abstract Syntax Tree Node implementations.
 * This class is abstract.
 */
public abstract class BaseNode implements Cloneable
{
	protected BaseNode(CommonTree parserTree)
	{
	}
	
	/**
	 * Implodes the Parser Tree to an Abstract Syntax Tree.
	 * @param parserNode Represents the ANTLR generated Parser Tree Node.
	 * @return An implementation of the BaseNode for the Abstract Syntax Tree.
	 */
	public static BaseNode implodeParserTree(CommonTree parserNode)
	{
		//Check input variable tree.
		if (parserNode == null)
			return null;
		
		//Determine result AST node.
		BaseNode resultNode = createAbstactSyntaxNode(parserNode);
		
		if (resultNode == null)
			return null;
		
		//Loop parser tree children.
		for (int i = 0; i < parserNode.getChildCount(); i++)
		{
			//Load and validate tree child.
			CommonTree parserChild = (CommonTree)parserNode.getChild(i);
			if (parserChild == null)
				continue;
			if (parserChild.isNil())
				continue;
			
			//Determine and process child type.
			uva.oberon0.abstractsyntax.BaseNode childNode = implodeParserTree(parserChild);
			if (childNode == null)
				continue;
			
			if (!childNode.isValid())
				assert false : "The AST child node is not valid!";
			
			//Implement current child on result node.
			addAbstactSyntaxChildNode(resultNode, childNode);
			
			//Determine and process splitting of child.
			//Example: VAR with multiple IDs
			while (childNode.canSplit())
			{
				//Implement current and split child node on result node.
				addAbstactSyntaxChildNode(resultNode, childNode.split());
			}
		}
						
		return resultNode;
	}

	/**
	 * Creates an implementation of the Abstract Syntax Tree Base Node based on the Parser Tree Node. 
	 */
	private static BaseNode createAbstactSyntaxNode(CommonTree parserNode)
	{
		//Check input variable tree.
		if (parserNode == null)
			return null;
		
		//Determine and factor tree type.
		switch (parserNode.getType())
		{
			//Structure Elements.	
			case uva.oberon0.parser.OberonParser.MODULE:
				return new uva.oberon0.abstractsyntax.declarations.Module(parserNode);
	
			case uva.oberon0.parser.OberonParser.PROCEDURE:
				return new uva.oberon0.abstractsyntax.declarations.Procedure(parserNode);

			case uva.oberon0.parser.OberonParser.INPUTVARS:
				return new uva.oberon0.abstractsyntax.declarations.BaseDeclarationList(parserNode);
				
			case uva.oberon0.parser.OberonParser.BODY:
				return new uva.oberon0.abstractsyntax.declarations.Body(parserNode);
		
			case uva.oberon0.parser.OberonParser.ID:
				return new uva.oberon0.abstractsyntax.ID(parserNode);
		
				
			//Declaration Elements.	
			case uva.oberon0.parser.OberonParser.DECLARATIONS:
				return new uva.oberon0.abstractsyntax.declarations.BaseDeclarationList(parserNode);
							
			case uva.oberon0.parser.OberonParser.CONST:
				return new uva.oberon0.abstractsyntax.declarations.Const(parserNode);
			
			case uva.oberon0.parser.OberonParser.VAR:
				return new uva.oberon0.abstractsyntax.declarations.Var(parserNode);
			
			case uva.oberon0.parser.OberonParser.VARREF:
				return new uva.oberon0.abstractsyntax.declarations.VarRef(parserNode);
				
				
			//Type Elements.	
			case uva.oberon0.parser.OberonParser.INT_TYPE:
				return new uva.oberon0.abstractsyntax.types.Int(parserNode);

			case uva.oberon0.parser.OberonParser.INT:
				return new uva.oberon0.abstractsyntax.types.IntValue(parserNode);

				
			//Expression Elements.	
			case uva.oberon0.parser.OberonParser.MUL:
				return new uva.oberon0.abstractsyntax.expressions.Multiplication(parserNode);
			case uva.oberon0.parser.OberonParser.DIV:
				return new uva.oberon0.abstractsyntax.expressions.Division(parserNode);
			case uva.oberon0.parser.OberonParser.MOD:
				return new uva.oberon0.abstractsyntax.expressions.Modulo(parserNode);
			case uva.oberon0.parser.OberonParser.PLUS:
				return new uva.oberon0.abstractsyntax.expressions.Addition(parserNode);
			case uva.oberon0.parser.OberonParser.MIN:
				return new uva.oberon0.abstractsyntax.expressions.Subtraction(parserNode);
			case uva.oberon0.parser.OberonParser.EQUAL:
				return new uva.oberon0.abstractsyntax.expressions.Equal(parserNode);
			case uva.oberon0.parser.OberonParser.UNEQUAL:
				return new uva.oberon0.abstractsyntax.expressions.NotEqual(parserNode);
			case uva.oberon0.parser.OberonParser.LESS:
				return new uva.oberon0.abstractsyntax.expressions.LessThan(parserNode);
			case uva.oberon0.parser.OberonParser.LESS_EQUAL:
				return new uva.oberon0.abstractsyntax.expressions.LessThanOrEqualTo(parserNode);
			case uva.oberon0.parser.OberonParser.GREAT:
				return new uva.oberon0.abstractsyntax.expressions.GreatherThan(parserNode);
			case uva.oberon0.parser.OberonParser.GREAT_EQUAL:
				return new uva.oberon0.abstractsyntax.expressions.GreatherThanOrEqualTo(parserNode);
			case uva.oberon0.parser.OberonParser.AND:
				return new uva.oberon0.abstractsyntax.expressions.LogicalAnd(parserNode);
			case uva.oberon0.parser.OberonParser.OR:
				return new uva.oberon0.abstractsyntax.expressions.LogicalOr(parserNode);
			case uva.oberon0.parser.OberonParser.NOT:
				return new uva.oberon0.abstractsyntax.expressions.Not(parserNode);

				
			//Statement Elements.	
			case uva.oberon0.parser.OberonParser.ASSIGN:
				return new uva.oberon0.abstractsyntax.statements.Assign(parserNode);

			case uva.oberon0.parser.OberonParser.IF:
				return new uva.oberon0.abstractsyntax.statements.If(parserNode);
			case uva.oberon0.parser.OberonParser.THEN:
				return new uva.oberon0.abstractsyntax.statements.IfPartForThen(parserNode);
			case uva.oberon0.parser.OberonParser.ELSE:
				return new uva.oberon0.abstractsyntax.statements.IfPartForElse(parserNode);
			case uva.oberon0.parser.OberonParser.ELSIF:
				return new uva.oberon0.abstractsyntax.statements.IfPartForElsIf(parserNode);
				
			case uva.oberon0.parser.OberonParser.WHILE:
				return new uva.oberon0.abstractsyntax.statements.While(parserNode);

				
			//Method Call Elements.
			case uva.oberon0.parser.OberonParser.CALL:
				return new uva.oberon0.abstractsyntax.statements.Call(parserNode);
			//Buildin Method Call Elements.
			case uva.oberon0.parser.OberonParser.CALL_READ:
				return new uva.oberon0.abstractsyntax.statements.CallConcreteRead();
			case uva.oberon0.parser.OberonParser.CALL_WRITE:
				return new uva.oberon0.abstractsyntax.statements.CallConcreteWrite();
			case uva.oberon0.parser.OberonParser.CALL_WRITELN:
				return new uva.oberon0.abstractsyntax.statements.CallConcreteWriteLn();
			//Method Call Variables.
			case uva.oberon0.parser.OberonParser.CALLVARS:
				return new uva.oberon0.abstractsyntax.statements.CallVars(parserNode); 
				
				
			//Ignoreable Parser Tree Types.
			case uva.oberon0.parser.OberonParser.ARRAY:
				return null;
				
				
			//No factor match found.
			default:
				assert false : "Parser Tree Node Type not implemented!";
				return null;
		}
	}


	/**
	 * Adds the Abstract Syntax Tree Child to the Parent Node. 
	 */
	private static void addAbstactSyntaxChildNode(BaseNode parentNode, BaseNode childNode) 
	{
		if (!parentNode.addChildNode(childNode))
		{
			assert false : "Unable to process AST child node.";
		}
	}
	/**
	 * Adds an Abstract Syntax Tree Child Node. 
	 */
	protected abstract boolean addChildNode(BaseNode child);
	
	/**
	 * Determines if the current Abstract Syntax Tree Node is valid.
	 */
	public boolean isValid()
	{
		return true;
	}
	
	/**
	 * Determines if the current Abstract Syntax Tree Node can be split into multiple Tree Nodes.
	 */
	public boolean canSplit()
	{
		return false;
	}
	/**
	 * Splits an new Abstract Syntax Tree Node from the current.
	 */
	public BaseNode split()
	{
		return null;
	}
	
	/**
	 * Performs interpreter evaluation for the current Abstract Syntax Tree Node structure.
	 */
	public abstract int eval(uva.oberon0.runtime.Scope scope);
}
