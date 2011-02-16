package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DefaultStatementChecker.
 */
public class DefaultStatementChecker implements IChecker {

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		//nothing to do, statemetns with checks are handled elsewhere
		return new ArrayList<AbstractError>();
	}


}
