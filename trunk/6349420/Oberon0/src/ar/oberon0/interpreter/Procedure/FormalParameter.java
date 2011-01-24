package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.DataTypes.CreatableType;


public class FormalParameter 
{
	private CreatableType _type;
	private Direction _direction;
		
	public Direction getDirection()
	{
		return _direction;
	}
	
	public FormalParameter(CreatableType type, Direction direction) 
	{
		_type = type;
		_direction = direction;
	}

	public enum Direction
	{
		IN,
		IN_OUT
	}	
}
