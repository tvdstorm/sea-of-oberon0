package com.arievanderveek.soo.runtime;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;

/**
 * Represents the symbol table containing the runtime variables and procedures.
 * 
 * @author Arie van der Veek
 */
public class SymbolTable {

	private Map<String, Symbol> symbolTable = null;

	public SymbolTable() throws SeaOfOberonException {
		symbolTable = new Hashtable<String, Symbol>();
	}

	/*
	 * public void registerDeclarations(Map<String, ASTNode> constants,
	 * Map<String, ASTNode> types, Map<String, ASTNode> variables, Scope scope)
	 * throws SeaOfOberonException { // Register Constants for (String
	 * identifier : constants.keySet()) { DeclarationNode currentNode =
	 * (DeclarationNode) constants.get(identifier);
	 * registerDeclaration(identifier, currentNode, types, false, scope); } //
	 * Register Constants for (String identifier : variables.keySet()) {
	 * DeclarationNode currentNode = (DeclarationNode)
	 * variables.get(identifier); registerDeclaration(identifier, currentNode,
	 * types, true, scope); }
	 * 
	 * }
	 */

	/*
	 * private void registerDeclaration(String identifier, DeclarationNode
	 * declarationNode, Map<String, ASTNode> types, boolean mutable, Scope
	 * scope) throws SeaOfOberonException { ASTNode varExpression =
	 * declarationNode.getExpression(); if (varExpression instanceof
	 * IdentifierNode) { // If the identifier node contains they Integer keyword
	 * IdentifierNode varIdentifier = (IdentifierNode) varExpression; // its an
	 * identifier, so lookup the value store it as a symbol if
	 * (Constants.INTEGER_VAR_KEYWORD.equalsIgnoreCase(varIdentifier.getName()))
	 * { addIntegerSymbol(identifier, new Integer(0), mutable, scope); } else {
	 * // Its not the keyword for integer, so look up the type // TODO:
	 * implement Type support System.err.println("Types not supported yet");
	 * assert false; } } else if (varExpression instanceof ArrayTypeNode) {
	 * addArraySymbol(identifier, (ArrayTypeNode) varExpression, scope); } else
	 * if (varExpression instanceof RecordTypeNode) { // TODO: implement
	 * RecordTypeNode System.err.println("Types not supported yet"); assert
	 * false; } else { // Its a expression node, so evaluate it and store as a
	 * symbol Integer resolvedExpression = varExpression.interpret(scope);
	 * addIntegerSymbol(identifier, resolvedExpression, mutable, scope); } }
	 */

