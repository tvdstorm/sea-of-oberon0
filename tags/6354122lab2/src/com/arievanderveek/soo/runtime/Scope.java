/**
 * 
 */
package com.arievanderveek.soo.runtime;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.codeblocks.ProcedureNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.ast.variables.ConstantNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.ast.variables.FormalParameterNode;
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

	private Scope enclosingScope;
	private MemoryManager memoryManager;
	private Map<String, TypeNode> typeTable;
	private Map<String, Symbol> symbolTable;
	private Map<String, ProcedureNode> procedures;

	/**
	 * Constructor for a basic scope without enclosing scope or parameter
	 * processing.
	 * 
	 * @param constants
	 * @param types
	 * @param variables
	 * @param procedures
	 * @throws SeaOfOberonException
	 */
	public Scope(List<ConstantNode> constants, List<FieldNode> types, List<FieldNode> variables,
			List<ProcedureNode> procedures) throws SeaOfOberonException {
		assert constants != null;
		assert types != null;
		assert variables != null;
		assert procedures != null;
		// Create a memory map to store the declarations in.
		this.symbolTable = new Hashtable<String, Symbol>();
		this.typeTable = new Hashtable<String, TypeNode>();
		this.procedures = new Hashtable<String, ProcedureNode>();
		memoryManager = new MemoryManager();
		registerTypes(types);
		registerConstants(constants);
		registerVariables(variables);
		registerProcedures(procedures);
	}

	/**
	 * Constructor for consequent scopes on top of the root scope. This is used
	 * for procedure calls, so procedure headings are processed and stored in
	 * the symbol table.
	 * 
	 * @param enclosingScope
	 *            The enclosing scope
	 * @param procedure
	 *            The procedure called
	 * @param actualParameters
	 *            The actual parameters by which the procedure is called
	 * @throws SeaOfOberonException
	 */

	public Scope(Scope enclosingScope, ProcedureNode procedure,
			List<ExpressionNode> actualParameters) throws SeaOfOberonException {
		// TODO: Rething if procedure is a good param to pass. Increases
		// dependency
		assert enclosingScope != null;
		assert procedure != null;
		assert actualParameters != null;
		this.enclosingScope = enclosingScope;
		symbolTable = new Hashtable<String, Symbol>();
		typeTable = new Hashtable<String, TypeNode>();
		this.procedures = new Hashtable<String, ProcedureNode>();
		memoryManager = new MemoryManager();
		processProcedureParameters(procedure, actualParameters);
		registerConstants(procedure.getConstants());
		registerTypes(procedure.getTypes());
		registerVariables(procedure.getVariables());
		registerProcedures(procedure.getProcedures());
	}

	/**
	 * Scope constructor for With Do statement. It registers the record symbol
	 * members as separate symbols and processes nothing else like procedure
	 * parameters.
	 * 
	 * @param enclosingScope
	 *            The enclosing scope
	 * @param record
	 *            The record used in the With Do statement
	 */
	public Scope(Scope enclosingScope, RecordSymbol record) {
		assert enclosingScope != null;
		assert record != null;
		this.enclosingScope = enclosingScope;
		// put the record members as new symbols in the symbol table.
		this.symbolTable = new Hashtable<String, Symbol>(record.getMembers());
		// Create rest of object with emtpy objects.
		this.typeTable = new Hashtable<String, TypeNode>();
		this.procedures = new Hashtable<String, ProcedureNode>();
		memoryManager = new MemoryManager();
	}

	/**
	 * Looks up a procedure in the current scope. If it is not found it tries
	 * the enclosing scope
	 * 
	 * @param name
	 *            Procedure name
	 * @return Procedure node
	 * @throws SeaOfOberonException
	 *             If the procedure is not found in any scope
	 */
	public ProcedureNode lookupProcedure(String name) throws SeaOfOberonException {
		if (procedures.containsKey(name)) {
			return procedures.get(name);
		} else {
			if (!isRootScope()) {
				return enclosingScope.lookupProcedure(name);
			} else {
				throw new SeaOfOberonException("Procedure " + name + " not found in any scope");
			}
		}
	}

	/**
	 * Looks up a type in the current scope. If it is not found it tries the
	 * enclosing scope
	 * 
	 * @param name
	 *            Type name
	 * @return Type node
	 * @throws SeaOfOberonException
	 *             If the type is not found in any scope
	 */
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
	 * Looks up a Symbol in the current scope. If it is not found it tries the
	 * enclosing scope
	 * 
	 * @param name
	 *            Symbol name
	 * @return Symbol node
	 * @throws SeaOfOberonException
	 *             If the Symbol is not found in any scope
	 */
	public Symbol lookupSymbol(String symbolName) throws SeaOfOberonException {
		if (symbolTable.containsKey(symbolName)) {
			return symbolTable.get(symbolName);
		} else {
			if (!isRootScope()) {
				return enclosingScope.lookupSymbol(symbolName);
			} else {
				throw new SeaOfOberonException("Symbol " + symbolName + " not found in any scope");
			}
		}
	}

	/**
	 * Looks up a MemoryMap in the current scope. If it is not found it tries
	 * the enclosing scope
	 * 
	 * @param address
	 *            The memory address
	 * @return The memory map
	 * @throws SeaOfOberonException
	 *             If the MemoryAddress is not found in any scope
	 */
	public MemoryManager lookupMemoryManagerForAdress(MemoryAddress address)
			throws SeaOfOberonException {
		if (memoryManager.hasAdress(address)) {
			return memoryManager;
		}
		if (!isRootScope()) {
			return enclosingScope.lookupMemoryManagerForAdress(address);
		}
		throw new SeaOfOberonException("Adress " + address.toString()
				+ " not found in any memorymap");
	}

	/**
	 * Creates a new memory address with the given value in the current memory
	 * map
	 * 
	 * @param value
	 *            the value that should be stored in the memory map
	 * @return the created memory address
	 * @throws SeaOfOberonException
	 */
	public MemoryAddress createMemoryAdress(Integer value) throws SeaOfOberonException {
		return memoryManager.addValue(value);
	}

	/**
	 * Looks up the value of a symbol with the identifier and returns it.
	 * 
	 * @param symbolName
	 *            the name of the Symbol
	 * @return Returns a Integer or null if the symbol is not found
	 * @throws SeaOfOberonException
	 */
	public Integer getValue(IdentifierNode identNode) throws SeaOfOberonException {
		MemoryAddress address = getAddressForSymbol(identNode);
		return lookupMemoryManagerForAdress(address).getValue(address);
	}

	/**
	 * Update a value in memory for an identifier
	 * 
	 * @param identNode
	 *            the identifier
	 * @param value
	 *            the value that should be set
	 * @throws SeaOfOberonException
	 */
	public void updateValue(IdentifierNode identNode, Integer value) throws SeaOfOberonException {
		MemoryAddress address = getAddressForSymbol(identNode);
		lookupMemoryManagerForAdress(address).updateValue(address, value);
	}

	/**
	 * Adds a symbol in the symbol table
	 * 
	 * @param identifier
	 *            The identifier under which the symbol should be stored
	 * @param symbol
	 *            the symbol that should be stored
	 * @throws SeaOfOberonException
	 */
	public void addSymbolToTable(String identifier, Symbol symbol) throws SeaOfOberonException {
		symbolTable.put(identifier, symbol);
	}

	/**
	 * Gets the memory address for a symbol
	 * 
	 * @param identNode
	 *            the identifier for a symbol
	 * @return the memoroy address for the symbol
	 * @throws SeaOfOberonException
	 *             If the symbol cannot be found
	 */
	private MemoryAddress getAddressForSymbol(IdentifierNode identNode) throws SeaOfOberonException {
		String symbolName = identNode.getName();
		if (symbolTable.containsKey(symbolName)) {
			// found symbol in current table. Handle any selectors if present.
			Symbol rootSymbol = symbolTable.get(symbolName);
			Symbol resolvedSymbol = identNode.getSelectors().resolveSelectors(rootSymbol, this);
			return ((IntegerSymbol) resolvedSymbol).getMemoryAdress();
		} else if (!isRootScope()) {
			// We did not find the symbol and root scope, so check enclosing
			// scope
			return enclosingScope.getAddressForSymbol(identNode);
		} else {
			// Symbol wasn't found in any table, so throw exception.
			throw new SeaOfOberonException("Symbol " + symbolName
					+ " is not defined in Symbol Table");
		}
	}

	/**
	 * Processes procedure parameters. Maps the actual parameters to the formal
	 * parameters
	 * 
	 * @param procedure
	 *            The procedure which contains the formal parameters
	 * @param actualParameters
	 *            the actual parameters
	 * @throws SeaOfOberonException
	 */
	private void processProcedureParameters(ProcedureNode procedure,
			List<ExpressionNode> actualParameters) throws SeaOfOberonException {
		// loop through all procedure nodes and register them as parameter
		List<FormalParameterNode> formalParameters = procedure.getParameterBlocks();
		for (int parameterCounter = 0; parameterCounter < formalParameters.size(); parameterCounter++) {
			FormalParameterNode formalParameter = formalParameters.get(parameterCounter);
			ExpressionNode actualParameter = actualParameters.get(parameterCounter);
			registerParameter(formalParameter, actualParameter, formalParameter.isCallByReference());
		}
	}

	/**
	 * Registers a single parameter. If it's a call by value parameter a copy of
	 * the symbol with new memory addresses is stored in the symbol table. If
	 * its a call by reference parameter the referenced symbol is looked up and
	 * stored in the local symbol table under its new name
	 * 
	 * @param formalParameter
	 *            A formal parameter
	 * @param actualParameter
	 *            An actual parameter
	 * @param callByRef
	 *            A call by reference indicator
	 * @throws SeaOfOberonException
	 */
	private void registerParameter(FieldNode formalParameter, ExpressionNode actualParameter,
			boolean callByRef) throws SeaOfOberonException {
		String identifier = formalParameter.getName();
		if (actualParameter instanceof IdentifierNode) {
			IdentifierNode castedRefParamNode = (IdentifierNode) actualParameter;
			Symbol referencedSymbol = castedRefParamNode.getSelectors().resolveSelectors(
					lookupSymbol(castedRefParamNode.getName()), this);
			if (callByRef) {
				referencedSymbol.setReferencedSymbol(true);
				symbolTable.put(identifier, referencedSymbol);
			} else {
				Symbol callByValSymbol = referencedSymbol.clone();
				// regenerate the memory addresses, so the assigned values are copied to the
				// the memory manager of this scop to implement call by value.
				callByValSymbol.regenerateMemoryAddress(this, memoryManager);
				symbolTable.put(identifier, callByValSymbol);
			}
		} else {
			// Its an actual expression, so register the evaluated expression
			// under the formal parameter name
			Integer evaluatedExpression = actualParameter.interpret(this);
			MemoryAddress address = createMemoryAdress(evaluatedExpression);
			IntegerSymbol integerSymbol = new IntegerSymbol(true, address);
			symbolTable.put(identifier, integerSymbol);
		}
	}

	/**
	 * Registers the procedures for this scope
	 * 
	 * @param procedures
	 *            A list of procedures
	 */
	private void registerProcedures(List<ProcedureNode> procedures) {
		// First add the current procedures
		for (ProcedureNode procedure : procedures) {
			this.procedures.put(procedure.getCodeBlockName(), procedure);
		}
	}

	/**
	 * Registers the types in the type table for this scope
	 * 
	 * @param types
	 *            A list of types
	 */
	private void registerTypes(List<FieldNode> types) {
		for (FieldNode node : types) {
			typeTable.put(node.getName(), node.getType());
		}
	}

	/**
	 * Registers the constants for this scope
	 * 
	 * @param constants
	 *            A list of constants
	 * @throws SeaOfOberonException
	 */
	private void registerConstants(List<ConstantNode> constants) throws SeaOfOberonException {
		for (ConstantNode constant : constants) {
			Integer evaluatedExpression = constant.getExpression().interpret(this);
			MemoryAddress address = createMemoryAdress(evaluatedExpression);
			IntegerSymbol integerSymbol = new IntegerSymbol(false, address);
			symbolTable.put(constant.getName(), integerSymbol);
		}
	}

	/**
	 * Registers the variables for this scope
	 * 
	 * @param variables
	 *            A list of variables
	 * @throws SeaOfOberonException
	 */
	private void registerVariables(List<FieldNode> variables) throws SeaOfOberonException {
		for (FieldNode fieldNode : variables) {
			fieldNode.getType().registerVariable(fieldNode.getName(), this);
		}
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

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Scope Contents");
		sb.append(Constants.LINE_SEPARATOR);
		if (!isRootScope()) {
			sb.append("Enclosed Scope Contents");
			sb.append(enclosingScope.toString());
		}
		sb.append(this.memoryManager.toString());
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