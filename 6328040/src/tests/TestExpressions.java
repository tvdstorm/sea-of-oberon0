package tests;

import oberon0.ast.*;
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
import oberon0.ast.expressions.NegativeNode;
import oberon0.ast.expressions.SmallerEqualNode;
import oberon0.ast.expressions.SmallerThenNode;
import oberon0.ast.expressions.SubtractNode;
import oberon0.environment.Context;

public class TestExpressions {
	
	/**
	 * Test all Integer Expressions
	 */
	public static void main(String[] args) {
		Context context = new Context();
		IntegerNode int0 = new IntegerNode(0);
		IntegerNode int1 = new IntegerNode(1);
		IntegerNode int2 = new IntegerNode(2);
		IntegerNode int3 = new IntegerNode(3);
		IntegerNode int4 = new IntegerNode(4);
		BooleanNode boolfalse 	= new BooleanNode(true);
		BooleanNode booltrue 	= new BooleanNode(false);
		
	    assert ((Integer) new AddNode(int4, int3).eval(context)== 7);
	    assert ((Integer) new SubtractNode(int4, int3).eval(context) == 1);
	    assert ((Integer) new MultiplyNode(int4, int3).eval(context) == 12);
	    assert ((Integer) new DivideNode(int4, int2).eval(context) == 2);
	    assert ((Integer) new ModuloNode(int4, int3).eval(context) == 1);
	    assert ((Integer) new NegativeNode(new AddNode(int4, int3)).eval(context)== -7);
	    
	    System.out.print("Arithmetic operations passed\n");
	    
	    assert (!(Boolean) new EqualsNode(int4, int3).eval(context));
	    assert ((Boolean) new EqualsNotNode(int3, int4).eval(context));
	    assert (!(Boolean) new GreaterThenNode(int3, int4).eval(context));
	    assert (!(Boolean) new GreaterEqualNode(int3, int4).eval(context));
	    assert ((Boolean) new SmallerThenNode(int3, int4).eval(context));
	    assert ((Boolean) new SmallerEqualNode(int3, int4).eval(context));
	    
	    System.out.print("Relation operations passed\n");
	    
	    assert (!(Boolean) new ConjunctionNode(boolfalse, booltrue).eval(context));
	    assert ((Boolean) new DisjunctionNode(boolfalse, booltrue).eval(context));
	     
	  
	    System.out.print("Logical operations passed\n");
	}

}
