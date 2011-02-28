package edu.uva.sc.oberon0.Evaluators.Structural;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelectable;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Types.IType;
import edu.uva.sc.oberon0.Evaluators.Types.SomeType;

public class Module implements IEvaluator, IScope {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		List<String> writeParams = new LinkedList<String>();
		writeParams.add("paramToWrite");
		
		List<IStatement> writeStatements = new LinkedList<IStatement>();
		IStatement systemPrintOut = new OberonWriteStatement(null, "paramToWrite");
		writeStatements.add(systemPrintOut);
		
		InitSystemProcedure(writeParams, "Write", "writeType", writeStatements, "NONVAR");
		
		
		List<String> readParams = new LinkedList<String>();
		readParams.add("paramToRead");
		
		List<IStatement> readStatements = new LinkedList<IStatement>();
		IStatement systemRead = new OberonReadStatement("paramToRead");
		readStatements.add(systemRead);
		
		InitSystemProcedure(readParams, "Read", "readType", readStatements, "VAR");
		
		
		List<IStatement> writeLnStatements = new LinkedList<IStatement>();
		IStatement systemWriteLn = new OberonWriteStatement("\n", null);
		writeLnStatements.add(systemWriteLn);
		
		InitSystemProcedure(null, "WriteLn", null, writeLnStatements, "NONVAR");
		
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

	private void InitSystemProcedure(List<String> paramNames, String procName, String typeName, List<IStatement> sttmnts, String isVarStr) {
		List<FormalParametersSection> fps = new LinkedList<FormalParametersSection>();
		
		List<String> params = new LinkedList<String>();
		if(paramNames != null){
			for (String paramName : paramNames) {
				params.add(paramName);
			}
		}
		
		FormalParametersSection paramSection = new FormalParametersSection(params, new SomeType(typeName), isVarStr);
		fps.add(paramSection);
		ProcedureHeading heading = new ProcedureHeading(procName, fps);

		ProcedureBody body = new ProcedureBody(null, sttmnts);
		ProcedureDeclaration procDecl = new ProcedureDeclaration(heading, body, null);
		procDecl.AddToScope(this);
		SetVarValue(procName, procDecl, null, null);
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
	public Object GetVarValue(String varName, ISelector selector, IScope scope) {
		Object result = refs.get(varName);
		if(selector != null && result != null) {
			result = ((ISelectable)result).get(selector, scope);
		}
		return result;
	}

	@Override
	public void SetVarValue(String varName, Object value, ISelector selector, IScope scope) {
		if(refs.containsKey(varName)) {
			Object var = refs.get(varName);
			if(selector != null && var != null) {
				((ISelectable)var).put(selector, value, scope);
				value = var;
			}
			this.refs.put(varName, value);
		}
	}

	@Override
	public void AddToScope(String varName, IType type) {
		if(!refs.containsKey(varName)) {
			this.refs.put(varName, type);
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
		return (ProcedureDeclaration)GetVarValue(procedureName, null, this);
	}

}
