package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OArraySelector extends OSelector
{
	private OExpression lhs; // TODO: kijken voor strakkere typering (ook voor arrayIndex)
	private OExpression arrayIndex;
	
	public OArraySelector(OExpression _lhs, OExpression _arrayIndex)
	{
		lhs = _lhs;
		arrayIndex = _arrayIndex;
	}
	@Override
	public void print(String indent)
	{
		System.out.println(indent + "[]");
		lhs.print(indent + "\t");
		arrayIndex.print(indent + "\t");
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue valArray = lhs.run(vars);
		if (!valArray.getType().isArray())
			throw new Oberon0Exception("Trying to access the index of a '" + valArray.getType() + "', which is not an array...");
		OArray array = (OArray)valArray;
		OValue valIndex = arrayIndex.run(vars);
		if (!valIndex.getType().isInteger())
			throw new Oberon0Exception("Index of array access is not an integer, but a '" + valIndex.getType() + "'...");
		OInteger index = (OInteger)valIndex;
		return array.getIndexValue(index.getIntValue());
	}
	public static OArraySelector buildArraySelector(Tree tree) throws Oberon0Exception
	{
		OExpression lhs = OExpression.buildExpression(tree.getChild(0));
		OExpression arrayIndex = OExpression.buildExpression(tree.getChild(1));
		return new OArraySelector(lhs, arrayIndex);
	}
}
