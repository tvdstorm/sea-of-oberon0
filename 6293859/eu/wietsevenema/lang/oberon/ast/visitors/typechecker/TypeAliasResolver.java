package eu.wietsevenema.lang.oberon.ast.visitors.typechecker;

import java.util.Map;
import java.util.TreeMap;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.ArrayType;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.RecordType;
import eu.wietsevenema.lang.oberon.ast.types.TypeAlias;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.TypeNotDeclaredException;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;

public class TypeAliasResolver extends Visitor {

	private TypeCheckerScope scope;

	public TypeAliasResolver(TypeCheckerScope scope) {
		this.scope = scope;
	}

	public IntegerType visit(IntegerType it) {
		return it;
	}
	
	public BooleanType visit(BooleanType bt) {
		return bt;
	}
	
	public ArrayType visit( ArrayType at){
		VarType resolved = (VarType) dispatch(at.getType());
		return new ArrayType(at.getExpression(), resolved);
	}
	
	public RecordType visit(RecordType rt){
		TreeMap<Identifier, VarType> elements = new TreeMap<Identifier, VarType>();
		for(Map.Entry<Identifier, VarType> entry : rt.entrySet()){
			VarType resolved = (VarType) dispatch(entry.getValue());
			elements.put(entry.getKey(), resolved);
		}
		return new RecordType(elements); 
	}
	
	public VarType visit(TypeAlias alias) throws TypeNotDeclaredException{
		return scope.lookupType(alias.getIdentifier().getName());
	}
	
	

}
