package oberon0;

public class ArrayInstance extends MemorySpace {
    ArraySymbol def; // what kind of struct am I?

    public ArrayInstance(ArraySymbol array) {
		super(array.name+" instance");
        this.def = array;
	}
    
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("{");
        boolean first = true;
        for (String fieldName : def.fields.keySet()) {
            Object v = members.get(fieldName);
            if ( !first ) buf.append(", ");
            else first = false;
            buf.append(fieldName);
            buf.append('=');
            buf.append(v);
        }
        buf.append("}");
        return buf.toString();
    }
}
