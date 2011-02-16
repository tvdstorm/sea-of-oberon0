package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.env.FormalParameter;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class FpSectionNode {

	public abstract List<FormalParameter> process();
	
}
