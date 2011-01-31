package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.DataTypes.CreatableType;

/*
 * A formal parameter describes a parameter that is expected by a procedure.
 * It describes the type of the parameter and the direction ( in or in and out).
 */
public class FormalParameter
{
	private CreatableType _type;
	private Direction _direction;

	public Direction getDirection()
	{
		return _direction;
	}

	public CreatableType getType()
	{
		return _type;
	}

	public FormalParameter(CreatableType type, Direction direction)
	{
		_type = type;
		_direction = direction;
	}

	/*
	 * The direction is used to indicate that a parameter is a call by value or
	 * a call by reference paramter.
	 */
	public enum Direction
	{
		IN, IN_OUT
	}
}
