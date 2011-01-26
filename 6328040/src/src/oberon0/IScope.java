package oberon0;

public interface IScope {
    public String getScopeName();

    /** Where to look next for symbols;  */
    public IScope getEnclosingScope();

    /** Define a symbol in the current scope */
    public void define(BaseSymbol sym);

    /** Look up name in this scope or in enclosing scope if not here */
    public BaseSymbol resolve(String name);
}