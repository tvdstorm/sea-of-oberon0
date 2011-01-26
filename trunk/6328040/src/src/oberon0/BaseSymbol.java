package oberon0;

public abstract class BaseSymbol {
    String name;
    IScope scope;
    public BaseSymbol(String name) { this.name = name; }

    public String getName() { return name; }

    public String toString() {
        String s = "";
        if ( scope!=null ) s = scope.getScopeName()+".";
        return s+getName();
    }
}
