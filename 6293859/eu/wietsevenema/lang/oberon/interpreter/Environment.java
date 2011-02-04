package eu.wietsevenema.lang.oberon.interpreter;

import java.io.InputStream;
import java.io.OutputStream;

import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.visitors.ModuleEvaluator;

public class Environment {

	private SymbolTable symbolTable;
	private OutputStream out;
	private InputStream in;

	public Environment(InputStream in, OutputStream out){
		this.in = in; 
		this.out = out;
		this.symbolTable = new SymbolTable();
		BuiltIns.inject( this );
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public OutputStream getOut() {
		return out;
	}

	public InputStream getIn() {
		return in;
	}

	public void runModule(Module result) {
		ModuleEvaluator me = new ModuleEvaluator(symbolTable);
		me.dispatch(result);
	}
	
}
