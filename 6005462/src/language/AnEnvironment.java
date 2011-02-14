package language;

import java.util.Stack;

import javax.naming.Context;

public class AnEnvironment implements IAstNode {

	private Stack<AnContext> contexts;
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addContext(AnContext ctxt){
		contexts.push(ctxt);
	}

	public void releaseCurrentContext(){
		contexts.pop();
	}
	
	public AnTypeDecl getType(String name){
		return getType(name, contexts.size());
	}
	
	private AnTypeDecl getType(String name, int ctxNum){
		assert (ctxNum < contexts.size());
		if (ctxNum < 0) { return null; }
			
		AnContext ctxt = contexts.get(ctxNum);
		AnTypeDecl typeDecl = ctxt.getType(name);
		
		if (typeDecl == null) { 
			return getType(name, ctxNum -1); 
		} else {
			return typeDecl;
		}
	}

	public AnProcDecl getProc(String name) throws Exception{
		int sz = contexts.size() - 1;
		AnContext ctx;
		AnProcDecl proc = null;
		
		for (int i = sz; i > 0; i--){
			ctx = contexts.get(i);
			if (ctx != null){
				proc = ctx.getProc(name);
				if (proc != null) return proc;  
			}
		}
		
		if (proc == null) { 
			throw new Exception("Cannot find procedure: " + name); 
		}
		//Apparently Eclipse doesnt know what it wants. It whines it wants a return statement but if I add one it whines it's dead code. 
		//Which it obviously is.
		return proc; 
	}
	
	public AnIdent getIdent(String name) throws Exception{
		int sz = contexts.size() - 1;
		AnContext ctx;
		AnIdent ident = null;
		
		for (int i = sz; i > 0; i--){
			ctx = contexts.get(i);
			if (ctx != null){
				ident = ctx.getIdent(name);
				if (ident != null) return ident;  
			}
		}
		
		if (ident == null) { 
			throw new Exception("Cannot find ident: " + name); 
		}
		//Apparently Eclipse doesnt know what it wants. It whines it wants a return statement but if I add one it whines it's dead code. 
		//Which it obviously is.
		return ident; 
	}
}
