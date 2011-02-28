package edu.uva.sc.oberon0.Evaluators.Structural;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OberonReadStatement implements IStatement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String readParam;
	public OberonReadStatement(String readParam) {
		this.readParam = readParam;
	}
	@Override
	public Object evaluate(IScope scope) {
		String readStr = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			readStr = br.readLine();
			
			VariableRef var = (VariableRef)scope.GetVarValue(this.readParam, null, scope);
			scope.SetVarValue(var.name, Integer.parseInt(readStr), var.selector, scope);
		} catch (Exception e) {
			System.out.println("Error! Exception: "+e); 
		}
		return null;
	}

}
