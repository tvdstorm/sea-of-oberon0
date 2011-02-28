package edu.uva.sc.oberon0.Evaluators.Structural;

public class ProcedureDeclaration implements IDeclaration {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		scope.SetVarValue(heading.GetName(), this, null, scope);
		return null;
	}
	@Override
	public void AddToScope(IScope scope) {
		scope.AddToScope(this.heading.GetName(), null);
		
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
