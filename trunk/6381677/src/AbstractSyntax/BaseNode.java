package AbstractSyntax;

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
			AbstractSyntax.BaseNode childNode = implodeParserTree(parserChild);
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
			case ANTLR.OberonParser.MODULE:
				return new AbstractSyntax.Structure.Module(parserNode);
	
			case ANTLR.OberonParser.PROCEDURE:
				return new AbstractSyntax.Structure.Procedure(parserNode);

			case ANTLR.OberonParser.INPUTVARS:
				return new AbstractSyntax.Declarations.BaseDeclarationList(parserNode);
				
			case ANTLR.OberonParser.BODY:
				return new AbstractSyntax.Structure.Body(parserNode);
		
			case ANTLR.OberonParser.ID:
				return new AbstractSyntax.ID(parserNode);
		
				
			//Declaration Elements.	
			case ANTLR.OberonParser.DECLARATIONS:
				return new AbstractSyntax.Declarations.BaseDeclarationList(parserNode);
							
			case ANTLR.OberonParser.CONST:
				return new AbstractSyntax.Declarations.Const(parserNode);
			
			case ANTLR.OberonParser.VAR:
				return new AbstractSyntax.Declarations.Var(parserNode);
			
			case ANTLR.OberonParser.VARREF:
				return new AbstractSyntax.Declarations.VarRef(parserNode);
				
				
			//Type Elements.	
			case ANTLR.OberonParser.INT_TYPE:
				return new AbstractSyntax.Types.Int(parserNode);

			case ANTLR.OberonParser.INT:
				return new AbstractSyntax.Types.IntValue(parserNode);

				
			//Expression Elements.	
			case ANTLR.OberonParser.MUL:
			case ANTLR.OberonParser.DIV:
			case ANTLR.OberonParser.MOD:
			case ANTLR.OberonParser.PLUS:
			case ANTLR.OberonParser.MIN:
			case ANTLR.OberonParser.EQUAL:
			case ANTLR.OberonParser.UNEQUAL:
			case ANTLR.OberonParser.LESS:
			case ANTLR.OberonParser.LESS_EQUAL:
			case ANTLR.OberonParser.GREAT:
			case ANTLR.OberonParser.GREAT_EQUAL:
			case ANTLR.OberonParser.AND:
			case ANTLR.OberonParser.OR:
			case ANTLR.OberonParser.NOT:
				return new AbstractSyntax.Statements.Expression(parserNode);

				
			//Statement Elements.	
			case ANTLR.OberonParser.ASSIGN:
				return new AbstractSyntax.Statements.Assign(parserNode);

			case ANTLR.OberonParser.IF:
				return new AbstractSyntax.Statements.If(parserNode);
			case ANTLR.OberonParser.THEN:
				return new AbstractSyntax.Statements.IfPartForThen(parserNode);
			case ANTLR.OberonParser.ELSE:
				return new AbstractSyntax.Statements.IfPartForElse(parserNode);
			case ANTLR.OberonParser.ELSIF:
				return new AbstractSyntax.Statements.IfPartForElsIf(parserNode);
				
			case ANTLR.OberonParser.WHILE:
				return new AbstractSyntax.Statements.While(parserNode);

				
			//Method Call Elements.
			case ANTLR.OberonParser.CALL:
				return new AbstractSyntax.Statements.Call(parserNode);
			//Buildin Method Call Elements.
			case ANTLR.OberonParser.CALL_READ:
				return new AbstractSyntax.Statements.CallConcreteRead();
			case ANTLR.OberonParser.CALL_WRITE:
				return new AbstractSyntax.Statements.CallConcreteWrite();
			case ANTLR.OberonParser.CALL_WRITELN:
				return new AbstractSyntax.Statements.CallConcreteWriteLn();
			//Method Call Variables.
			case ANTLR.OberonParser.CALLVARS:
				return new AbstractSyntax.Statements.CallVars(parserNode); 
				
				
			//Ignoreable Parser Tree Types.
			case ANTLR.OberonParser.ARRAY:
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
	public abstract int eval(Execution.Scope scope);
}
