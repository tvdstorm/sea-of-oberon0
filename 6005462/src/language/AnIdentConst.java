package language;

public class AnIdentConst extends AnIdent {
	//TODO Mss niet extenden van AnIdent omdat Assign niet van toepassing is op een const
	// mogelijke oplossing is een abstracte Ident te maken mss zelfs met de naam variabele
	
	public AnIdentConst(String name, AnValue constVal) throws Exception {
		super(name, constVal.getType());
		super.value = constVal;
	}
	
	@Override
	public void assign(AnValue value) throws Exception{
		throw new Exception("Cannot reassign to a const");
	}

}
