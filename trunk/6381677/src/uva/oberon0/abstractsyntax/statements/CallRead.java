package uva.oberon0.abstractsyntax.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uva.oberon0.abstractsyntax.expressions.ExpressionList;
import uva.oberon0.abstractsyntax.expressions.Reference;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee This class represents the build-in Read Method Call.
 */
public class CallRead extends Call {
	public CallRead(ExpressionList actualParameterList) {
		super(actualParameterList);
	}

	@Override
	public int eval(Scope scope) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			scope.setValue(((Reference) getActualParameter(0)).getID(),
					Integer.parseInt(reader.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}

		return 1;
	}
}
