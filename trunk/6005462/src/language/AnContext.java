package language;

import java.util.HashMap;
import java.util.List;

public class AnContext {

	private HashMap<String, AnIdent> memIdents;
	private HashMap<String, AnProcDecl> memProcs;
	private HashMap<String, AnTypeDecl> memTypes; 
	
	public AnContext(){
		
	}
	

	public void setIdents(List<AnIdent> idents){
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
}

