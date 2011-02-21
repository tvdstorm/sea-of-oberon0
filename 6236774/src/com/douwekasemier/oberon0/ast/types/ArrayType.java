package com.douwekasemier.oberon0.ast.types;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.ast.builders.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ArrayType extends AST implements Initializable {

    private Initializable vartype;
    private Evaluatable sizeExpression;

    public ArrayType(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.ARRAY);

        vartype = TypeBuilder.build(antlrTree.getChild(0));
        sizeExpression = ExpressionBuilder.build(antlrTree.getChild(1));
    }

    @Override
    public Value initialize(Environment environment) {
        Int size = null;
        try {
            size = (Int) sizeExpression.evaluate(environment);
        } catch (ClassCastException e) {
            throw new Oberon0Exception();
        }
        
        return new Array(environment, vartype, size.getValue().intValue());
    }
}
