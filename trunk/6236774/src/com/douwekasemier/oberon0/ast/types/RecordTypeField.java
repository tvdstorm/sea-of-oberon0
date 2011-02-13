package com.douwekasemier.oberon0.ast.types;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.RecordField;
import com.douwekasemier.oberon0.interpreter.environment.Value;

/*   j: RECORD a,b,c: INTEGER; y: INTEGER; z: INTEGER END;
 *   -> (RECORD (FIELD INTEGER, a, b, c) (FIELD INTEGER, y) (FIELD INTEGER, z)
 */

public class RecordTypeField extends AST implements Initializable {

    private Initializable vartype;
    private ArrayList<String> identifiers;

    public RecordTypeField() {
        vartype = null;
        identifiers = new ArrayList<String>();
    }

    public RecordTypeField(Initializable vartype, ArrayList<String> identifiers) {
        this.vartype = vartype;
        this.identifiers = identifiers;
    }

    public RecordTypeField(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        assert (antlrType == Oberon0Parser.FIELD);

        // Var type
        vartype = TypeBuilder.build(antlrTree.getChild(0));

        // Identifiers
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            identifiers.add(antlrTree.getChild(i).getText());
        }
    }

    @Override
    public Value initialize(Environment environment) throws RuntimeException {
        return new RecordField(vartype, identifiers);
    }
}
