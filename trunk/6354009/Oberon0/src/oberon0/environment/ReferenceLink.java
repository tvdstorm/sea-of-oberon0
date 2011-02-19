package oberon0.environment;

import oberon0.selector.Selector;

public class ReferenceLink {
	
	private final String innerIdentifier;
	private final String outerIdentifier;
	private final Selector outerSelector;
	
	public ReferenceLink(String innerIdentifier, String outerIdentifier, Selector outerSelector) {
		this.innerIdentifier = innerIdentifier;
		this.outerIdentifier = outerIdentifier;
		this.outerSelector = outerSelector;
	}

	public String getInnerIdentifier() {
		return innerIdentifier;
	}

	public String getOuterIdentifier() {
		return outerIdentifier;
	}

	public Selector getOuterSelector() {
		return outerSelector;
	}
}
