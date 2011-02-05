package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.data.AbstractDataType;
import oberon.data.ExpressionDataType;
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

class VarInterpreter extends AbstractBaseInterpreter<List<AbstractDataType>>{
	private final List<AbstractDataType> list = new ArrayList<AbstractDataType>();

	public void caseAVardecl(final AVardecl node) {		
		for (PVardeclaration declaration : node.getVardeclaration()) {
			declaration.apply(this);
		}
	}
	
	public void caseAVardeclaration(final AVardeclaration node) {		
		final PType nodeType = node.getType();
		final Boolean isArray = nodeType instanceof AArrayType;
		
		for (TIdentifier name : node.getIdentifier()) {
			if (isArray) {
				final IExpression lengthExpression = ExpInterpreterFactory.getExpression(((AArrayType)nodeType).getExp());
				list.add(new IntegerArrayType(name.toString().trim(), lengthExpression));
			}
			else {
				list.add(new IntegerType(name.toString().trim(), false));
			}
		}
	}
	
	public void caseAConstDecl(final AConstdecl node) {
		for (PConstdeclaration declaration : node.getConstdeclaration()) {
			declaration.apply(this);
		}
	}
	
	public void caseAConstdeclaration(final AConstdeclaration node) {
		final String name = node.getIdentifier().toString().trim();
	
		final PExp exp = node.getExp();
		if (exp instanceof AIntegerExp) {
			final int value = Integer.parseInt(((AIntegerExp)exp).getInteger().getText());
			list.add(new IntegerType(name, value, true));
		}
		else {
			final IExpression expression = ExpInterpreterFactory.getExpression(node.getExp());
			
			list.add(new ExpressionDataType(name, expression));
		}
	}

	@Override
	public List<AbstractDataType> buildInterpreterResult() {
		return list;
	}
}
