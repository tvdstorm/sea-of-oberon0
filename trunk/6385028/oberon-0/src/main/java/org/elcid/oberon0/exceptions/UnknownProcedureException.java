package org.elcid.oberon0.exceptions;

/**
 *
 * @author Pieter Brandwijk
 */
public class UnknownProcedureException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnknownProcedureException</code> without detail message.
     */
    public UnknownProcedureException() {
    }


    /**
     * Constructs an instance of <code>UnknownProcedureException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public UnknownProcedureException(String msg) {
        super(msg);
    }
}
