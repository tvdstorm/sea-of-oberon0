package oberon0;

public class RoutineSpace extends VariableSpace {
	RoutineSymbol def; // what function are we executing?
    public RoutineSpace(RoutineSymbol func) {
		super(func.name+" invocation");
        this.def = func;
	}
}
