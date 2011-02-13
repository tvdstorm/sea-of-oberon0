package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class LiteralInteger extends LiteralExpression {

    private Integer value;

    public LiteralInteger() {
        super();
        this.value = new Integer(0);
    }
    
    public LiteralInteger(Integer value) {
        super();
        this.value = value;
    }
    
    public LiteralInteger(Tree antlrTree) {
        super(antlrTree);
        value = new Integer(Integer.parseInt(antlrText));
    }

    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        return new Int(value);
    }

}
