package oberon0.environment;

import java.util.ArrayList;

public class ArrayValue implements IValue {
	private ArrayList<Reference> _references;

	public ArrayValue(IValue type, int size) {
		_references = new ArrayList<Reference>(size);
		while (_references.size() < size) {
			_references.add(new Reference(type));
		}
	}

	public ArrayValue(ArrayList<Reference> references) {
		_references = new ArrayList<Reference>();
		for (Reference ref : references) {
			_references.add(ref.getCopy());
		}
	}

	public Reference getReference(int index) {
		return _references.get(index);
	}

	public IValue getValue(int index) {
		return _references.get(index).getValue();
	}

	public int getSize() {
		return _references.size();
	}

	@Override
	public String toString() {
		String buffer = "[ ";
		for (Reference currentRef : _references) {
			buffer += currentRef.toString() + " ";
		}
		return buffer + "] ";
	}

	public ArrayValue getCopy() {
		return new ArrayValue(_references);
	}
}
