/**
 * 
 */
package com.arievanderveek.soo.runtime;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.codeblocks.ProcedureNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.ast.expr.Selector;
import com.arievanderveek.soo.ast.expr.Selectors;
import com.arievanderveek.soo.ast.statements.AbstractParameterNode;
import com.arievanderveek.soo.ast.statements.CallByRefParameterNode;
import com.arievanderveek.soo.ast.statements.CallByValParameterNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.ast.variables.TypeNode;
import com.arievanderveek.soo.util.Constants;

/**
 * This object represents a scope for a code block. It can contain nested scopes
 * to support nested code blocks
 * 
 * @author arieveek
 * 
 */
public class Scope {

	/*
	 * TODO: Class is to fat and has more then responsibilities namely managing
	 * memory, Initializing scope and creating symbols. Creation of symbols
	 * should be moved to a factory class.
	 */

	private Scope enclosingScope = null;
	private MemoryMap memoryMap = null;
	Map<String, TypeNode> typeTable;
	Map<String, Symbol> symbolTable;
	Map<String, ProcedureNode> procedures;

	/**
	 * Constructor for root scope as it does not have an enclosing scope. It
	 * automatically gets procedures inserted for system functions like Read()
	 * Write() and WriteLn.
	 * 
	 * It also allocates a memory stack which can be used by all subsequent
	 * scopes.
	 * 
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @throws SeaOfOberonException
	 */
	public Scope(List<ConstantNode> constants, List<FieldNode> types,
			List<FieldNode> variables, List<ProcedureNode> procedures)
			throws SeaOfOberonException {
		assert constants != null;
		assert types != null;
		assert variables != null;
		assert procedures != null;
		// This is the root, so memoryMap MUST be null.
		assert getMemoryMap() == null; 
		// Create a memory map to store the declarations in.
		symbolTable = new Hashtable<String, Symbol>();
		typeTable = new Hashtable<String, TypeNode>();
		this.procedures = new Hashtable<String, ProcedureNode>();
		memoryMap = new MemoryMap();
		registerTypes(types);
		registerConstants(constants);
		registerVariables(variables);
		registerProcedures(procedures);
	}

	/**
	 * 
	 * Constructor for consequent scopes on top of the root scope. This is used
	 * for procedure calls, so procedure headings are processed and stored in
	 * the symbol table.
	 * 
	 * @param enclosingScope
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @throws SeaOfOberonException
	 */
	public Scope(Scope enclosingScope, ProcedureNode procedure, List<ExpressionNode> actualParameters)
			throws SeaOfOberonException {
		// TODO: Rething if procedure is a good param to pass. Increases
		// dependency
		assert enclosingScope != null;
		assert procedure != null;
		assert actualParameters != null;
		this.enclosingScope = enclosingScope;
		// An enclosing scope should have a memoryMap so assert this
		assert getMemoryMap() != null;
		symbolTable = new Hashtable<String, Symbol>();
		typeTable = new Hashtable<String, TypeNode>();
		this.procedures = new Hashtable<String, ProcedureNode>();
		processProcedureParameters(procedure, actualParameters);
		registerConstants(procedure.getConstants());
		registerTypes(procedure.getTypes());
		registerVariables(procedure.getVariables());
		registerProcedures(procedure.getProcedures());
	}

	/**
	 * Registers the procedures for this scope
	 * 
	 * @param procedures A list of procedures
	 */
	private void registerProcedures(List<ProcedureNode> procedures) {
		// First add the current procedures
		for(ProcedureNode procedure : procedures){
			this.procedures.put(procedure.getCodeBlockName(), procedure);
		}
	}
	
	/**
	 * Registers the types in the type table for this scope
	 * 
	 * @param types A list of types
	 */
	private void registerTypes(List<FieldNode> types) {
		for (FieldNode node : types) {
			typeTable.put(node.getName(), node.getType());
		}
	}
	
