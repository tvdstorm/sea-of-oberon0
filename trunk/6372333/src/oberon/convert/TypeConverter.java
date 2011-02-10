package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.data.IntegerArrayDataType;
import oberon.data.VariableDataType;
import oberon.node.AArrayType;
import oberon.node.AIdentifierType;
import oberon.node.ARecordType;

public class TypeConverter extends AbstractConverter<List<IDataType>>{
	private List<String> typeNameList;
	private List<IDataType> returnList = new ArrayList<IDataType>();
	private RecordTypeConverter parentRecordConverter;

	public TypeConverter(List<String> nameList, RecordTypeConverter recordTypeConverter){
		typeNameList = nameList;
		parentRecordConverter = recordTypeConverter;
	}

	@Override
	public void caseAArrayType(AArrayType node) {
		final IExpression lengthExpression = ExpConverterFactory.getExpression(node.getExp());
		
		for (String name : typeNameList) {
			returnList.add(new IntegerArrayDataType(name.toString().trim(), lengthExpression));
		}
	}

	@Override
	public void caseARecordType(ARecordType node) {
		for (String name : typeNameList) {
			RecordTypeConverter converter = new RecordTypeConverter(name, parentRecordConverter);
			node.apply(converter);
			returnList.add(converter.buildInterpreterResult());
		}
	}

	@Override
	public void caseAIdentifierType(AIdentifierType node) {
		for (String name : typeNameList) {
			returnList.add(new VariableDataType(name.toString().trim(), false));
		}
	}

	@Override
	public List<IDataType> buildInterpreterResult() {
		return returnList;
	}
}
