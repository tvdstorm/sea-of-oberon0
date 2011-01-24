package language;

import java.util.List;

public class AnFormalParams implements IAstNode {

	private List<AnFpSection> fpList;
	
	public AnFormalParams(List<AnFpSection> fpList){
		this.fpList = fpList;
	}
	
	@Override
	public IAstNode eval() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
