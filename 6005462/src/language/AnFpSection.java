package language;

import java.util.List;

public class AnFpSection implements IAstNode {

	private List<AnIdent> identList;
	private ValueType type;
	
	public AnFpSection(List<AnIdent> identList, ValueType type){
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public IAstNode eval() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
