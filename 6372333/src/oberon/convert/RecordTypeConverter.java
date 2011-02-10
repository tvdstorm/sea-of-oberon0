package oberon.convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import oberon.IDataType;
import oberon.data.RecordDataType;
import oberon.node.AFieldlist;
import oberon.node.AFieldlst;
import oberon.node.ARecordType;
import oberon.node.PFieldlist;
import oberon.node.PFieldlst;
import oberon.node.TIdentifier;

public class RecordTypeConverter extends AbstractConverter<IDataType> {
	
	private List<IDataType> fieldList = new ArrayList<IDataType>();
	private String name;
	
	public RecordTypeConverter(String recordName, RecordTypeConverter parentRecordConverter){
		name = recordName;
	}

	@Override
	public void caseAFieldlst(AFieldlst node) {
		for (PFieldlist fieldlist : node.getFieldlist()){
			fieldlist.apply(this);
		}
	}

	@Override
	public void caseAFieldlist(AFieldlist node) {
		ArrayList<String> nameList = new ArrayList<String>();
		for (TIdentifier ident : node.getIdentifier()){
			nameList.add(ident.toString().trim());
		}
		
		TypeConverter converter = new TypeConverter(nameList, this);
		node.getType().apply(converter);
		fieldList.addAll(converter.buildInterpreterResult());
	}

	@Override
	public void caseARecordType(ARecordType node) {
		for (PFieldlst fieldlst : node.getFieldlst()){
			fieldlst.apply(this);
		}
	}

	@Override
	public IDataType buildInterpreterResult() {
		HashMap<String, IDataType> fields = new HashMap<String, IDataType>();
		for (IDataType dataType : fieldList){
			fields.put(dataType.getName(), dataType);
		}
		
		return new RecordDataType(name, fields);
	}

}
