package oberon;

import oberon.data.Selector;

public class SelectorExpression extends Expression {
	private Selector _selector;

	public SelectorExpression(Selector selector){
		_selector = selector;
	}
	
	public Selector getSelector(){
		return _selector;
	}
	
	@Override
	public int EvalAsInt() {
		//TODO throw
		System.out.println("EvalAsInt called on selector");
		return 0;
	}

}
