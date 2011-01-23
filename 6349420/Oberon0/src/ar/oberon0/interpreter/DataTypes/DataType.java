package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Interpretable;

public interface DataType extends Interpretable, Comparable 
{
	public DataType Clone();
	public DataType MultiplyBy(DataType value) throws Exception;
	public DataType Add(DataType value) throws Exception;
	public DataType Negate();
	public DataType Subtract(DataType value) throws Exception;
	public DataType Divide(DataType value) throws Exception;
	public DataType Modulo(DataType value) throws Exception;
}
