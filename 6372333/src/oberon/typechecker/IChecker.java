package oberon.typechecker;

import java.util.List;

/**
 * The Interface IChecker.
 */
public interface IChecker {
	
	/**
	 * Check.
	 *
	 * @param scope the scope
	 * @return the list
	 */
	List<AbstractError> check(TypeCheckScope scope);
}