	/**
	 * Get a memory address for a Symbol
	 * 
	 * @param symbolName
	 *            the name of the Symbol
	 * @throws SeaOfOberonException
	 */
	/*
	 * public MemoryAddress getAddressForSymbol(String symbolName, List<ASTNode>
	 * selectors, Scope scope) throws SeaOfOberonException { // Check if the
	 * symbol already exists if (symbolTable.containsKey(symbolName)) { // Get
	 * the memory address and and update the value at the memory // address
	 * Symbol symbol = symbolTable.get(symbolName); // Make a copy of the
	 * selector queue, so we do not destroy it for // later usage. if
	 * (symbol.getType() == SymbolTypesEnum.INTEGER) { if (selectors.size() ==
	 * 0) { return ((IntegerSymbol) symbol).getMemoryAdress(); } else { throw
	 * new SeaOfOberonException("Found selectors for an Integer Symbol: " +
	 * symbolName); } } else if (symbol.getType() == SymbolTypesEnum.ARRAY) { if
	 * (selectors.size() == 1) { ASTNode selector = selectors.get(0); if
	 * (selector instanceof IdentifierNode) { // if its an identifier, lookup
	 * the value for the // position Integer position =
	 * scope.getValue((IdentifierNode) selector); return ((ArraySymbol)
	 * symbol).getAddress(position); } else { // its must be an ArrayType,
	 * evaluate the expression to // get the position Integer position =
	 * selector.interpret(scope); if (position != null) { // The expression
	 * resulted in an integer, so get the // memory and store the value return
	 * ((ArraySymbol) symbol).getAddress(position); } else { // Expression null
	 * means the expression is not // correct for an Array. throw new
	 * SeaOfOberonException("Expression in selector not " +
	 * "correct for symbol " + symbolName); } } } else { if (selectors.size() >
	 * 1) { StringBuilder sb = new StringBuilder(); sb.append("Size: " +
	 * selectors.size()); for (ASTNode selector : selectors) {
	 * sb.append(selector.toString()); sb.append(Constants.LINE_SEPARATOR); }
	 * throw new SeaOfOberonException(
	 * "Multidimensional Arrays not yet supported. Selectors where: " +
	 * sb.toString()); }else { throw new
	 * SeaOfOberonException("Size of selector for "
	 * +symbolName+" was 0 for array."); } }
	 * 
	 * } else { throw new SeaOfOberonException("SymbolType " + symbol.getType()
	 * + " not supported"); } } else if (!scope.isRootScope()) { return
	 * scope.enclosingScope.lookupAddressForSymbol(symbolName, selectors); }
	 * else { // If the symbol table does not contain a symbol, it is not
	 * defined // as a variable, thus throw an exception. throw new
	 * SeaOfOberonException("Symbol " + symbolName +
	 * " is not defined in Symbol Table"); } }8?
	 * 
	 * public void processProcedureParameters(ProcedureNode procedure,
	 * List<ASTNode> parameters, Scope scope) throws SeaOfOberonException { //
	 * loop through all procedure nodes and register them as parameter // Keep a
	 * counter to match the parameters on the nodes int parameterCounter = 0;
	 * for (ASTNode parameterBlockNode : procedure.getParameterBlocks()) {
	 * AbstractParameterNode castedParamNode = (AbstractParameterNode)
	 * parameterBlockNode; if (castedParamNode instanceof
	 * CallByRefParameterNode) { // Loop over parameters in the paramater block
	 * for (ASTNode parameter : castedParamNode.getFormalParameter()) {
	 * FieldNode castParameter = (FieldNode) parameter; String identifier =
	 * castParameter.getName(); // System.out.println("Ident in keyset" +
	 * identifier); // Its a call by refernce, so retrieve the referenced //
	 * parameter // and store it in the local symbol map the param name ASTNode
	 * referencedParamNode = parameters .get(parameterCounter); // Test if its
	 * an identifier, if not throw an exception if (referencedParamNode
	 * instanceof IdentifierNode) { // Get the parameter from the store and put
	 * it in local // the symbol table under its new name. Assumed its the //
	 * same type and size.... TODO: write validation IdentifierNode
	 * castedRefParamNode = (IdentifierNode) referencedParamNode; Symbol
	 * referencedSymbol = null; if (castedRefParamNode.getSelectors().size() ==
	 * 0) { referencedSymbol = scope.lookupSymbol(castedRefParamNode.getName());
	 * } else { Symbol tmpSymbol =
	 * scope.lookupSymbol(castedRefParamNode.getName()); if (tmpSymbol.getType()
	 * == SymbolTypesEnum.ARRAY) { // TODO: ugly code: selectors need to be
	 * looped over. Integer position = castedRefParamNode.getSelectors().get(0)
	 * .interpret(scope); MemoryAddress address = ((ArraySymbol)
	 * tmpSymbol).getAddress(position); referencedSymbol = new
	 * IntegerSymbol(true, address); } else { throw new
	 * SeaOfOberonException("Found more then 1 selector, but no array"); } } if
	 * (referencedSymbol != null) { referencedSymbol.setReferencedSymbol(true);
	 * symbolTable.put(identifier, referencedSymbol); parameterCounter++; } else
	 * { throw new SeaOfOberonException(
	 * "Referenced symbol does not exist in any scope. Name: " + identifier); }
	 * } else { throw new SeaOfOberonException(
	 * "CallbyRef Parameter not mapped to identifier at index: " +
	 * parameterCounter); } } } else if (castedParamNode instanceof
	 * CallByValParameterNode) { // TODO: Implemented shortcut, so only Integers
	 * are used // Its a call by value, so evaluate the given parameter and //
	 * store // it locally for all identifiers in the formal parameter list for
	 * (ASTNode parameter : castedParamNode.getFormalParameter()) { FieldNode
	 * castParameter = (FieldNode) parameter; String identifier =
	 * castParameter.getName(); // System.out.println("Ident in keyset" +
	 * identifier); ASTNode valParamNode = parameters.get(parameterCounter);
	 * Integer evaluatedParam = valParamNode.interpret(scope);
	 * addIntegerSymbol(identifier, evaluatedParam, true, scope);
	 * parameterCounter++; } } else { throw new SeaOfOberonException(
	 * "Parameter not reference or value, should not be possible!!"); } } }
	 * 
	 * 
	 * /** Processes all procedure parameters and adds them to the scope.
	 * 
	 * @param parameters
	 * 
	 * @throws SeaOfOberonException
	 * 
	 * public void processProcedureParameters(ProcedureNode procedure,
	 * List<ASTNode> parameters, Scope scope) throws SeaOfOberonException { //
	 * loop through all procedure nodes and register them as parameter // Keep a
	 * counter to match the parameters on the nodes int parameterCounter = 0;
	 * for (ASTNode parameterBlockNode : procedure.getParameterBlocks()) {
	 * AbstractParameterNode castedParamNode = (AbstractParameterNode)
	 * parameterBlockNode; if (castedParamNode instanceof
	 * CallByRefParameterNode) { processCallByRefBlock((CallByRefParameterNode)
	 * castedParamNode, parameters, parameterCounter, scope);
	 * parameterCounter++; } else if (castedParamNode instanceof
	 * CallByValParameterNode) { processCallByValBlock((CallByValParameterNode)
	 * castedParamNode, parameters, parameterCounter, scope);
	 * parameterCounter++; } else { System.err.println(
	 * "Parameter not reference or value, should not be possible!!"); assert
	 * false; } } }
	 * 
	 * private void processCallByRefBlock(CallByRefParameterNode paramNode,
	 * List<ASTNode> parameters, int parameterCounter, Scope scope) throws
	 * SeaOfOberonException { // Loop over parameters in the paramater block for
	 * (ASTNode parameter : paramNode.getFormalParameter()) { FieldNode
	 * castParameter = (FieldNode) parameter; String identifier =
	 * castParameter.getName(); ASTNode referencedParamNode =
	 * parameters.get(parameterCounter); // Test if its an identifier, if not
	 * throw an exception if (referencedParamNode instanceof IdentifierNode) {
	 * // Get the parameter from the store and put it in local // the symbol
	 * table under its new name. Assumed its the // same type and size.... TODO:
	 * write validation IdentifierNode castedRefParamNode = (IdentifierNode)
	 * referencedParamNode; Symbol referencedSymbol = null; if
	 * (castedRefParamNode.getSelectors().size() == 0) { referencedSymbol =
	 * scope.lookupSymbol(castedRefParamNode.getName()); } else { Symbol
	 * tmpSymbol = scope.lookupSymbol(castedRefParamNode.getName()); if
	 * (tmpSymbol.getType() == SymbolTypesEnum.ARRAY) { // TODO: ugly code:
	 * selectors need to be looped over. Integer position =
	 * castedRefParamNode.getSelectors().get(0) .interpret(scope); MemoryAddress
	 * address = ((ArraySymbol) tmpSymbol).getAddress(position);
	 * referencedSymbol = new IntegerSymbol(true, address); } else { throw new
	 * SeaOfOberonException("Found more then 1 selector, but no array"); } } if
	 * (referencedSymbol != null) { referencedSymbol.setReferencedSymbol(true);
	 * symbolTable.put(identifier, referencedSymbol); } else { throw new
	 * SeaOfOberonException(
	 * "Referenced symbol does not exist in any scope. Name: " + identifier); }
	 * } else { throw new SeaOfOberonException(
	 * "CallbyRef Parameter not mapped to identifier at index: " +
	 * parameterCounter); } } }
	 * 
	 * private void processCallByValBlock(CallByValParameterNode paramNode,
	 * List<ASTNode> parameters, int parameterCounter, Scope scope) throws
	 * SeaOfOberonException { // TODO: Implemented shortcut, so only Integers
	 * are used // Its a call by value, so evaluate the given parameter and //
	 * store it locally for all identifiers in the formal parameter list for
	 * (ASTNode parameter : paramNode.getFormalParameter()) { FieldNode
	 * castParameter = (FieldNode) parameter; String identifier =
	 * castParameter.getName(); // System.out.println("Ident in keyset" +
	 * identifier); ASTNode valParamNode = parameters.get(parameterCounter);
	 * Integer evaluatedParam = valParamNode.interpret(scope);
	 * addIntegerSymbol(identifier, evaluatedParam, true, scope); } }
	 */

