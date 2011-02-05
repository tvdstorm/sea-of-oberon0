package ar.oberon0.ast.declarations;

import junit.framework.Assert;
import ar.oberon0.ast.dataTypes.CreatableType;

/*
 * A formal parameter describes a parameter that is expected by a procedure.
 * It describes the type of the parameter and the direction ( in or in/out).
 */
public class FormalParameter {
	private CreatableType type;
	private Direction direction;

	public final Direction getDirection() {
		return this.direction;
	}

	public final CreatableType getType() {
		return this.type;
	}

	public FormalParameter(final CreatableType type, final Direction direction) {
		Assert.assertNotNull("The type parameter can't be null.", type);
		Assert.assertNotNull("The direction parameter can't be null.", direction);
		this.type = type;
		this.direction = direction;
	}

	/*
	 * The direction is used to indicate that a parameter is a call by value or
	 * a call by reference paramter.
	 */
	public enum Direction {
		IN, IN_OUT
	}
}
