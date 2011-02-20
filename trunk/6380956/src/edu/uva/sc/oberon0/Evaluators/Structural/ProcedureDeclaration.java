package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ProcedureDeclaration implements IDeclaration {
	ProcedureHeading heading;
	ProcedureBody body;
	String closeTag;
	
	
	public ProcedureDeclaration(ProcedureHeading heading, ProcedureBody body, String closeTag){
		this.heading = heading;
		this.body = body;
		this.closeTag = closeTag;
	}
	@Override
	public Object evaluate(IScope scope) {
		heading.evaluate(scope);
		//body.evaluate(scope);
		scope.SetVarValue(heading.GetName(), this);
		return null;
	}
	@Override
	public void AddToScope(IScope scope) {
		scope.AddToScope(this.heading.GetName());
		
	}
	public String toString(){
		return heading.toString() +"\n"+ body.toString();
	}
	@Override
	public String GetType(IScope scope) {
		return "PROC DECLARATION";
	}
	@Override
	public String GetName(IScope scope) {
		return this.heading.GetName();
	}
}
