package edu.uva.sc.oberon0.Evaluators.Structural;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class Module implements IEvaluator, IScope {
	String name;
	List<IDeclaration> declarations;
	List<IStatement> statements;
	public Map<String, Object> refs = new HashMap<String, Object>();
	
	public Module(String name, List<IDeclaration> declarations, List<IStatement> statements)
	{
		this.name = name;
		this.declarations = declarations;
		this.statements = statements;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		InitSystemProcedures();
		if(declarations != null){
			for (IDeclaration decl : declarations) {
				decl.evaluate(scope);
			}
		}
		if(statements != null){
			for (IStatement statement : statements) {
				statement.evaluate(scope);
			}
		}
		return null;
	}
	private void InitSystemProcedures() {
		List<FormalParametersSection> fps = new LinkedList<FormalParametersSection>();
		
		List<String> params = new LinkedList<String>();
		params.add("paramToWrite");
		FormalParametersSection paramSection = new FormalParametersSection(params, new SomeType("writeType"), "NONVAR");
		fps.add(paramSection);
		ProcedureHeading heading = new ProcedureHeading("Write", fps);
		List<IStatement> sttmnts = new LinkedList<IStatement>();
		
		IStatement systemPrintOut = new OberonWriteStatement();
		sttmnts.add(systemPrintOut);
		ProcedureBody body = new ProcedureBody(null, sttmnts);
		ProcedureDeclaration procDecl = new ProcedureDeclaration(heading, body, null);
		procDecl.AddToScope(this);
		SetVarValue("Write", procDecl);
	}

	@Override
	public String toString() {
		//evaluate(this);
		//String result = "";
		//for (IDeclaration decl : declarations) {
		//	result += "\n"+decl.toString();
		//}
		//return "moduleName: "+name + "\n declarations: " + result;
		return super.toString();
	}

	@Override
	public Object GetVarValue(String varName) {
		return refs.get(varName);
	}

	@Override
	public void SetVarValue(String varName, Object value) {
		if(refs.containsKey(varName)) {
			this.refs.put(varName, value);
		}
	}

	@Override
	public void AddToScope(String varName) {
		if(!refs.containsKey(varName)) {
			this.refs.put(varName, null);
		}
	}
	
	@Override
	public IScope GetParentScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetParentScope(IScope scope) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProcedureDeclaration GetProcedure(String procedureName) {
		return (ProcedureDeclaration)GetVarValue(procedureName);
	}

}
