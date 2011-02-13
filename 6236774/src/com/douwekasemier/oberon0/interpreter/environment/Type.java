package com.douwekasemier.oberon0.interpreter.environment;
import com.douwekasemier.oberon0.ast.declaration.TypeDeclaration;

public class Type {

    private TypeDeclaration typeDeclaration;

    public Type(TypeDeclaration typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }

    public TypeDeclaration getTypeDeclaration() {
        return typeDeclaration;
    }

    public void setTypeDeclaration(TypeDeclaration typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }
}
