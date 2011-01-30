package oberon.factory;

import java.util.ArrayList;
import java.util.List;

import oberon.VarDeclaration;
import oberon.VarType;
import oberon.node.AArrayType;
import oberon.node.AVardecl;
import oberon.node.AVardeclaration;
import oberon.node.PVardeclaration;
import oberon.node.TIdentifier;

class VarDeclInterpreter extends BaseInterpreter<List<VarDeclaration>>{
	private ArrayList<VarDeclaration> _list;

	public void caseAVardecl(AVardecl node)
	{
		_list = new ArrayList<VarDeclaration>();
		
		for (PVardeclaration declaration : node.getVardeclaration())
		{
			declaration.apply(this);
		}
	}
	
	public void caseAVardeclaration(AVardeclaration node)
	{		
		VarType type = VarType.Identifier;
		if (node.getType() instanceof AArrayType)
		{
			type = VarType.Array;
		}
		
		for (TIdentifier name : node.getIdentifier())
		{
			_list.add(new VarDeclaration(name.toString().trim(), type));
		}
	}

	@Override
	public List<VarDeclaration> BuildInterpreterResult() {
		return _list;
	}
}
