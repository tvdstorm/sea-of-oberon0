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
		memoryMap = new MemoryMap();
		processProcedureParameters(procedure, actualParameters);
		registerConstants(procedure.getConstants());
		registerTypes(procedure.getTypes());
		registerVariables(procedure.getVariables());
		registerProcedures(procedure.getProcedures());
	}

	/**
	 * Constructor for With Do statement. It registers the record symbol members
	 * as separate symbols
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
		memoryMap = new MemoryMap();
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
			addIntegerSymbolToTable(constant.getName(), evaluatedExpression, false);
		}
	}

	private void registerVariables(List<FieldNode> variables) throws SeaOfOberonException {
		for (FieldNode fieldNode : variables) {
			fieldNode.getType().registerVariable(fieldNode.getName(), this);
		}
	}

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

	public MemoryMap lookupMemoryManagerForAdress(MemoryAddress address)
			throws SeaOfOberonException {
		if (memoryMap.hasAdress(address)) {
			return memoryMap;
		}
		if (!isRootScope()) {
			return enclosingScope.lookupMemoryManagerForAdress(address);
		}
		throw new SeaOfOberonException("Adress " + address.toString()
				+ " not found in any memorymap");
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
		MemoryAddress address = getAddressForSymbol(identNode);
		return lookupMemoryManagerForAdress(address).getValue(address);
	}

	public void updateValue(IdentifierNode identNode, Integer value) throws SeaOfOberonException {
		MemoryAddress address = getAddressForSymbol(identNode);
		lookupMemoryManagerForAdress(address).updateValue(address, value);
	}

	/**
	 * Gets the memory address for the value of a symbol
	 * 
	 * @param identNode
	 *            The identifier for the symbol
	 * @return The memory address for the value of a symbol
	 * @throws SeaOfOberonException
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

	/*
	 * private MemoryMap getMemoryMap() { if (isRootScope()) { return memoryMap;
	 * } else { return enclosingScope.getMemoryMap(); } }
	 */

	public void addIntegerSymbolToTable(String identifier, Integer value, boolean mutable)
			throws SeaOfOberonException {
		symbolTable.put(identifier, generateIntegerSymbol(value, mutable));
	}

	public void addArraySymbolToTable(String identifier, int arraySize, TypeNode typeNode)
			throws SeaOfOberonException {
		symbolTable.put(identifier, generateArraySymbol(arraySize, typeNode));
	}

	public void addRecordSymbolToTable(String identifier, List<FieldNode> recordMembers)
			throws SeaOfOberonException {
		symbolTable.put(identifier, generateRecordSymbol(recordMembers));
	}

	public IntegerSymbol generateIntegerSymbol(Integer value, boolean mutable)
			throws SeaOfOberonException {
		MemoryAddress memoryAdress = this.memoryMap.addValue(value);
		return new IntegerSymbol(mutable, memoryAdress);

	}

	public ArraySymbol generateArraySymbol(int arraySize, TypeNode typeNode)
			throws SeaOfOberonException {
		boolean mutable = true;
		Symbol[] addressList = new Symbol[arraySize];
		for (int sizeCounter = 0; sizeCounter < arraySize; sizeCounter++) {
			addressList[sizeCounter] = typeNode.createSymbolFromType(this);
		}
		return new ArraySymbol(mutable, addressList);
	}

	public RecordSymbol generateRecordSymbol(List<FieldNode> recordMembers)
			throws SeaOfOberonException {
		boolean mutable = true;
		Map<String, Symbol> content = new Hashtable<String, Symbol>();
		for (FieldNode fieldNode : recordMembers) {
			content.put(fieldNode.getName(), fieldNode.getType().createSymbolFromType(this));
		}
		return new RecordSymbol(mutable, content);
	}

	/**
	 * @param actualParameters
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

	private void registerParameter(FieldNode formalParameter, ExpressionNode actualParameter,
			boolean callByRef) throws SeaOfOberonException {
		String identifier = formalParameter.getName();
		// Test if its an identifier, if its an expression
		if (actualParameter instanceof IdentifierNode) {
			IdentifierNode castedRefParamNode = (IdentifierNode) actualParameter;
			Symbol referencedSymbol = castedRefParamNode.getSelectors().resolveSelectors(
					lookupSymbol(castedRefParamNode.getName()), this);
			if (callByRef) {
				referencedSymbol.setReferencedSymbol(true);
				symbolTable.put(identifier, referencedSymbol);
			} else {
				Symbol callByValSymbol = referencedSymbol.clone();
				// regenerate the memory addresses for the symbol in the current
				// memory map
				callByValSymbol.regenerateMemoryAddress(this, memoryMap);
				symbolTable.put(identifier, callByValSymbol);
			}
		} else {
			// Its an actual expression, so register the evaluated expression
			// under the formal
			// parameter name
			Integer evaluatedExpression = actualParameter.interpret(this);
			addIntegerSymbolToTable(identifier, evaluatedExpression, true);
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
		sb.append(this.memoryMap.toString());
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