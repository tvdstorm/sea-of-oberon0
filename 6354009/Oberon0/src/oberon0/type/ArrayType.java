package oberon0.type;

import oberon0.expression.ArrayExpression;
import oberon0.expression.Expression;
import oberon0.expression.IdentifierExpression;
import oberon0.expression.IntegerExpression;
import oberon0.identifier.ArrayIndexSelector;
import oberon0.identifier.Identifier;
import oberon0.identifier.Selector;
import oberon0.module.Module;

public class ArrayType extends Type {
	
	private Expression sizeExpression;
	private Type itemsType;
	
	Type [] values;
	
	public ArrayType(Expression sizeExpression, Type itemsType) {
		super(ARRAY_TYPE);
		
		this.sizeExpression = sizeExpression;
		this.itemsType = itemsType;
	}
	
	public ArrayType(Type[] values) {
		super(ARRAY_TYPE);
		
		this.values = values;
	}

	public Type[] getValues() {
		return values;
	}
	

	
	@Override
	public Expression getExpression(Selector selector, Module module) {
		if (selector != null) {
			int index = getIndexValueFromSelector(selector,module);
		
			return values[index].getExpression(selector, module);
		}
		else {
			return new ArrayExpression(this);
		}
	}
	
	@Override
	public void assignExpression(Expression expression, Selector selector, Module module) {
		//Create the array if not already.
		if (values == null) {
			createTypeArray(module);
		}
		
		if (selector != null) {
			int index = getIndexValueFromSelector(selector,module);
			//Finaly give the expression to the type at this index.
			values[index].assignExpression(expression, selector, module);
		}
		else {
			//It is a variable
			if (expression.getType() == IdentifierExpression.TYPE) {
				Identifier ident = ((IdentifierExpression) expression).getIdentifier();
				Expression exp = module.getValueForIdentifier(ident);
				
				//See if this expression has a array type expression we can copy.
				assignExpression(exp, ident.getSelector(), module);
			} 
			else if (expression.getType() == ArrayExpression.TYPE) {
				ArrayType type = ((ArrayExpression)expression).getArrayType();
				
				ArrayType typeCopy = (ArrayType) type.getCopy(module);
				this.values = typeCopy.getValues();
			}
			else {
				//TODO throw exception.
			}
		}
		
	}

	@Override
	public Type getNew() {
		return new ArrayType(sizeExpression, itemsType.getNew());
	}
	
	//COPYING
	@Override
	public Type getCopy(Module module) {
		if (values == null) {
			createTypeArray(module);
		}
		//Copy the values and make a new arraytype.
		Type[] valuesCopy = new Type [values.length];
		for (int i=0; i < values.length;i++) {
			valuesCopy[i]  =  values[i].getCopy(module);
		}
		
		return new ArrayType(valuesCopy);
	}
	
	//HELPERS
	private void createTypeArray(Module module){
		int arraySize = getIntegerValueFromExpression(sizeExpression, module);
		values = new Type [arraySize];
		for (int i=0; i < values.length;i++) {
			values[i]  =  itemsType.getNew();
		}
	}
	
	private int getIndexValueFromSelector(Selector selector, Module module) {
		//Selector must always be a ArrayIndexSelector.
		assert(selector.getType() == ArrayIndexSelector.TYPE);
		ArrayIndexSelector arrIndSel = (ArrayIndexSelector)selector;
		
		//Get the index
		Expression indexExpr = arrIndSel.getIndexExpression();

		return getIntegerValueFromExpression(indexExpr, module);
	}
	
	
	private int getIntegerValueFromExpression (Expression expression, Module module) {
		Expression evaluatedExp = expression.evaluate(module);
		
		//Has to be int type.
		assert (evaluatedExp.getType() == IntegerExpression.TYPE);
		
		IntegerType intType = ((IntegerExpression)evaluatedExp).getIntegerType();
		return intType.getValue();
	}
	
}
