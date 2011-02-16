package oberon.typechecker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.data.RecordDataType;
import oberon.data.RecordIndexerIdentifier;
import oberon.data.VariableIdentifier;

/**
 * The Class RecordIndexerIdentifierChecker.
 */
public class RecordIndexerIdentifierChecker implements IChecker {

	/** The identifier. */
	private final RecordIndexerIdentifier identifier;

	/**
	 * Instantiates a new record indexer identifier checker.
	 *
	 * @param identifier the identifier
	 */
	public RecordIndexerIdentifierChecker(RecordIndexerIdentifier identifier) {
		this.identifier = identifier;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IIdentifier rootSelector = identifier.getSelector();
		IChecker identifierChecker = IdentifierCheckerFactory.getChecker(rootSelector);
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		errorList.addAll(identifierChecker.check(scope));
		
		checkIdentifier(scope, rootSelector, errorList);
		
		return errorList;
	}

	/**
	 * Check identifier.
	 *
	 * @param scope the scope
	 * @param rootSelector the root selector
	 * @param errorList the error list
	 */
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

	/**
	 * Check record.
	 *
	 * @param record the record
	 * @param errorList the error list
	 * @param scope the scope
	 */
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