	/**
	 * Registers the constants for this scope
	 * 
	 * @param constants A list of constants
	 * @throws SeaOfOberonException
	 */
	private void registerConstants(List<ConstantNode> constants) throws SeaOfOberonException{
		for (ConstantNode constant : constants){
			Integer evaluatedExpression = constant.getExpression().interpret(this);
			addIntegerSymbol(constant.getName(), evaluatedExpression, false);
		}
	}
	
	private void registerVariables(List<FieldNode> variables) throws SeaOfOberonException {
		for ( FieldNode fieldNode : variables){
			registerVariable(fieldNode.getName(), fieldNode.getType());
		}
	}
	
	public void registerVariable(String name, TypeNode type) throws SeaOfOberonException{
		type.registerType(name, this);
	}
	

	
	public ProcedureNode getProcedure(String name) throws SeaOfOberonException {
		if (procedures.containsKey(name)) {
			return procedures.get(name);
		} else {
			if (!isRootScope()) {
				return enclosingScope.getProcedure(name);
			} else {
				throw new SeaOfOberonException("Procedure " + name + " not found in any scope");
			}
		}
	}
	
	public TypeNode lookupType(String name) throws SeaOfOberonException {
		if (typeTable.containsKey(name)) {
			return typeTable.get(name);
		} else {
			if (!isRootScope()) {
				return enclosingScope.lookupType(name);
			} else {
				throw new SeaOfOberonException("Type " + name + " not found in any scope");
			}
		}
	}

	/**
	 * Looks up a Symbol in the memory stack and returns it.
	 * 
	 * @param symbolName
	 *            the name of the Symbol
	 * @return Returns a Integer or null if the symbol is not found
	 * @throws SeaOfOberonException
	 */
	public Integer getValue(IdentifierNode identNode) throws SeaOfOberonException {
		// Lookup the address for the symbol and return the value from memory
		// System.out.println("Looking up value for " + identNode.getName());
		return getMemoryMap().getValue(getAddressForSymbol(identNode));
	}

	public void updateValue(IdentifierNode identNode, Integer value) throws SeaOfOberonException {
		// Lookup the address for the symbol and return the value from memory
		// System.out.println("Updating value for " + identNode.getName() +
		// " with value: " + value);
		getMemoryMap().updateValue(getAddressForSymbol(identNode), value);
	}

	/*
	 * Not needed, deleting of values is not permitted. public void
	 * deleteValue(IdentifierNode identNode) throws SeaOfOberonException { //
	 * Lookup the address for the symbol and return the value from memory
	 * getMemoryMap().deleteValue(getAddressForSymbol(identNode)); }
	 */

	private Symbol lookupSymbol(String symbolName) {
		if (symbolTable.containsKey(symbolName)) {
			return symbolTable.get(symbolName);
		} else {
			if (!isRootScope()) {
				return enclosingScope.lookupSymbol(symbolName);
			} else {
				return null;
			}
		}
	}

