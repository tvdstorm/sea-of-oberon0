package oberon0.program;

import java.io.PrintStream;
import java.util.ArrayList;

import oberon0.declaration.Declaration;
import oberon0.declaration.ModuleDeclaration;
import oberon0.environment.Environment;

public class Program {
	
	private final ModuleDeclaration moduleDecl;
	
	public Program (ModuleDeclaration moduleDecl) {
		this.moduleDecl = moduleDecl;
	}
	
	public void run(String args[], PrintStream outStream){
		Environment rootEnv = new Environment(null);
		rootEnv.declare(moduleDecl);
		rootEnv.declare(ioProcedureDeclarations(args,outStream));
		moduleDecl.start(rootEnv);
	}
	
	private ArrayList<Declaration> ioProcedureDeclarations(String args[], PrintStream outStream) {
		ArrayList<Declaration> procedures = new ArrayList<Declaration>();
		procedures.add(new ReadProcedureDeclaration(args));
		procedures.add(new WriteLineProcedureDeclaration(outStream));
		procedures.add(new WriteProcedureDeclararion(outStream));
		return procedures;
	}
}

