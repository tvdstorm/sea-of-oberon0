package eu.wietsevenema.lang.oberon.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import xtc.tree.Node;

public class Declarations extends Node {

	private List<ConstantDecl> constants;
	private List<TypeDecl> types;
	private List<VarDecl> vars;
	private List<ProcedureDecl> procedures;

	public Declarations(List<ConstantDecl> cd, List<TypeDecl> td, List<VarDecl> vd, List<ProcedureDecl> pd) {

		// FIXME dit kan 1 array zijn
		this.constants = (cd != null) ? cd : new ArrayList<ConstantDecl>();
		this.types = (td != null) ? td : new ArrayList<TypeDecl>();
		this.vars = (vd != null) ? vd : new ArrayList<VarDecl>();
		this.procedures = (pd != null) ? pd : new ArrayList<ProcedureDecl>();

	}

	public List<ConstantDecl> getConstants() {
		return constants;
	}

	public List<TypeDecl> getTypes() {
		return types;
	}

	public List<VarDecl> getVars() {
		return vars;
	}

	public List<ProcedureDecl> getProcedures() {
		return procedures;
	}

}
