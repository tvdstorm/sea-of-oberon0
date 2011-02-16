package com.douwekasemier.oberon0.ast.types;

import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;

/*   j: RECORD a,b,c: INTEGER; y: INTEGER; z: INTEGER END;
 *   -> (RECORD (FIELD INTEGER, a, b, c) (FIELD INTEGER, y) (FIELD INTEGER, z)
 */

public class RecordTypeField extends AST implements Iterable<String> {

    private Initializable vartype;
    private ArrayList<String> identifiers;

    public RecordTypeField(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        assert (antlrType == Oberon0Parser.FIELD);

        // Add var type node
        vartype = TypeBuilder.build(antlrTree.getChild(0));

        // Add identifier nodes
        identifiers = new ArrayList<String>();
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            identifiers.add(antlrTree.getChild(i).getText());
        }
    }

    public Initializable getVartype() {
        return vartype;
    }

    @Override
    public Iterator<String> iterator() {
        return identifiers.iterator();
    }
}
