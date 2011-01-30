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
import com.arievanderveek.soo.ast.variables.AbstractDeclarationNode;
import com.arievanderveek.soo.ast.variables.ArrayTypeNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
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
	 * TODO: Class is to fat and has more then responsibilities namely managing memory,
	 *		Initializing scope and creating symbols. Creation of symbols should be moved 
	 *		to a factory class.
	 *		
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
		procedures = new Hashtable<String, ASTNode>();
		memoryMap = new MemoryMap();
		processDelcarations(constants, types, variables, procedures);
		// Create memory map as this is the root
	}

	/**
	 * 
	 * Constructor for consequent scopes on top of the root scope. This is used for
	 * procedure calls, so procedure headings are processed and stored in the symbol
	 * table.
	 * 
	 * @param enclosingScope
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @throws SeaOfOberonException
	 */
	public Scope(Scope enclosingScope, Map<String, ASTNode> constants,
			Map<String, ASTNode> types, Map<String, ASTNode> variables,
			Map<String, ASTNode> procedures) throws SeaOfOberonException {
		assert enclosingScope != null;
		assert constants != null;
		assert types != null;
		assert variables != null;
		assert procedures != null;
		this.enclosingScope = enclosingScope;
		// An enclosing scope should have a memoryMap so assert this
		assert getMemoryMap() != null; 
		symbolTable = new Hashtable<String, Symbol>();
		procedures = new Hashtable<String, ASTNode>();
		processDelcarations(constants, types, variables, procedures);
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
		return getMemoryMap().getValue(getAddressForSymbol(identNode));
	}

	public void updateValue(IdentifierNode identNode, Integer value)
			throws SeaOfOberonException {
		// Lookup the address for the symbol and return the value from memory
		getMemoryMap().updateValue(getAddressForSymbol(identNode), value);
	}

	public void deleteValue(IdentifierNode identNode)
			throws SeaOfOberonException {
		// Lookup the address for the symbol and return the value from memory
		getMemoryMap().deleteValue(getAddressForSymbol(identNode));
	}

	/**
	 * Stores an Integer Symbol
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
					throw new SeaOfOberonException(
							"Multidimentional arrays not yet supported");
				}

			} else {
				throw new SeaOfOberonException("SymbolType " + symbol.getType()
						+ " not supported");
			}
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
			if (symbol instanceof IntegerSymbol) {
				getMemoryMap().deleteAddress(
						((IntegerSymbol) symbol).getMemoryAdress());
			}
			if (symbol instanceof ArraySymbol) {
				for (MemoryAddress address : ((ArraySymbol) symbol)
						.getAddressList()) {
					getMemoryMap().deleteAddress(address);
				}
			} else {
				// This conditions should never be true!!
				assert false;
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
		this.procedures = procedures;
		// Then register the system procedures (read/write)
	}

	private void registerDeclarations(Map<String, ASTNode> variables,
			Map<String, ASTNode> types, boolean mutable)
			throws SeaOfOberonException {
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

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Scope Contents");
		sb.append(Constants.LINE_SEPARATOR);
		if (!isRootScope()) {
			sb.append("Enclosed Scope Contents");
			sb.append(enclosingScope.toString());
		}
		sb.append(memoryMap.toString());
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
			sb.append(procedures.get(key).toString());
		}
		return sb.toString();
	}
}