package tests;

import oberon0.ast.expressions.AddNode;
import oberon0.ast.expressions.BooleanNode;
import oberon0.ast.expressions.ConjunctionNode;
import oberon0.ast.expressions.DisjunctionNode;
import oberon0.ast.expressions.DivideNode;
import oberon0.ast.expressions.EqualsNode;
import oberon0.ast.expressions.EqualsNotNode;
import oberon0.ast.expressions.GreaterEqualNode;
import oberon0.ast.expressions.GreaterThenNode;
import oberon0.ast.expressions.IntegerNode;
import oberon0.ast.expressions.ModuloNode;
import oberon0.ast.expressions.MultiplyNode;
import oberon0.ast.expressions.NegationNode;
import oberon0.ast.expressions.NegativeNode;
import oberon0.ast.expressions.SmallerEqualNode;
import oberon0.ast.expressions.SmallerThenNode;
import oberon0.ast.expressions.SubtractNode;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;

public class TestExpressions {
	
	/**
	 * Test all Integer Expressions
	 */
	public static void main(String[] args) {
		Context context  = new Context("expressiontest", null);
		IntegerNode int0 = new IntegerNode(0);
		IntegerNode int1 = new IntegerNode(1);
		IntegerNode int2 = new IntegerNode(2);
		IntegerNode int3 = new IntegerNode(3);
		IntegerNode int4 = new IntegerNode(4);
		BooleanNode boolfalse 	= new BooleanNode(false);
		BooleanNode booltrue 	= new BooleanNode(true);
		
	    assert (4 ==  ((IntegerValue) new AddNode(int1, int3).eval(context)).getValue() );
	    assert (-3 == ((IntegerValue) new SubtractNode(int0, int3).eval(context)).getValue() );
	    assert (12 == ((IntegerValue) new MultiplyNode(int4, int3).eval(context)).getValue() );
	    assert (2 ==  ((IntegerValue) new DivideNode(int4, int2).eval(context)).getValue() );
	    assert (1 ==  ((IntegerValue) new ModuloNode(int4, int3).eval(context)).getValue() );
	    assert (-7 == ((IntegerValue) new NegativeNode(new AddNode(int4, int3)).eval(context)).getValue() );
	    
	    System.out.print("Arithmetic operations passed\n");
	    
	    assert (!((BooleanValue) new EqualsNode(int4, int3).eval(context)).getValue());
	    assert (((BooleanValue) new EqualsNotNode(int3, int4).eval(context)).getValue());
	    assert (!((BooleanValue) new GreaterThenNode(int3, int4).eval(context)).getValue());
	    assert (!((BooleanValue) new GreaterEqualNode(int3, int4).eval(context)).getValue());
	    assert (((BooleanValue) new SmallerThenNode(int3, int4).eval(context)).getValue());
	    assert (((BooleanValue) new SmallerEqualNode(int3, int4).eval(context)).getValue());
	    
	    System.out.print("Relation operations passed\n");
	    
	    assert (false 	== ((BooleanValue) new ConjunctionNode(boolfalse, booltrue).eval(context)).getValue());
	    assert (true 	== ((BooleanValue) new DisjunctionNode(boolfalse, booltrue).eval(context)).getValue());
	    assert (true	== ((BooleanValue) new NegationNode(boolfalse).eval(context)).getValue());
	  
	    System.out.print("Logical operations passed\n");
	}

}
