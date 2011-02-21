package com.douwekasemier.oberon0.ast.types;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Record;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class RecordType extends AST implements Initializable {

    private ArrayList<RecordTypeField> fields;

    public RecordType(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.RECORD);

        fields = new ArrayList<RecordTypeField>();
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            fields.add(new RecordTypeField(antlrTree.getChild(i)));
        }
    }

    @Override
    public Value initialize(Environment environment) {
        Record record = new Record();

        for (RecordTypeField fieldNode : fields) {
            Initializable vartype = fieldNode.getVartype();
            for (String identifier : fieldNode) {
                record.addField(identifier, new Reference(vartype.initialize(environment)));
            }
        }

        return record;
    }
}
