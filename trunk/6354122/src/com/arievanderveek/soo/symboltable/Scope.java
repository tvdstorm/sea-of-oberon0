/**
 * 
 */
package com.arievanderveek.soo.symboltable;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.codeblocks.ProcedureNode;
import com.arievanderveek.soo.ast.variables.AbstractDeclarationNode;
import com.arievanderveek.soo.ast.variables.AbstractParameterNode;
import com.arievanderveek.soo.ast.variables.ArrayTypeNode;
import com.arievanderveek.soo.ast.variables.CallByRefParameterNode;
import com.arievanderveek.soo.ast.variables.CallByValParameterNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.ast.variables.MethodCallParamNode;
import com.arievanderveek.soo.ast.variables.RecordTypeNode;
import com.arievanderveek.soo.ast.variables.SelectorNode;
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
	Map<String, Symbol> symbolTable = new Hashtable<String, Symbol>();
	Map<String, ASTNode> procedures = new Hashtable<String, ASTNode>();

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
	public Scope(Map<String, ASTNode> constants, Map<String, ASTNode> types,
			Map<String, ASTNode> variables, Map<String, ASTNode> procedures)
			throws SeaOfOberonException {
		assert constants != null;
		assert types != null;
		assert variables != null;
		assert procedures != null;
		assert getMemoryMap() == null; // This is the root, so memoryMap MUST be
										// null
		// Create a memory map to store the declarations in.
		symbolTable = new Hashtable<String, Symbol>();
		this.procedures = new Hashtable<String, ASTNode>();
		memoryMap = new MemoryMap();
		processDelcarations(constants, types, variables, procedures);
		// Create memory map as this is the root
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
	public Scope(Scope enclosingScope, ProcedureNode procedure,
			List<ASTNode> parameters) throws SeaOfOberonException {
		// TODO: Rething if procedure is a good param to pass. Increases
		// dependency
		assert enclosingScope != null;
		assert procedure != null;
		assert parameters != null;
		this.enclosingScope = enclosingScope;
		// An enclosing scope should have a memoryMap so assert this
		assert getMemoryMap() != null;
		symbolTable = new Hashtable<String, Symbol>();
		this.procedures = new Hashtable<String, ASTNode>();
		processProcedureParameters(procedure, parameters);
		processDelcarations(procedure.getConstants(), procedure.getTypes(),
				procedure.getVariables(), procedure.getProcedures());
	}

	public ASTNode getProcedure(String name) throws SeaOfOberonException {
		if (procedures.containsKey(name)) {
			return procedures.get(name);
		} else {
			if (!isRootScope()) {
				return enclosingScope.getProcedure(name);
			} else {
				throw new SeaOfOberonException("Procedure " + name
						+ " not found in any scope");
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
	public Integer getValue(IdentifierNode identNode)
			throws SeaOfOberonException {
		// Lookup the address for the symbol and return the value from memory
		// System.out.println("Looking up value for " + identNode.getName());
		return getMemoryMap().getValue(getAddressForSymbol(identNode));
	}

	public void updateValue(IdentifierNode identNode, Integer value)
			throws SeaOfOberonException {
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

	private Symbol copySymbol(String symbolName) throws SeaOfOberonException {
		Symbol originalSymbol = lookupSymbol(symbolName);
		if (originalSymbol != null) {
			if (originalSymbol.getType() == SymbolTypesEnum.INTEGER) {
				return copyIntegerSymbol((IntegerSymbol) originalSymbol);
			}
			if (originalSymbol.getType() == SymbolTypesEnum.ARRAY) {
				return copyArraySymbol((ArraySymbol) originalSymbol);
			} else {
				throw new SeaOfOberonException("Symboltype not supported:"
						+ originalSymbol.getType());
			}
		} else {
			return null;
		}
	}

	private IntegerSymbol copyIntegerSymbol(IntegerSymbol originalSymbol)
			throws SeaOfOberonException {
		MemoryAddress originalAddress = originalSymbol.getMemoryAdress();
		MemoryAddress copyMemoryAddress = getMemoryMap().copyValueToNewAdress(
				originalAddress);
		return new IntegerSymbol(originalSymbol.getName(),
				originalSymbol.isMutable(), copyMemoryAddress);
	}

	private ArraySymbol copyArraySymbol(ArraySymbol originalSymbol)
			throws SeaOfOberonException {
		MemoryAddress[] origMemoryAdressList = originalSymbol.getAddressList();
		MemoryAddress[] copyMemoryAdressList = new MemoryAddress[origMemoryAdressList.length];
		for (int addressCounter = 0; addressCounter < copyMemoryAdressList.length; addressCounter++) {
			copyMemoryAdressList[addressCounter] = getMemoryMap()
					.copyValueToNewAdress(origMemoryAdressList[addressCounter]);
		}
		return new ArraySymbol(originalSymbol.getName(),
				originalSymbol.isMutable(), copyMemoryAdressList);
	}

	/**
	 * Get a memory address for a Symbol
	 * 
	 * @param symbolName
	 *            the name of the Symbol
	 * @throws SeaOfOberonException
	 */
	private MemoryAddress getAddressForSymbol(IdentifierNode identNode)
			throws SeaOfOberonException {
		// Check if the symbol already exists
		String symbolName = identNode.getName();
		if (symbolTable.containsKey(symbolName)) {
			// Get the memory address and and update the value at the memory
			// address
			Symbol symbol = symbolTable.get(symbolName);
			// Make a copy of the selector queue, so we do not destroy it for
			// later usage.
			Queue<ASTNode> selectors = new LinkedList<ASTNode>(
					((SelectorNode) identNode.getSelectors()).getSelectors());
			if (symbol.getType() == SymbolTypesEnum.INTEGER) {
				if (selectors.size() == 0) {
					return ((IntegerSymbol) symbol).getMemoryAdress();
				} else {
					throw new SeaOfOberonException(
							"Found selectors for an Integer "
									+ "Symbol for variable " + symbol.getName());
				}
			} else if (symbol.getType() == SymbolTypesEnum.ARRAY) {
				if (selectors.size() == 1) {
					ASTNode selector = selectors.poll();
					if (selector instanceof IdentifierNode) {
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
							throw new SeaOfOberonException(
									"Expression in selector not "
											+ "correct for symbol "
											+ symbolName);
						}
					}
				} else {
					StringBuilder select = new StringBuilder();
					select.append("Size" + selectors.size());
					ASTNode selector = selectors.poll();
					while (selector != null) {
						select.append(selector.toString());
						select.append(Constants.LINE_SEPARATOR);
					}
					// System.out.println(select.toString());
					// System.out.println(this.toString());
					throw new SeaOfOberonException(
							"Multidimentional arrays not yet supported");
				}

			} else {
				throw new SeaOfOberonException("SymbolType " + symbol.getType()
						+ " not supported");
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
			if (!symbol.referencedSymbol) {
				if (symbol.getType() == SymbolTypesEnum.INTEGER
						&& !symbol.referencedSymbol) {
					getMemoryMap().deleteAddress(
							((IntegerSymbol) symbol).getMemoryAdress());
				} else if (symbol.getType() == SymbolTypesEnum.ARRAY) {
					for (MemoryAddress address : ((ArraySymbol) symbol)
							.getAddressList()) {
						getMemoryMap().deleteAddress(address);
					}
				} else {
					// This conditions should never be true!!
					System.err.println("Neither an Integer or Array"
							+ symbol.getType());
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

	private void processDelcarations(Map<String, ASTNode> constants,
			Map<String, ASTNode> types, Map<String, ASTNode> variables,
			Map<String, ASTNode> procedures) throws SeaOfOberonException {
		registerTypes(types);
		registerDeclarations(constants, types, false);
		registerDeclarations(variables, types, true);
		// up to now procedures do not need processing, so just assign them to
		// the variable
		registerProcedures(procedures);
	}

	/**
	 * @param procedures
	 */
	private void registerTypes(Map<String, ASTNode> procedures) {
		// First add the current procedures
		// TODO: types not supported yet
		// Then register the system procedures (read/write)
	}

	/**
	 * @param procedures
	 */
	private void registerProcedures(Map<String, ASTNode> procedures) {
		// First add the current procedures
		this.procedures = new Hashtable<String, ASTNode>(procedures);
		// Then register the system procedures (read/write)
	}

	private void registerDeclarations(Map<String, ASTNode> variables,
			Map<String, ASTNode> types, boolean mutable)
			throws SeaOfOberonException {
		// TODO: Refactor to use registerDeclaration method.
		for (String identifier : variables.keySet()) {
			// TODO: Abstract declaration is not needed, remove it from the tree
			AbstractDeclarationNode currentNode = (AbstractDeclarationNode) variables
					.get(identifier);
			ASTNode varExpression = currentNode.getExpression();
			if (varExpression instanceof IdentifierNode) {
				// If the identifier node contains they Integer keyword
				IdentifierNode varIdentifier = (IdentifierNode) varExpression;
				// its an identifier, so lookup the value store it as a symbol
				if (Constants.INTEGER_VAR_KEYWORD
						.equalsIgnoreCase(varIdentifier.getName())) {
					addIntegerSymbol(identifier, new Integer(0), mutable);
				} else {
					// Its not the keyword for integer, so look up the type to
					// determine what it is
					System.err.println("Types not supported yet");
					assert false;
					// Integer resolvedExpression = getValue(varIdentifier);
					// addIntegerSymbol(identifier, resolvedExpression,
					// mutable);
				}
			} else if (varExpression instanceof ArrayTypeNode) {
				addArraySymbol(identifier, (ArrayTypeNode) varExpression);
			} else if (varExpression instanceof RecordTypeNode) {
				// TODO: implement RecordTypeNode
				assert false;
			} else {
				// Its a regural expression node, so evaluate it and store as a
				// symbol
				Integer resolvedExpression = varExpression.interpret(this);
				addIntegerSymbol(identifier, resolvedExpression, mutable);
			}
		}
	}

	private void addIntegerSymbol(String identifier, Integer value,
			boolean mutable) throws SeaOfOberonException {
		MemoryAddress memoryAdress = getMemoryMap().addValue(value);
		IntegerSymbol symbol = new IntegerSymbol(identifier, mutable,
				memoryAdress);
		symbolTable.put(symbol.getName(), symbol);
	}

	private void addArraySymbol(String identifier, ArrayTypeNode varArray)
			throws SeaOfOberonException {
		boolean mutable = true; // arrays are always mutable.
		Integer arraySize = varArray.getSizeExpression().interpret(this);
		MemoryAddress[] addressList = new MemoryAddress[arraySize];
		for (int sizeCounter = 0; sizeCounter < arraySize; sizeCounter++) {
			addressList[sizeCounter] = getMemoryMap().addValue(new Integer(0));
		}
		ArraySymbol symbol = new ArraySymbol(identifier, mutable, addressList);
		symbolTable.put(symbol.getName(), symbol);
	}

	/**
	 * @param parameters
	 * @throws SeaOfOberonException
	 */
	private void processProcedureParameters(ProcedureNode procedure,
			List<ASTNode> parameters) throws SeaOfOberonException {
		// loop through all procedure nodes and register them as parameter
		// Keep a counter to match the parameters on the nodes
		int parameterCounter = 0;
		for (ASTNode parameterBlockNode : procedure.getParameterBlocks()) {
			AbstractParameterNode castedParamNode = (AbstractParameterNode) parameterBlockNode;
			if (castedParamNode instanceof CallByRefParameterNode) {
				// Loop over parameters in the paramater block
				for (ASTNode parameter : castedParamNode.getFormalParameter()) {
					MethodCallParamNode castParameter = (MethodCallParamNode) parameter;
					String identifier = castParameter.getName();
					// System.out.println("Ident in keyset" + identifier);
					// Its a call by refernce, so retrieve the referenced
					// parameter
					// and store it in the local symbol map the param name
					ASTNode referencedParamNode = parameters
							.get(parameterCounter);
					// Test if its an identifier, if not throw an exception
					if (referencedParamNode instanceof IdentifierNode) {
						// Get the parameter from the store and put it in local
						// the symbol table under its new name. Assumed its the
						// same
						// type and size.... TODO: write validation.
						IdentifierNode castedRefParamNode = (IdentifierNode) referencedParamNode;
						SelectorNode selectorNode = (SelectorNode) castedRefParamNode
								.getSelectors();
						Symbol referencedSymbol = null;
						if (selectorNode.getSelectors().size() == 0) {
							referencedSymbol = lookupSymbol(castedRefParamNode
									.getName());
						} else {
							Symbol tmpSymbol = lookupSymbol(castedRefParamNode
									.getName());
							if (tmpSymbol.getType() == SymbolTypesEnum.ARRAY) {
								Integer position = selectorNode.getSelectors()
										.peek().interpret(this);
								MemoryAddress address = ((ArraySymbol) tmpSymbol)
										.getAddress(position);
								referencedSymbol = new IntegerSymbol(
										"TMPSYMARRYPOS" + position, true,
										address);
							} else {
								throw new SeaOfOberonException(
										"Found more then 1 selector, but no array");
							}
						}
						// Change the symbol to referenced
						if (referencedSymbol != null) {
							referencedSymbol.setReferncedSymbol(true);
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
					MethodCallParamNode castParameter = (MethodCallParamNode) parameter;
					String identifier = castParameter.getName();
					// System.out.println("Ident in keyset" + identifier);
					ASTNode valParamNode = parameters.get(parameterCounter);
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