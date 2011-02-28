package edu.uva.sc.oberon0.Evaluators.Structural;

public class OberonWriteStatement implements IStatement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fixedToWrite;
	private String paramToWrite;
	
	public OberonWriteStatement(String fixedToWrite, String paramToWrite){
		this.fixedToWrite = fixedToWrite;
		this.paramToWrite = paramToWrite;
	}
	@Override
	public Object evaluate(IScope scope) {
		String toWrite = (this.fixedToWrite != null)?this.fixedToWrite:scope.GetVarValue(this.paramToWrite, null, null).toString();
		System.out.print(toWrite);
		return null;
	}

}
