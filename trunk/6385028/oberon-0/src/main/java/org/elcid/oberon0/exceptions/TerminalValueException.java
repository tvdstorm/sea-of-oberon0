package org.elcid.oberon0.exceptions;

/**
 * Thrown when a selector is called on a terminal value like integer or Boolean.
 *
 * @author Pieter Brandwijk
 */
public class TerminalValueException extends RuntimeException {

    /**
     * Creates a new instance of <code>TerminalValueException</code> without detail message.
     */
    public TerminalValueException() {
    }


    /**
     * Constructs an instance of <code>TerminalValueException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public TerminalValueException(String msg) {
        super(msg);
    }
}
