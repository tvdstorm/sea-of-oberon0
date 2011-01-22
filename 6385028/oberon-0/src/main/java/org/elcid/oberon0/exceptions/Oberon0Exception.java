/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elcid.oberon0.exceptions;

/**
 *
 * @author pieter
 */
public class Oberon0Exception extends Exception {

    /**
     * Creates a new instance of <code>Oberon0Exception</code> without detail message.
     */
    public Oberon0Exception() {
    }


    /**
     * Constructs an instance of <code>Oberon0Exception</code> with the specified detail message.
     * @param msg the detail message.
     */
    public Oberon0Exception(String msg) {
        super(msg);
    }
}
