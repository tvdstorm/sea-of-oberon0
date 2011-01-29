package jdm.oberon0.types;

/**
 * Interface implemented by runtime types. 
 * Runtime types are used to store type declarations.
 */
public interface Type {
	boolean equals(Type other);
}
