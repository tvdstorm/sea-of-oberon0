package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public class FormalParamsNode {

	private List<FpSectionNode> fpSections;

	public FormalParamsNode() {
		this.fpSections = new ArrayList<FpSectionNode>();
	}

	public List<FpSectionNode> getFpSections() {
		return fpSections;
	}

	public void add(FpSectionNode fpSection) {
		this.fpSections.add(fpSection);
	}

}
