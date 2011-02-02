package oberon;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

public abstract class Procedure {

	private String _name;
	private List<FormalParamSection> _paramSections;
	private ProcedureBody _body;

	public Procedure(String name, List<FormalParamSection> paramSections, ProcedureBody body){
		_name = name;
		_paramSections = paramSections;
		_body = body;
	}

	public String getName() {
		return _name;
	}
	
	protected List<FormalParamSection> getParamSections(){
		return _paramSections;
	}

	public ProcedureBody getBody() {
		return _body;
	}

	public abstract void Call(Queue<Expression> localQueue) throws IOException;
}