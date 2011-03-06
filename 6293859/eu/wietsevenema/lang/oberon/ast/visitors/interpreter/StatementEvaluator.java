package eu.wietsevenema.lang.oberon.ast.visitors.interpreter;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.ProcedureUndefinedException;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ElseIfStatement;
import eu.wietsevenema.lang.oberon.ast.statements.IfStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureCallStatement;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.ast.statements.WhileStatement;
import eu.wietsevenema.lang.oberon.ast.statements.WithStatement;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.WrongNumberOfArgsException;
import eu.wietsevenema.lang.oberon.interpreter.Formal;
import eu.wietsevenema.lang.oberon.interpreter.Procedure;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.RecordValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class StatementEvaluator extends Visitor {

	InterpreterScope scope;

	public StatementEvaluator(InterpreterScope scope) {
		this.scope = scope;
	}

	public void visit(AssignmentStatement assign) throws SymbolNotDeclaredException, TypeMismatchException,
			ImmutableException {
		// 1. Retrieve existing reference.
		ValueReferenceResolver resolv = new ValueReferenceResolver(scope);
		ValueReference currentValRef = (ValueReference) resolv.dispatch(assign.getIdentifier());

		if (currentValRef == null) {
			throw new SymbolNotDeclaredException("Variable not declared. " + assign.getLocation().toString());
		}

		// 2. Evaluate expression
		ExpressionEvaluator eval = new ExpressionEvaluator(scope);
		Value value = (Value) eval.dispatch(assign.getExpression());

		// 3. Assign new value
		currentValRef.setValue(value);

	}

	public void visit(ProcedureCallStatement pCall) throws WrongNumberOfArgsException, IdentifierExpectedInParamList,
			SymbolAlreadyDeclaredException, SymbolNotDeclaredException, TypeMismatchException,
			ProcedureUndefinedException, ValueUndefinedException, ImmutableException {

		// Find procedure node.
		Procedure procedure = (Procedure) scope.lookupProc(pCall.getIdentifier().getName());

		if (procedure == null) {
			throw new ProcedureUndefinedException("Procedure " + pCall.getIdentifier().getName() + " undefined.");
		}

		// Enter scope.
		scope = new InterpreterScope(scope);

		List<Expression> parameters = pCall.getParameters();
		List<Formal> formals = procedure.getFormals();

		if (formals.size() != parameters.size()) {
			throw new WrongNumberOfArgsException();
		}
		for (int i = 0; i < formals.size(); i++) {
			Formal formal = formals.get(i);
			formal.assignParameter(scope, parameters.get(i));
		}

		procedure.execute(scope);
		
		//Exit scope
		scope = scope.getParent();

	}
	
	public void visit( WithStatement withStatement) throws SymbolAlreadyDeclaredException{
		ExpressionEvaluator exprEval = new ExpressionEvaluator(scope);
		RecordValue record = (RecordValue) exprEval.dispatch(withStatement.getRecord());
		
		//Enter new scope and expose members of record. 
		scope = new InterpreterScope(scope);
		for( Entry<Identifier, ValueReference> entry : record.entrySet() ){
			Identifier id = entry.getKey();
			ValueReference reference = entry.getValue();
			String symbol = id.getName();
			scope.declareValueReference(symbol, reference);
		}
		
		//Execute all statements
		StatementEvaluator statEval = new StatementEvaluator(scope);
		for(Statement stat: withStatement.getStatements()){
			statEval.dispatch(stat);
		}
		
		//Exit scope
		scope = scope.getParent();
		
	}
	

	public void visit(IfStatement ifStatement) throws TypeMismatchException, ValueUndefinedException {

		if (evalCondition(ifStatement.getCondition())) {
			// 1. Als de if matched, evalueren we die statement en stoppen de
			// evaluatie.
			visitStatements(ifStatement.getTrueStatements());
			return;
		} else {
			for (Iterator<ElseIfStatement> iterator = ifStatement.getElseIfs().iterator(); iterator.hasNext();) {
				ElseIfStatement elseif = (ElseIfStatement) iterator.next();

				if (evalCondition(elseif.getCondition())) {
					// 2. Zodra er een elseif is gematched en uitgevoerd stopt
					// de evaluatie.
					visitStatements(elseif.getTrueStatements());
					return;
				}
			}

			// 3. Finally, als zowel het if statement en de elseif's falen te
			// matchen, voeren we de else uit.
			visitStatements(ifStatement.getFalseStatements());
			return;

		}

	}

	private void visitStatements(List<Statement> statements) {
		if (!statements.isEmpty()) {
			StatementEvaluator statEval = new StatementEvaluator(scope);
			for (Statement stat : statements) {
				statEval.dispatch(stat);
			}
		}
	}

	private boolean evalCondition(Expression exp) throws TypeMismatchException, ValueUndefinedException {
		ExpressionEvaluator expEval = new ExpressionEvaluator(scope);
		BooleanValue result = (BooleanValue) expEval.dispatch(exp);
		return result.getValue();
	}

	public void visit(WhileStatement whilestat) throws TypeMismatchException, ValueUndefinedException {
		StatementEvaluator statEval = new StatementEvaluator(scope);

		while (evalCondition(whilestat.getCondition())) {
			for (Statement s : whilestat.getStatements()) {
				statEval.dispatch(s);
			}
		}

	}

}
