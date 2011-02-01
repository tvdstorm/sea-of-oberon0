package tests;

import oberon0.ast.*;
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
	    assert (!(Boolean) new EqualsNotNode(int4, int4).eval(context));
	    
	    System.out.print("Relation operations passed\n");
	    
	    assert (!(Boolean) new ConjunctionNode(boolfalse, booltrue).eval(context));
	    assert ((Boolean) new DisjunctionNode(boolfalse, booltrue).eval(context));
	     
	  
	    System.out.print("Logical operations passed\n");
	}

}
