package nl.bve.uva.oberon;

import static org.junit.Assert.assertEquals;
import nl.bve.uva.oberon.ast.NumberNode;
import nl.bve.uva.oberon.ast.expressions.BinaryExpressionNode;
import nl.bve.uva.oberon.ast.expressions.MultExprNode;
import nl.bve.uva.oberon.env.Environment;

import org.junit.Test;

public class ExpressionTest {
	@Test
	public void testMultiply() {
		Environment env = new Environment();
		
		NumberNode value1 = new NumberNode(-10);
		NumberNode value2 = new NumberNode(0);
		
		BinaryExpressionNode e1 = new MultExprNode(value1, value2);
		
		assertEquals(new Integer(0), e1.interpret(env).getValue());
	}
}
