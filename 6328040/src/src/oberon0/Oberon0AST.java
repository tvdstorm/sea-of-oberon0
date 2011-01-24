package oberon0;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class Oberon0AST extends CommonTree{
	    public Scope scope; // recorded in parser, used in visitor
	    public Oberon0AST(Token t) { super(t); }
}