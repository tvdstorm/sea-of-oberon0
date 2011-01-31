package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.ConstVariable;
import oberon.Expression;
import oberon.node.AConstdecl;
import oberon.node.AConstdeclaration;
import oberon.node.PConstdeclaration;

class ConstDeclInterpreter extends BaseInterpreter<List<ConstVariable>> {
	private List<ConstVariable> _list;
	
	public ConstDeclInterpreter() {
		_list = new ArrayList<ConstVariable>(); 
	}

	public void caseAConstDecl(AConstdecl node)
	{
		for (PConstdeclaration declaration : node.getConstdeclaration())
		{
			declaration.apply(this);
		}
	}
	
	public void caseAConstdeclaration(AConstdeclaration node)
	{
		String name = node.getIdentifier().toString().trim();
	
		Expression value = ExpInterpreterFactory.getExpression(node.getExp());
		
		_list.add(new ConstVariable(name, value));
	}
	
	@Override
	public List<ConstVariable> BuildInterpreterResult() {
		return _list;
	}

}
