package oberon.typechecker;

import oberon.IIdentifier;
import oberon.data.ArrayIndexerIdentifier;
import oberon.data.RecordIndexerIdentifier;
import oberon.data.VariableIdentifier;

public class IdentifierCheckerFactory {

	public static IChecker getChecker(IIdentifier identifier) {
		if (identifier instanceof ArrayIndexerIdentifier){
			return new ArrayIndexerIdentifierChecker((ArrayIndexerIdentifier)identifier);
		}
		else if (identifier instanceof RecordIndexerIdentifier){
			return new RecordIndexerIdentifierChecker((RecordIndexerIdentifier)identifier);
		}
		else if (identifier instanceof VariableIdentifier){
			return new VariableIdentifierIdentifierChecker((VariableIdentifier)identifier);
		}
		throw new NotSupportedException("Unsupported identifier: " + identifier.toString());
	}

}
