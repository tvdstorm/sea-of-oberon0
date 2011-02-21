package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.declarations.ProcedureDeclaration;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.runtime.Procedure;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * This node is used to call a procedure. 
 */
public class ProcedureCallNode implements Interpretable {
	private String procedureName;

	private List<Interpretable> parameters;

	public ProcedureCallNode(final String procedureName, final List<Interpretable> parameters) {
		this.procedureName = procedureName;
		this.parameters = parameters;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		// Get the procedure declaration to create a new procedure.
		ProcedureDeclaration procedureDeclaration = context.getProcedure(this.procedureName);
		// Create a list with parameters to pass to the procedure.
		List<DataField> actualParameters = createParameterList(this.parameters, context);
		// Create the procedure instance.
		Procedure procedureToInvoke = procedureDeclaration.createProcedure(context, actualParameters);
		return procedureToInvoke.interpret(context);
	}

	@Override
	public List<CheckViolation> check(final Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		if (!context.DoesProcedureExist(this.procedureName)) {
			violations.add(new CheckViolation("There is no procedure with the name " + this.procedureName + ".", this.getClass()));
			return violations;
		}
		violations.addAll(context.getProcedure(this.procedureName).checkParameters(context, createParameterList(this.parameters, context)));
		return violations;
	}

	/*
	 * Create a actual parameter list. This function converts all the parameters
	 * that are not of the DataField type into DataField types.
	 */
	private List<DataField> createParameterList(final List<Interpretable> rawParameters, final Context context) throws TechnicalException {
		List<DataField> resultParameters = new ArrayList<DataField>();
		if (rawParameters != null) {
			for (Interpretable rawParameter : rawParameters) {
				// Ensure that the parameter is of the DataField type.
				resultParameters.add(Helper.convertToDataField(rawParameter, context));
			}
		}
		return resultParameters;
	}

}
