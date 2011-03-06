package eu.wietsevenema.lang.oberon.ast.visitors.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import xtc.tree.Node;
import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.FormalVar;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.declarations.ProcedureDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.RecordSelector;
import eu.wietsevenema.lang.oberon.ast.declarations.TypeDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.VarDecl;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.BinaryExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalNegationExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.TestExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.UnaryMinExpression;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureCallStatement;
import eu.wietsevenema.lang.oberon.ast.statements.WhileStatement;
import eu.wietsevenema.lang.oberon.ast.statements.WithStatement;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.RecordType;
import eu.wietsevenema.lang.oberon.ast.types.TypeAlias;
import eu.wietsevenema.lang.oberon.ast.types.VarType;

/**
 * JSON like printer van AST.
 * 
 * @author wietse
 * 
 */
public class ModulePrinter extends Visitor {

	public String visit(TestExpression exp) {
		return (String) dispatch(exp.getChild());
	}

	public String visit(IntegerConstant ic) {
		return "" + ic.getValue();
	}

	public String visit(BooleanConstant ic) {
		if (ic.getValue()) {
			return "true";
		} else {
			return "false";
		}
	}

	public String visit(RecordType record) {
		ArrayList<String> entries = new ArrayList<String>();
		for (Map.Entry<Identifier, VarType> entry : record.entrySet()) {
			entries.add(dispatch(entry.getKey()) + ":" + dispatch(entry.getValue()));
		}
		
		return printNode(record, "{" + join(entries, ",") + "}");
	}

	public String visit(Identifier id) {
		return id.getName();
	}

	public String visit(BinaryExpression exp) {
		return printNode(exp, (String) dispatch(exp.getLeft()), (String) this.dispatch(exp.getRight()));
	}

	public String visit(ArraySelector as) {
		return printNode(as, (String) dispatch(as.getLeft()), (String) dispatch(as.getIndex()));
	}

	public String visit(RecordSelector rs) {
		return printNode(rs, (String) dispatch(rs.getLeft()), (String) dispatch(rs.getKey()));
	}

	private String printNode(Node parent) {
		return parent.getClass().getSimpleName();
	}

	private String printNode(Node parent, String child) {
		return printNode(parent) + "[" + child + "]";
	}

	private String printNode(Node parent, String child1, String child2) {
		return printNode(parent) + "[" + child1 + "," + child2 + "]";
	}

	private String printNode(Node parent, String child1, String child2, String child3) {
		return printNode(parent) + "[" + child1 + "," + child2 + "," + child3 + "]";
	}

	private String printNode(Node parent, String child1, String child2, String child3, String child4) {
		return printNode(parent) + "[" + child1 + "," + child2 + "," + child3 + "," + child4 + "]";
	}
	
	

	private String printNodes(List<? extends Node> ns) {
		if (ns.isEmpty()) {
			return "{}";
		}
		String delimiter = ",";
		ArrayList<String> strings = new ArrayList<String>();
		for (Object n : ns) {
			strings.add((String) dispatch((Node) n));
		}
		return "{" + join(strings, delimiter) + "}";
	}

	public String visit(LogicalNegationExpression lne) {
		return printNode(lne, (String) dispatch(lne.getChild()));
	}

	public String visit(UnaryMinExpression un) {
		return printNode(un, (String) dispatch(un.getChild()));
	}

	public String visit(Declarations decls) {
		return printNode(decls, printNodes(decls.getConstants()), printNodes(decls.getTypes()),
				printNodes(decls.getVars()), printNodes(decls.getProcedures()));
	}

	public String visit(IntegerType it){
		return "INTEGER";
	}
	
	public String visit(BooleanType bt){
		return "BOOLEAN";
	}
	
	public String visit(TypeAlias ta){
		return ta.getIdentifier().getName();
	}
	
	public String visit(VarDecl vd) {
		return printNode(vd, printNodes(vd.getIdentifiers()), (String) dispatch(vd.getType()));
	}

	public String visit(TypeDecl td) {
		return printNode(td, td.getIdentifier().getName(), "" + dispatch(td.getType()));
	}

	public String visit(ProcedureDecl pd) {
		return printNode(pd, pd.getIdentifier().getName(), printNodes(pd.getFormalVars()),
				(String) dispatch(pd.getDeclarations()), printNodes(pd.getStatements()));

	}

	public String visit(AssignmentStatement as) {
		return printNode(as, (String) dispatch(as.getIdentifier()), (String) dispatch(as.getExpression()));
	}

	public String visit(FormalVar fv) {
		return printNode(fv, fv.getIdentifier().getName(), dispatch(fv.getType()) + "");
	}

	public String visit(Module m) {
		return printNode(m, m.getIdentifier().getName(), (String) dispatch(m.getDeclarations()),
				printNodes(m.getStats()));
	}

	public String visit(ProcedureCallStatement pcs) {
		return printNode(pcs, pcs.getIdentifier().getName(), printNodes(pcs.getParameters()));
	}

	public String visit(WhileStatement whileStat) {
		return printNode(whileStat, (String) dispatch(whileStat.getCondition()), printNodes(whileStat.getStatements()));
	}
	
	
	public String visit(WithStatement whileStat) {
		return printNode(whileStat, (String) dispatch(whileStat.getRecord()), printNodes(whileStat.getStatements()));
	}

	private static String join(List<String> s, String delimiter) {
		if (s.isEmpty()) {
			return "";
		}
		Iterator<String> iter = s.iterator();
		StringBuffer buffer = new StringBuffer(iter.next());
		while (iter.hasNext())
			buffer.append(delimiter).append(iter.next());
		return buffer.toString();
	}

}
