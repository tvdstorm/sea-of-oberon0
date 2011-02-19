package oberon0.selector;


public class DotSelector extends Selector {
	
	private String identifier;
	
	public DotSelector(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}
}
