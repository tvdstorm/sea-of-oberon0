package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IStatement;
import oberon.procedures.Declaration;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;
import oberon.typechecker.StatementCheckerFactory;

/**
 * The Class ProcedureHeadingChecker.
 */
public class ProcedureHeadingChecker implements IChecker {

	/** The heading. */
	private final ProcedureHeading heading;

	/**
	 * Instantiates a new procedure heading checker.
	 *
	 * @param heading the heading
	 */
	public ProcedureHeadingChecker(ProcedureHeading heading){
		this.heading = heading;		
	}
	
	/**
	 * Check.
	 */
	public void check(){
		List<AbstractError> errorList = check(new TypeCheckScope("Module"));
		
		if (!errorList.isEmpty()){
			throw new TypeCheckException(errorList);
		}		
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		ProcedureBody body = heading.getBody();
		Declaration declaration = body.getDeclaration();
		scope.addVariables(declaration.getVariables());
		scope.addProcedureDeclarations(declaration.getProcedures());
		
		ArrayList<AbstractError> list = new ArrayList<AbstractError>();
		for (IStatement statement : body.getStatements().getList()){
			list.addAll(StatementCheckerFactory.GetChecker(statement).check(scope));
		}
		
		return list;
	}
}
