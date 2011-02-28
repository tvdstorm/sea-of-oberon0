package language;

public class AnTypeDecl implements IAstNode {

	private String name;
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public AnTypeDecl(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
