
package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Minus extends BinaryExpression {

    public Minus(Tree antlrTree) {
        super(antlrTree);
    }
    
    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        int result;

        Int leftResult = (Int) left.evaluate(environment);
        Int rightResult = (Int) right.evaluate(environment);
        result = leftResult.getValue().intValue() - rightResult.getValue().intValue();
        
        return new Int(new Integer(result));
    }

}
