package oberon.data;

import oberon.IDataType;

public class RecordIndexerDataType extends AbstractDataType {

	private String index;
	private RecordDataType record;

	public RecordIndexerDataType(final String inputName, final RecordDataType inputRecord, 
			final String inputIndex) {
		super(inputName);
		index = inputIndex;
		record = inputRecord;
	}

	public RecordIndexerDataType(RecordDataType recordDataType,
			String inputIndex) {
		super(recordDataType.getName());
		record = recordDataType;
		index = inputIndex;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getValue() {
		return record.getValueAtIndex(index);
	}

	@Override
	public IDataType copy(String newName) {
		return new RecordIndexerDataType(newName, record, index);
	}

}
