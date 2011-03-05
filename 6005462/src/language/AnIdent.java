package language;

public class AnIdent implements IType {

	private String name;
	private AnIdentDecl decl;

	public AnIdent(String name){
		this.name = name;
	}
	
	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		if (this.decl == null){
			decl = env.getIdentDecl(this.name);
		}
		if (this.decl == null){
			throw new Exception("Cannot find variable: " + this.toString());
		}
	}

	@Override
	public ValueType getType() throws Exception {
		assert(this.decl != null);
		return this.decl.getType();
	}

	@Override
	public AnValue eval(AnEnvironment env) throws Exception {
		assert(this.decl != null);
		return this.decl.eval(env);
	}

	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		assert(this.decl != null);
		return this.decl.operate(op, secondVal, env);
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
	public void assign(AnValue value) throws Exception{
		assert(this.decl != null);
		this.decl.assign(value);
	}
}
