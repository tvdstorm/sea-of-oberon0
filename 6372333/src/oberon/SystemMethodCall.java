package oberon;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

public class SystemMethodCall extends Procedure {

	public SystemMethodCall(String name,
			List<FormalParamSection> paramSections, ProcedureBody body) {
		super(name, paramSections, body);
	}

	@Override
	public void Call(Queue<Expression> localQueue) throws IOException {
		getBody().Eval();

	}

}
