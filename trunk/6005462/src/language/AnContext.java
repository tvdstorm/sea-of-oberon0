package language;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnContext implements IAstNode{

	private Map<String, AnIdent> memIdents;
	private Map<String, AnProcDecl> memProcs;
	private Map<String, AnTypeDecl> memTypes; 
	
	public AnContext(){
		this.memIdents = new HashMap<String, AnIdent>();
		this.memProcs = new HashMap<String, AnProcDecl>();
		this.memTypes = new HashMap<String, AnTypeDecl>();
	}
	
	

	public void setIdents(List<AnIdent> idents){
		if (idents == null) { return; }
		for (AnIdent ident : idents){
			setIdent(ident);
		}
	}
	
	public AnIdent getIdent(String name){
		return memIdents.get(name);
	}
	
	public void setIdent(AnIdent ident){
		memIdents.put(ident.getName(), ident);
	}

	public void setProcs(List<AnProcDecl> procs){
		if (procs == null) { return; }
		for (AnProcDecl proc : procs){
			setProc(proc);
		}
	}
	
	public AnProcDecl getProc(String name){
		return memProcs.get(name);
	}
	
	public void setProc(AnProcDecl proc){
		memProcs.put(proc.getName(), proc);
	}

	public void setTypes(List<AnTypeDecl> types){
		if (types == null) { return; }
		for (AnTypeDecl typ : types){
			setType(typ);
		}
	}
	
	public void setType(AnTypeDecl typ){
		memTypes.put(typ.getName(), typ);
	}
	
	public AnTypeDecl getType(String name){
		return memTypes.get(name);
	}



	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		return null;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {		
		for (AnIdent ident : memIdents.values()){
			ident.typeCheck(env);
		}
		for (AnProcDecl proc : memProcs.values()){
			proc.typeCheck(env);
		}
		for (AnTypeDecl typDecl : memTypes.values()){
			typDecl.typeCheck(env);
		}
	}
}

