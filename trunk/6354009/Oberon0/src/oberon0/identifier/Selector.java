package oberon0.identifier;

public class Selector {

	private String type;
	private Selector nestedSelector;
	
	public Selector(String type) {
		this.type = type;
		this.nestedSelector = null;
	}
	
	public String getType() {
		return type;
	}
	
	public void addSelector(Selector selector) {
		if (nestedSelector == null) {
			nestedSelector = selector; 
		}
		else {
			nestedSelector.addSelector(selector);
		}
	}
}
