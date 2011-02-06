package oberon0.identifier;

public class Identifier {
	
	private String identifier;
	private Selector selector;
	
	//Constructor
	public Identifier(String identifier) {
		this.identifier = identifier;
	}
	
	public void addSelector(Selector selector) {
		if (this.selector == null) {
			this.selector = selector;
		}
		else {
			selector.addSelector(selector);
		}
	}
	
	public String getIdentifier() {
		return identifier;
	}

	public Selector getSelector() {
		return selector;
	}
}
