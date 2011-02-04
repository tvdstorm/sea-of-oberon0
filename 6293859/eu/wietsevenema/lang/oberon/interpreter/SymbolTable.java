package eu.wietsevenema.lang.oberon.interpreter;

import java.util.HashMap;
import java.util.Map;

import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class SymbolTable {

	public static class Scope {

		String name;
		Scope parent;

		Map<String, ValueReference> symbols = new HashMap<String, ValueReference>();
		Map<String, Procedure> procs = new HashMap<String, Procedure>();

		public Scope() {
		}
		
		public Scope(Scope parent) {
			this.parent = parent;
		}

		public String getName() {
			return name;
		}

		public Scope getParent() {
			return parent;
		}
		
		public Procedure lookupProc(String symbol) {
			Procedure result = this.lookupProcLocal(symbol);
			if(result == null && this.parent != null){
				result = parent.lookupProc(symbol);
			} 
			return result;
		}
		
		private Procedure lookupProcLocal(String symbol) {
			return procs.get(symbol);
		}

		public Value lookupValue(String symbol) throws VariableNotDeclaredException {
			ValueReference valueRef = this.lookupValueReference(symbol);
			if (valueRef == null) {
				throw new VariableNotDeclaredException();
			}
			return valueRef.getValue();
		}
		
		public Value lookupValueLocal(String symbol) {
			ValueReference valueRef = this.lookupValueReferenceLocal(symbol);
			return (valueRef==null)?null:valueRef.getValue();
		}
		
		public ValueReference lookupValueReference(String symbol) {
			ValueReference result = this.lookupValueReferenceLocal(symbol);
			if(result == null && this.parent != null){
				result = parent.lookupValueReference(symbol);
			}
			return result;
		}
		
		public ValueReference lookupValueReferenceLocal(String symbol) {
			return symbols.get(symbol);
		}
		
		public void declareValue(String symbol, Value value) throws VariableAlreadyDeclaredException  {
			ValueReference valueRef = this.lookupValueReferenceLocal(symbol);
			if(valueRef!=null){ // Variabele bestaat al in deze scope.
				throw new VariableAlreadyDeclaredException();
			}
			this.declareValueReference(symbol, new ValueReference(value));
		}
		
		public void declareValueReference(String symbol, ValueReference valueRef) {
			assert valueRef!=null;
			symbols.put(symbol, valueRef);
		}

		public void declareProc(String symbol, Procedure proc) {
			assert proc!=null;
			procs.put(symbol, proc);
		}


	}

	private Scope current;

	public SymbolTable() {
		current = new Scope();
	}

	public Scope getCurrent() {
		return current;
	}

	
	public void enter() {
		Scope parent = current;
		Scope child = new Scope(parent);
		current = child;
	}

	public void exit() {
		current = current.parent;
	}

	public void declareValue(String symbol, Value value ) throws VariableAlreadyDeclaredException  {
		this.getCurrent().declareValue(symbol, value);
	}
	
	public void declareProc(String symbol, Procedure proc ) {
		this.getCurrent().declareProc(symbol, proc);
	}

	public ValueReference lookupValueReference(String symbol) {
		return this.getCurrent().lookupValueReference(symbol);
	}

	public void declareValueReference(String symbol,ValueReference ref) {
		this.getCurrent().declareValueReference(symbol, ref);
	}

	public Value lookupValue(String symbol) throws VariableNotDeclaredException{
		return this.getCurrent().lookupValue(symbol);
	}
	
	public Procedure lookupProc(String name) {
		return this.getCurrent().lookupProc(name);
	}

	public Value lookupValueLocal(String symbol) {
		return this.getCurrent().lookupValueLocal(symbol);
	}

	public Scope getParent() {
		return this.current.getParent();
	}

}
