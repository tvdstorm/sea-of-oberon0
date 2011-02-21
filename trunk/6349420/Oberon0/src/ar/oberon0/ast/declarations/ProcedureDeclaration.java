package ar.oberon0.ast.declarations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.ast.statements.StatementSequence;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.lists.FormalParameterList;
import ar.oberon0.lists.ProcedureList;
import ar.oberon0.lists.TypeIdentifierList;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.runtime.Procedure;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.TechnicalException;

/*
 * This class contains all the data of a procedure. It contains data about the parameters, 
 * the direction of the parameters, the statements to execute, the child procedures, etc.
 * A procedure decleration can create a procedure instance that is executable.
 */
public class ProcedureDeclaration {
	private String name;
	private Context context;
	private StatementSequence statementSequence;
	/*
	 * The formal parameters descripe the parameters of the procedure (direction
	 * and type).
	 */
	private FormalParameterList formalParameters;

	public final void setFormalParameters(final FormalParameterList formalParameters) {
		this.formalParameters = formalParameters;
	}

	public final void setChildProcedures(final ProcedureList procedures) {
		this.context.setProcedures(procedures);
		this.context.addProcedure(this.name, this);
	}

	public final void setStatementSequence(final StatementSequence statements) {
		this.statementSequence = statements;
	}

	public final void setVars(final DataFieldList vars) {
		this.context.addVariables(vars);
	}

	public final void setTypes(final TypeIdentifierList typeIdentifiers) {
		this.context.addTypeIdentifiers(typeIdentifiers);
	}

	public final void setConstants(final ConstantList constants) {
		this.context.addConstants(constants);
	}

	public ProcedureDeclaration(final String name) {
		this.context = new Context();
		this.name = name;
	}

	/*
	 * Create a procedure that can be interpreted (executed).
	 */
	public final Procedure createProcedure(final Context context, final List<DataField> actualParameters) throws TechnicalException {
		Context procedureContext = this.context.clone();
		procedureContext.setParentContext(context);
		checkAndAddActualParametersToContext(actualParameters, procedureContext);
		Procedure procedure = new Procedure(this.statementSequence, procedureContext);
		return procedure;
	}

	public final List<CheckViolation> checkParameters(final Context context, final List<DataField> actualParameters) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		if (!isFormalAndActualParamaterCountSame(this.formalParameters, actualParameters)) {
			violations.add(new CheckViolation("The number of actual parameters does not match the number of formal parameters.", this.getClass()));
		}
		for (int i = 0; i < this.formalParameters.getCount(); i++) {
			DataField rawParameter = actualParameters.get(i);
			CreatableType formalParameterType = this.formalParameters.getFormalParameter(i).getType();
			if (!rawParameter.getType().equals(formalParameterType)) {
				violations.add(new CheckViolation("The type of parameter \"" + this.formalParameters.getNameOfParameter(i) + "\" did not match the type of the formal parameter in the function \""
						+ this.name + "\".", this.getClass()));
			}
		}
		return violations;
	}

	public final List<CheckViolation> check(final Context context) {
		Context procedureContext = this.context.clone();
		procedureContext.setParentContext(context);
		for (int i = 0; i < this.formalParameters.getCount(); i++) {
			procedureContext.addVariable(this.formalParameters.getNameOfParameter(i), new DataField(this.formalParameters.getFormalParameter(i).getType()));
		}

		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(this.statementSequence.check(procedureContext));
		ProcedureList procedures = procedureContext.getProcedures();
		for (Entry<String, ProcedureDeclaration> dec : procedures) {
			if (!dec.getKey().equals(this.name)) {
				violations.addAll(dec.getValue().check(procedureContext));
			}
		}
		return violations;
	}

	/*
	 * This function checks if the actual parameters are of the expected type
	 * and if so it adds the parameters to the context.
	 */
	private void checkAndAddActualParametersToContext(final List<DataField> actualParameters, final Context context) throws TechnicalException {
		if (containsFormalParameters()) {
			if (!isFormalAndActualParamaterCountSame(this.formalParameters, actualParameters)) {
				throw new TechnicalException("The number of actual parameters did not match the number of formal parameters.");
			}
			for (int i = 0; i < this.formalParameters.getCount(); i++) {
				DataField rawParameter = actualParameters.get(i);
				DataField parameterForContext = null;
				if (this.formalParameters.getFormalParameter(i).getDirection() == FormalParameter.Direction.IN) {
					parameterForContext = rawParameter.clone();
				} else {
					parameterForContext = rawParameter;
				}
				context.addVariable(this.formalParameters.getNameOfParameter(i), parameterForContext);
			}
		}
	}

	private boolean isFormalAndActualParamaterCountSame(final FormalParameterList formalParameters, final List<DataField> actualParameters) {
		return formalParameters.getCount() == actualParameters.size();
	}

	private boolean containsFormalParameters() {
		return (formalParameters != null && formalParameters.getCount() > 0);
	}
}