	/**
	 * Get a memory address for a Symbol
	 * 
	 * @param symbolName
	 *            the name of the Symbol
	 * @throws SeaOfOberonException
	 */
	private MemoryAddress getAddressForSymbol(IdentifierNode identNode) throws SeaOfOberonException {
		// Check if the symbol already exists
		String symbolName = identNode.getName();
		if (symbolTable.containsKey(symbolName)) {
			// Get the memory address and and update the value at the memory
			// address
			Symbol symbol = symbolTable.get(symbolName);
			// Make a copy of the selector queue, so we do not destroy it for
			// later usage.
			Selectors selectors = identNode.getSelectors();
			if (symbol.getType() == SymbolTypesEnum.INTEGER) {
				if (selectors.getSelectors().size() == 0) {
					return ((IntegerSymbol) symbol).getMemoryAdress();
				} else {
					throw new SeaOfOberonException("Found selectors for an Integer "
							+ "Symbol for variable " + symbolName);
				}
			} else if (symbol.getType() == SymbolTypesEnum.ARRAY) {
				if (selectors.getSelectors().size() == 1) {
					return null;
					/*
					Selector selector = selectors.getSelectors().get(0);
					if (selector.g instanceof IdentifierNode) {
						// if its an identifier, lookup the value for the
						// position
						Integer position = getValue((IdentifierNode) selector);
						return ((ArraySymbol) symbol).getAddress(position);
					} else {
						// its must be an ArrayType, evaluate the expression to
						// get the position
						Integer position = selector.interpret(this);
						if (position != null) {
							// The expression resulted in an integer, so get the
							// memory and store the value
							return ((ArraySymbol) symbol).getAddress(position);
						} else {
							// Expression null means the expression is not
							// correct for an Array.
							throw new SeaOfOberonException("Expression in selector not "
									+ "correct for symbol " + symbolName);
						}
					}
					*/
				} else {
					StringBuilder select = new StringBuilder();
					select.append("Size" + selectors.getSelectors().size());
					ASTNode selector = selectors.getSelectors().get(0);
					while (selector != null) {
						select.append(selector.toString());
						select.append(Constants.LINE_SEPARATOR);
					}
					// System.out.println(select.toString());
					// System.out.println(this.toString());
					throw new SeaOfOberonException("Multidimentional arrays not yet supported");
				}

			} else {
				throw new SeaOfOberonException("SymbolType " + symbol.getType() + " not supported");
			}
		} else if (!isRootScope()) {
			return enclosingScope.getAddressForSymbol(identNode);
		} else {
			// If the symbol table does not contain a symbol, it is not defined
			// as a
			// variable, thus throw an exception.
			throw new SeaOfOberonException("Symbol " + symbolName
					+ " is not defined in Symbol Table");
		}
	}

	public Scope popScope() {
		// First remove all Values for the adresses used by this scope
		for (String key : symbolTable.keySet()) {
			Symbol symbol = symbolTable.get(key);
			if (!symbol.isReferencedSymbol()) {
				if (symbol.getType() == SymbolTypesEnum.INTEGER && !symbol.isReferencedSymbol()) {
					getMemoryMap().deleteMemoryAddress(((IntegerSymbol) symbol).getMemoryAdress());
				} else if (symbol.getType() == SymbolTypesEnum.ARRAY) {
					for (MemoryAddress address : ((ArraySymbol) symbol).getAddressList()) {
						getMemoryMap().deleteMemoryAddress(address);
					}
				} else {
					// This conditions should never be true!!
					System.err.println("Neither an Integer or Array" + symbol.getType());
					assert false;
				}
			}
		}
		// now return the enclosing scope
		return enclosingScope;
	}

	/**
	 * Checks if the current scope is the root scope.
	 * 
	 * @return true if root node else false
	 */
	private boolean isRootScope() {
		if (enclosingScope == null) {
			return true;
		} else {
			return false;
		}
	}

	private MemoryMap getMemoryMap() {
		if (isRootScope()) {
			return memoryMap;
		} else {
			return enclosingScope.getMemoryMap();
		}
	}

	public void addIntegerSymbol(String identifier, Integer value, boolean mutable)
			throws SeaOfOberonException {
		MemoryAddress memoryAdress = getMemoryMap().addValue(value);
		IntegerSymbol symbol = new IntegerSymbol(mutable, memoryAdress);
		symbolTable.put(identifier, symbol);
	}

	public void addArraySymbol(String identifier, int arraySize)
			throws SeaOfOberonException {
		boolean mutable = true; // arrays are always mutable.
		MemoryAddress[] addressList = new MemoryAddress[arraySize];
		for (int sizeCounter = 0; sizeCounter < arraySize; sizeCounter++) {
			addressList[sizeCounter] = getMemoryMap().addValue(new Integer(0));
		}
		ArraySymbol symbol = new ArraySymbol(mutable, addressList);
		symbolTable.put(identifier, symbol);
	}

