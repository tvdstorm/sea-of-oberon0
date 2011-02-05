package org.elcid.oberon0.exceptions;

/**
 * Thrown when and expression tries to calculate the modulo of 0.
 *
 * @author Pieter Brandwijk
 */
public class ModuloZeroException extends RuntimeException {

    /**
     * Creates a new instance of <code>ModuloZeroException</code> without detail message.
     */
    public ModuloZeroException() {
    }


    /**
     * Constructs an instance of <code>ModuloZeroException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ModuloZeroException(String msg) {
        super(msg);
    }
}
