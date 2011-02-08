package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.data.ExpressionDataType;
import oberon.data.IntegerArrayDataType;
import oberon.data.VariableDataType;
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

/**
 * The Class VariableConverter.
 */
class VariableConverter extends AbstractConverter<List<IDataType>>{
	private final List<IDataType> list = new ArrayList<IDataType>();

	@Override
	public void caseAVardecl(final AVardecl node) {		
		for (PVardeclaration declaration : node.getVardeclaration()) {
			declaration.apply(this);
		}
	}

	@Override
	public void caseAVardeclaration(final AVardeclaration node) {		
		final PType nodeType = node.getType();
		final Boolean isArray = nodeType instanceof AArrayType;
		
		for (TIdentifier name : node.getIdentifier()) {
			if (isArray) {
				final IExpression lengthExpression = ExpConverterFactory.getExpression(((AArrayType)nodeType).getExp());
				list.add(new IntegerArrayDataType(name.toString().trim(), lengthExpression));
			}
			else {
				list.add(new VariableDataType(name.toString().trim(), false));
			}
		}
	}

	@Override
	public void caseAConstdecl(final AConstdecl node) {
		for (PConstdeclaration declaration : node.getConstdeclaration()) {
			declaration.apply(this);
		}
	}

	@Override
	public void caseAConstdeclaration(final AConstdeclaration node) {
		final String name = node.getIdentifier().toString().trim();
	
		final PExp exp = node.getExp();
		if (exp instanceof AIntegerExp) {
			final int value = Integer.parseInt(((AIntegerExp)exp).getInteger().getText());
			list.add(new VariableDataType(name, value, true));
		}
		else {
			final IExpression expression = ExpConverterFactory.getExpression(node.getExp());
			
			list.add(new ExpressionDataType(name, expression));
		}
	}

	@Override
	public List<IDataType> buildInterpreterResult() {
		return list;
	}
}
