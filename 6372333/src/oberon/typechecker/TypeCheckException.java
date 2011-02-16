package oberon.typechecker;

import java.util.Iterator;
import java.util.List;


/**
 * The Class TypeCheckException.
 */
public class TypeCheckException extends RuntimeException {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4562395861125992766L;
	
	/**
	 * Instantiates a new type checker exception.
	 *
	 * @param list the message
	 */
	public TypeCheckException(List<AbstractError> list){
		super(buildString(list));
	}
	
	/**
	 * Builds the string.
	 *
	 * @param list the list
	 * @return the string
	 */
	private static String buildString(List<AbstractError> list) {
		String outputString = "";
		
		Iterator<AbstractError> iterator = list.iterator();
		while (iterator.hasNext()){
			AbstractError error = iterator.next();
			outputString += error.toString() + "\r\n";
		}
		
		return outputString;
	}
}
