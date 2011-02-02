package org.elcid.oberon0.ast.util;

/**
 * Enummeration of all possible node types in the oberon-0 AST.
 *
 * @author Pieter Brandwijk
 */
public enum NodeType {
	INTEGERNODE,
	IDENTIFIERNODE,
	ARRAYNODE,
	MODULENODE,
	BINARYEXPNODE,
	EQUALSNODE,
	HASHNODE,
	LESSERNODE,
	LESSEROREQUALSNODE,
	GREATERNODE,
	GREATEROREQUALSNODE,
	VARIABLEEXPNODE,
	UNARYEXPNODE,
	PLUSNODE,
	MINUSNODE,
	MULTIPLYNODE,
	DIVIDENODE,
	MODULONODE
			;
}