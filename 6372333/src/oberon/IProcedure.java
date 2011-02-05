package oberon;

import java.io.IOException;
import java.util.Queue;

public interface IProcedure {

	public abstract String getName();

	public abstract void call(Queue<IExpression> localQueue) throws IOException;

}