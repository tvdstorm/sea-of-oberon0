package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonArray;
import nl.bve.uva.oberon.env.types.Type;

public class ArrayTypeNode implements IInterpretableNode {
	private IInterpretableNode expression;
	private IInterpretableNode arrayType;
	
	public ArrayTypeNode(IInterpretableNode expression, IInterpretableNode arrayType) {
		System.out.println("ArrayTypeNode(" +expression+ ", " +arrayType+ ")");
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public Object interpret(Environment env) {
		System.out.println("ENVIRONMENT: \n" +env.toString()+ "\nEND OF ENVIRONMENT");
		
		Type size = (Type)expression.interpret(env);
		Type type = (Type)arrayType.interpret(env);
		
		return new OberonArray(type, (Integer)size.interpret(env));
	}
}
