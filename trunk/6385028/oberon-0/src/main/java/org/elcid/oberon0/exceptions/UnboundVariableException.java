/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elcid.oberon0.exceptions;

/**
 *
 * @author pieter
 */
public class UnboundVariableException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnboundVariableException</code> without detail message.
     */
    public UnboundVariableException() {
    }


    /**
     * Constructs an instance of <code>UnboundVariableException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public UnboundVariableException(String msg) {
        super(msg);
    }
}
