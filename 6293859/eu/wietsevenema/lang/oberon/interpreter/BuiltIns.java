package eu.wietsevenema.lang.oberon.interpreter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import eu.wietsevenema.lang.oberon.ast.declarations.FormalVar;
import eu.wietsevenema.lang.oberon.ast.declarations.FormalVarRef;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class BuiltIns {

	public static void inject(Environment environment,Scope scope) throws SymbolAlreadyDeclaredException {
		if (environment != null) {
			scope.declareProc("Write", new Write(environment));
			scope.declareProc("WriteLn", new WriteLn(environment));
			scope.declareProc("Read", new Read(environment));
		}
		scope.declareProc("AssertEqualsInt", new AssertEquals<IntegerType>(new IntegerType()));
		scope.declareProc("AssertEqualsBool", new AssertEquals<BooleanType>(new BooleanType()));
	}

	public static class AssertEquals<T extends VarType> implements Procedure {

		private VarType type;

		public AssertEquals(T type) {
			this.type = type;
		}

		@Override
		public List<Formal> getFormals() {
			ArrayList<Formal> formals = new ArrayList<Formal>();
			formals.add(new FormalVar("expected", this.type));
			formals.add(new FormalVar("actual", this.type));
			return formals;
		}

		@Override
		public void execute(InterpreterScope scope) {
			try {
				Value expected = scope.lookupValue("expected");
				Value actual = scope.lookupValue("actual");
				if (expected == null && actual == null) {
					return;
				}
				if (expected != null && expected.equals(actual)) {
					return;
				}
				throw new AssertionError("Expected " + expected + " but got " + actual);

			} catch (SymbolNotDeclaredException e) {
				throw new IllegalStateException(e);
			}

		}

	}

	public static class WriteLn implements Procedure {
		private PrintWriter out;

		public WriteLn(Environment environment) {
			this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(environment.getOut())));
		}

		@Override
		public List<Formal> getFormals() {
			ArrayList<Formal> formals = new ArrayList<Formal>();
			return formals;
		}

		@Override
		public void execute(InterpreterScope scope) {
			this.out.println();
			this.out.flush();
		}

	}

	public static class Write implements Procedure {
		private PrintWriter out;

		public Write(Environment environment) {
			this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(environment.getOut())));
		}

		@Override
		public List<Formal> getFormals() {
			ArrayList<Formal> formals = new ArrayList<Formal>();
			formals.add(new FormalVar(new Identifier("out"), new IntegerType()));
			return formals;
		}

		@Override
		public void execute(InterpreterScope scope) {
			try {
				Value result = scope.lookupValue("out");
				this.out.print(result.toString());
				this.out.flush();
			} catch (SymbolNotDeclaredException e) {
				throw new IllegalStateException(e);
			}
		}

	}

	public static class Read implements Procedure {
		private BufferedReader in;

		public Read(Environment environment) {
			this.in = new BufferedReader(new InputStreamReader(environment.getIn()));
		}

		@Override
		public List<Formal> getFormals() {
			ArrayList<Formal> formals = new ArrayList<Formal>();
			formals.add(new FormalVarRef(new Identifier("in"), new IntegerType()));
			return formals;
		}

		@Override
		public void execute(InterpreterScope scope) throws TypeMismatchException, ImmutableException, SymbolNotDeclaredException {
			try {
				Integer value = Integer.parseInt(this.in.readLine());
				ValueReference ref = scope.lookupValueReference("in");
				ref.setValue(new IntegerValue(value));
			} catch (NumberFormatException e) {
				throw new RuntimeException(e); // Ay, unchecked exception, maar
												// hier is het wel nodig ivm
												// contract van execute.
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

	}

}
