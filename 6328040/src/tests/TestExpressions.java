package tests;

import oberon0.ast.expressions.arithmetic.AddNode;
import oberon0.ast.expressions.arithmetic.DivideNode;
import oberon0.ast.expressions.arithmetic.ModuloNode;
import oberon0.ast.expressions.arithmetic.MultiplyNode;
import oberon0.ast.expressions.arithmetic.NegativeNode;
import oberon0.ast.expressions.arithmetic.SubtractNode;
import oberon0.ast.expressions.logical.ConjunctionNode;
import oberon0.ast.expressions.logical.DisjunctionNode;
import oberon0.ast.expressions.logical.NegationNode;
import oberon0.ast.expressions.relational.EqualsNode;
import oberon0.ast.expressions.relational.EqualsNotNode;
import oberon0.ast.expressions.relational.GreaterEqualNode;
import oberon0.ast.expressions.relational.GreaterThenNode;
import oberon0.ast.expressions.relational.SmallerEqualNode;
import oberon0.ast.expressions.relational.SmallerThenNode;
import oberon0.ast.variables.BooleanNode;
import oberon0.ast.variables.IntegerNode;
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
