package randy.ast;

public class Tuple<A, B>
{
	private A first;
	private B second;
	
	public Tuple(A _first, B _second)
	{
		first = _first;
		second = _second;
	}
	public A getFirst()
	{
		return first;
	}
	public B getSecond()
	{
		return second;
	}
}
