package edu.uva.sc.oberon0.Evaluators.Structural;

public class OberonWriteStatement implements IStatement {

	@Override
	public Object evaluate(IScope scope) {
		System.out.print(scope.GetVarValue("paramToWrite", null, null));
		return null;
	}

}
