package oberon0.exceptions;

public class UnexpectedNodeException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnexpectedNodeException(String expectedNode, String gottenNode) {
		super("At this point of the pogram, node '"+ expectedNode 
				+ "' was expected, but got '" + gottenNode + "'");
	}
}
