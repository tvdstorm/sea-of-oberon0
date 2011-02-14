package oberon.typechecker;

import java.util.List;

public interface IChecker {
	List<AbstractError> check(TypeCheckScope scope);
}