	/**
	 * Looks up a symbol in the symbol table
	 * 
	 * @param symbolName
	 *            The name of the symbol
	 * @return The Symbol
	 */

	public Symbol getSymbol(String symbolName) {
		if (symbolTable.containsKey(symbolName)) {
			return symbolTable.get(symbolName);
		} else {
			return null;
		}
	}

	/*
	 * private void addIntegerSymbol(String identifier, Integer value, boolean
	 * mutable, Scope scope) throws SeaOfOberonException { MemoryAddress
	 * memoryAdress = scope.getMemoryMap().addValue(value); IntegerSymbol symbol
	 * = new IntegerSymbol(mutable, memoryAdress); symbolTable.put(identifier,
	 * symbol); }
	 * 
	 * private void addArraySymbol(String identifier, ArrayTypeNode varArray,
	 * Scope scope) throws SeaOfOberonException { boolean mutable = true; //
	 * arrays are always mutable. Integer arraySize =
	 * varArray.getSizeExpression().interpret(scope); MemoryAddress[]
	 * addressList = new MemoryAddress[arraySize]; for (int sizeCounter = 0;
	 * sizeCounter < arraySize; sizeCounter++) { addressList[sizeCounter] =
	 * scope.getMemoryMap().addValue(new Integer(0)); } ArraySymbol symbol = new
	 * ArraySymbol(mutable, addressList); symbolTable.put(identifier, symbol); }
	 */

