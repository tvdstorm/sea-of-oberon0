package org.elcid.oberon0.exceptions;

/**
 *
 * @author Pieter Brandwijk
 */
public class TypeNotKnownException extends RuntimeException {

    /**
     * Creates a new instance of <code>TypeNotKnownException</code> without detail message.
     */
    public TypeNotKnownException() {
    }


    /**
     * Constructs an instance of <code>TypeNotKnownException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public TypeNotKnownException(String msg) {
        super(msg);
    }
}
