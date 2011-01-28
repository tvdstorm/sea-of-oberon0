package language;

import java.util.HashMap;

public class AnContext {

	private HashMap<String, AnIdent> memmory;
	//private HashMap<String, Boolean> visibility;
	private AnContext parentContext;
	
	public AnContext(AnContext parentContext){
		this.parentContext = parentContext;
	}
	
	public void setValuee (String name, AnValue value) throws Exception{
		AnIdent ident;
		
		if(memmory.containsKey(name)){
			ident = memmory.get(name);
			ident.assign(value);
		} else {
			ident = new AnIdent(name, value.getType());
			ident.assign(value);
			memmory.put(name, ident);
		}
	}
	
	public AnValue getValue(String name){
		
		if(!memmory.containsKey(null)) return null;
		
		AnIdent ident = memmory.get(name); 
		return ident.getValue();
	}
	
	public AnIdent getIdent(String name){
		return memmory.get(name);
	}
	
}
