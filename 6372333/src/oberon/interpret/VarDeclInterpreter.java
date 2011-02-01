package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Expression;
import oberon.data.DataType;
import oberon.data.ExpressionType;
import oberon.data.IntegerArrayType;
import oberon.data.IntegerType;
import oberon.node.AArrayType;
import oberon.node.AConstdecl;
import oberon.node.AConstdeclaration;
import oberon.node.AIntegerExp;
import oberon.node.AVardecl;
import oberon.node.AVardeclaration;
import oberon.node.PConstdeclaration;
import oberon.node.PExp;
import oberon.node.PType;
import oberon.node.PVardeclaration;
import oberon.node.TIdentifier;

class VarInterpreter extends BaseInterpreter<List<DataType>>{
	private ArrayList<DataType> _list = new ArrayList<DataType>();

	public void caseAVardecl(AVardecl node)
	{		
		for (PVardeclaration declaration : node.getVardeclaration())
		{
			declaration.apply(this);
		}
	}
	
	public void caseAVardeclaration(AVardeclaration node)
	{		
		PType nodeType = node.getType();
		Boolean isArray = nodeType instanceof AArrayType;
		
		for (TIdentifier name : node.getIdentifier())
		{
			if (isArray)
			{
				Expression lengthExpression = ExpInterpreterFactory.getExpression(((AArrayType)nodeType).getExp());
				_list.add(new IntegerArrayType(name.toString().trim(), lengthExpression));
			}
			else
			{
				_list.add(new IntegerType(name.toString().trim(), false));
			}
		}
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
	
		PExp exp = node.getExp();
		if (exp instanceof AIntegerExp)
		{
			int value = Integer.parseInt(((AIntegerExp)exp).getInteger().getText());
			_list.add(new IntegerType(name, value, true));
		}
		else 
		{
			Expression expression = ExpInterpreterFactory.getExpression(node.getExp());
			
			_list.add(new ExpressionType(name, expression));
		}
	}

	@Override
	public List<DataType> BuildInterpreterResult() {
		return _list;
	}
}
