package oberon.typechecker;

import java.util.Iterator;
import java.util.List;

public class TypeCheckException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4562395861125992766L;
	
	/**
	 * Instantiates a new type checker exception.
	 *
	 * @param list the message
	 */
	public TypeCheckException(List<AbstractError> list){
		super(buildString(list));
	}
	
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
