package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.data.ExpressionDataType;
import oberon.data.VariableDataType;
import oberon.node.AConstdecl;
import oberon.node.AConstdeclaration;
import oberon.node.AIntegerExp;
import oberon.node.AVardecl;
import oberon.node.AVardeclaration;
import oberon.node.PConstdeclaration;
import oberon.node.PExp;
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
		
		ArrayList<String> nameList = new ArrayList<String>();
		for (TIdentifier ident : node.getIdentifier()){
			nameList.add(ident.toString().trim());
		}
		
		TypeConverter converter = new TypeConverter(nameList, null);
		node.getType().apply(converter);
		list.addAll(converter.buildInterpreterResult());
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
