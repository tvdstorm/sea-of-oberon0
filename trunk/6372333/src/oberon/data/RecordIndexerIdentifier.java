package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;

public class RecordIndexerIdentifier extends AbstractIdentifier {
	private final String index;
	private final IIdentifier selector;

	public RecordIndexerIdentifier(final IIdentifier recordSelector, 
			final String recordIndex){
		index = recordIndex;
		selector = recordSelector;
	}

	private RecordDataType getDataTypeAsRecordDataType() {
		final IDataType type = selector.getDataTypeValue();
		if (!(type instanceof RecordDataType)) {
			//TODO: throw exception
		}
		
		return ((RecordDataType)type);
	}

	@Override
	public int getSelectorValue() {
		final RecordDataType record = getDataTypeAsRecordDataType();
		return record.getValueAtIndex(index);
	}

	@Override
	public IDataType getDataTypeValue() {
		return new RecordIndexerDataType(getDataTypeAsRecordDataType(), index);
	}
}
