package oberon.typechecker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.data.RecordDataType;
import oberon.data.RecordIndexerIdentifier;
import oberon.data.VariableIdentifier;

public class RecordIndexerIdentifierChecker implements IChecker {

	private final RecordIndexerIdentifier identifier;

	public RecordIndexerIdentifierChecker(RecordIndexerIdentifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IIdentifier rootSelector = identifier.getSelector();
		IChecker identifierChecker = IdentifierCheckerFactory.getChecker(rootSelector);
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		errorList.addAll(identifierChecker.check(scope));
		
		checkIdentifier(scope, rootSelector, errorList);
		
		return errorList;
	}

	private void checkIdentifier(TypeCheckScope scope, IIdentifier rootSelector,
			List<AbstractError> errorList) {
		if (rootSelector instanceof VariableIdentifier &&
				errorList.isEmpty()){
			VariableIdentifier recordSelectorIdentifier = (VariableIdentifier)rootSelector;
			IDataType record = scope.getVariable(recordSelectorIdentifier.getText());
			
			if (record instanceof RecordDataType){
				checkRecord((RecordDataType) record, errorList, scope);
				
			}
			else {
				errorList.add(new VariableIsNotARecordError(recordSelectorIdentifier.getText(), scope.getName()));
			}
		}
	}

	private void checkRecord(RecordDataType record, List<AbstractError> errorList, TypeCheckScope scope) {
		Iterator<String> iterator = identifier.getSubRecords().iterator();
		
		while (iterator.hasNext()){
			String subRecord = iterator.next();
			
			record = (RecordDataType) record.getFields().get(subRecord);
		}
		
		if (!record.getFields().containsKey(identifier.getRecordFieldname())){
			errorList.add(new RecordFieldNotFoundError(identifier.getText(), scope.getName()));
		}
	}

}
