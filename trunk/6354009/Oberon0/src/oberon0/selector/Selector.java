package oberon0.selector;

public class Selector {

	private Selector nestedSelector;
	
	public Selector() {
		this.nestedSelector = null;
	}
	
	public void addSelector(Selector selector) {
		if (nestedSelector == null) {
			nestedSelector = selector; 
		}
		else {
			nestedSelector.addSelector(selector);
		}
	}
	
	public Selector getNestedSelector() {
		return nestedSelector;
	}
}