	/*
	 * copy methods are now not used, but still in here for some possible future
	 * refactoring. TODO: Check if the copy methods are still needed. private
	 * Symbol copySymbol(String symbolName, Scope scope) throws
	 * SeaOfOberonException { Symbol originalSymbol =
	 * scope.lookupSymbol(symbolName); if (originalSymbol != null) { if
	 * (originalSymbol.getType() == SymbolTypesEnum.INTEGER) { return
	 * copyIntegerSymbol((IntegerSymbol) originalSymbol, scope); } if
	 * (originalSymbol.getType() == SymbolTypesEnum.ARRAY) { return
	 * copyArraySymbol((ArraySymbol) originalSymbol, scope); } else { throw new
	 * SeaOfOberonException("Symboltype not supported:" +
	 * originalSymbol.getType()); } } else { throw new
	 * SeaOfOberonException("Symbol not found, thus cannot copy it"); } }
	 * 
	 * private IntegerSymbol copyIntegerSymbol(IntegerSymbol orgSymbol, Scope
	 * scope) throws SeaOfOberonException { MemoryAddress originalAddress =
	 * orgSymbol.getMemoryAdress(); MemoryAddress copyMemoryAddress =
	 * scope.getMemoryMap() .copyValueToNewAdress(originalAddress); return new
	 * IntegerSymbol(orgSymbol.isMutable(), copyMemoryAddress); }
	 * 
	 * private ArraySymbol copyArraySymbol(ArraySymbol orgSymbol, Scope scope)
	 * throws SeaOfOberonException { MemoryAddress[] origMemoryAdressList =
	 * orgSymbol.getAddressList(); MemoryAddress[] copyMemoryAdressList = new
	 * MemoryAddress[origMemoryAdressList.length]; for (int addressCounter = 0;
	 * addressCounter < copyMemoryAdressList.length; addressCounter++) {
	 * copyMemoryAdressList[addressCounter] =
	 * scope.getMemoryMap().copyValueToNewAdress(
	 * origMemoryAdressList[addressCounter]); } return new
	 * ArraySymbol(orgSymbol.isMutable(), copyMemoryAdressList); }
	 */

	/**
	 * Generates a list of memory addresses for symbols in the symbol table
	 * which are not referenced.
	 * 
	 * @return A list of {@link MemoryAddress}
	 */
	/*public List<MemoryAddress> generateNonRefAddressList(Scope scope) {
		List<MemoryAddress> addressList = new LinkedList<MemoryAddress>();
		for (String identifier : symbolTable.keySet()) {
			Symbol tmpSymbol = symbolTable.get(identifier);
			if (!tmpSymbol.isReferencedSymbol()) {
				if (tmpSymbol.getType() == SymbolTypesEnum.INTEGER) {
					addressList.add(((IntegerSymbol) tmpSymbol).getMemoryAdress());
				} else if (tmpSymbol.getType() == SymbolTypesEnum.ARRAY) {
					for (MemoryAddress address : ((ArraySymbol) tmpSymbol).getAddressList()) {
						addressList.add(address);
					}
				} else {
					// This conditions should never be true!!
					System.err.println("Neither an Integer or Array" + tmpSymbol.getType());
					assert false;
				}

			}

		}
		return addressList;
	}*/
}
