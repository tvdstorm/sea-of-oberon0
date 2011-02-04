package eu.wietsevenema.lang.oberon.ast.visitors;

import java.util.List;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.ConstantDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.TypeDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.VarDecl;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureDecl;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class DeclarationEvaluator extends Visitor {

	SymbolTable symbolTable;
	
	public DeclarationEvaluator( SymbolTable symbolTable){
		this.symbolTable = symbolTable;
	}
	
	public void visit( Declarations decls ){
		List<ConstantDecl> constantDecls = decls.getConstants();
		for( ConstantDecl c : constantDecls){
			dispatch(c);
		}
		
		List<TypeDecl> typeDecls = decls.getTypes();
		for(TypeDecl t: typeDecls){
			dispatch(t);
		}
		
		List<VarDecl> varDecls = decls.getVars();
		for( VarDecl v : varDecls){
			dispatch(v);
		}
				
		
		List<ProcedureDecl> procDecls = decls.getProcedures();
		for(ProcedureDecl p: procDecls){
			dispatch(p);
		}
		
	}
	
	public void visit( ProcedureDecl procDecl){
		symbolTable.declareProc(procDecl.getIdentifier().getName(), procDecl);
	}
	
	public void visit( ConstantDecl constantDecl){
		Identifier identifier = constantDecl.getIdentifier();
		
		ExpressionEvaluator exprEval = new ExpressionEvaluator(symbolTable);
		Value value = (Value) exprEval.dispatch(constantDecl.getExpression());
		
		ValueReference constRef = ValueReference.createConstant(value);
		symbolTable.declareValueReference(identifier.getName(), constRef );		
	}
	
	public void visit( TypeDecl typeDecl){
		throw new RuntimeException("Type declarations not yet implemented");
	}
	
	public void visit( VarDecl varDecl ) throws VariableAlreadyDeclaredException{
		List<Identifier> identifiers = varDecl.getIdentifiers();
		VarType type = varDecl.getType();
		
		ValueBuilder builder = new ValueBuilder(symbolTable);
		
		for( Identifier id : identifiers){
			Value value = (Value) builder.dispatch(type);
			String symbol = id.getName();
			symbolTable.declareValue(symbol, value);
		}
	}
	
	
}