	/**
	 * @param actualParameters
	 * @throws SeaOfOberonException
	 */
	private void processProcedureParameters(ProcedureNode procedure, List<ExpressionNode> actualParameters)
			throws SeaOfOberonException {
		// loop through all procedure nodes and register them as parameter
		// Keep a counter to match the parameters on the nodes
		int parameterCounter = 0;
		for (ASTNode parameterBlockNode : procedure.getParameterBlocks()) {
			AbstractParameterNode castedParamNode = (AbstractParameterNode) parameterBlockNode;
			if (castedParamNode instanceof CallByRefParameterNode) {
				// Loop over parameters in the paramater block
				for (ASTNode parameter : castedParamNode.getFormalParameter()) {
					FieldNode castParameter = (FieldNode) parameter;
					String identifier = castParameter.getName();
					// System.out.println("Ident in keyset" + identifier);
					// Its a call by refernce, so retrieve the referenced
					// parameter
					// and store it in the local symbol map the param name
					ASTNode referencedParamNode = actualParameters.get(parameterCounter);
					// Test if its an identifier, if not throw an exception
					if (referencedParamNode instanceof IdentifierNode) {
						// Get the parameter from the store and put it in local
						// the symbol table under its new name. Assumed its the
						// same
						// type and size.... TODO: write validation.
						IdentifierNode castedRefParamNode = (IdentifierNode) referencedParamNode;
						Selectors selectors = castedRefParamNode.getSelectors();
						Symbol referencedSymbol = null;
						if (selectors.getSelectors().size() == 0) {
							referencedSymbol = lookupSymbol(castedRefParamNode.getName());
						} else {
							/*Symbol tmpSymbol = lookupSymbol(castedRefParamNode.getName());
							if (tmpSymbol.getType() == SymbolTypesEnum.ARRAY) {
								Integer position = selectors.get(0).interpret(this);
								MemoryAddress address = ((ArraySymbol) tmpSymbol)
										.getAddress(position);
								referencedSymbol = new IntegerSymbol(true, address);
							} else {
								throw new SeaOfOberonException(
										"Found more then 1 selector, but no array");
							}*/
						}
						// Change the symbol to referenced
						if (referencedSymbol != null) {
							referencedSymbol.setReferencedSymbol(true);
							String newSymbolName = identifier;
							symbolTable.put(newSymbolName, referencedSymbol);
							// Succesfully processed symbol so up the parameter
							// count
							parameterCounter++;
						} else {
							throw new SeaOfOberonException(
									"Referenced symbol does not exist in any scope. Name: "
											+ identifier);
						}
					} else {
						throw new SeaOfOberonException(
								"CallbyRef Parameter not mapped to identifier at index: "
										+ parameterCounter);
					}
				}
			} else if (castedParamNode instanceof CallByValParameterNode) {
				// TODO: Implemented shortcut, so only Integers are used
				// Its a call by value, so evaluate the given parameter and
				// store
				// it locally for all identifiers in the formal parameter list
				for (ASTNode parameter : castedParamNode.getFormalParameter()) {
					FieldNode castParameter = (FieldNode) parameter;
					String identifier = castParameter.getName();
					// System.out.println("Ident in keyset" + identifier);
					ExpressionNode valParamNode = actualParameters.get(parameterCounter);
					Integer evaluatedParam = valParamNode.interpret(this);
					addIntegerSymbol(identifier, evaluatedParam, true);
					parameterCounter++;
				}
			} else {
				throw new SeaOfOberonException(
						"Parameter not reference or value, should not be possible!!");
			}
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Scope Contents");
		sb.append(Constants.LINE_SEPARATOR);
		if (!isRootScope()) {
			sb.append("Enclosed Scope Contents");
			sb.append(enclosingScope.toString());
		}
		sb.append(getMemoryMap().toString());
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Symbols");
		sb.append(Constants.LINE_SEPARATOR);
		for (String key : symbolTable.keySet()) {
			sb.append(symbolTable.get(key).toString());
		}
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("Procedures");
		sb.append(Constants.LINE_SEPARATOR);
		for (String key : procedures.keySet()) {
			sb.append(key);
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();

	}
}