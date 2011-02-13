package com.douwekasemier.oberon0.ast;

public abstract class AST {

    protected int antlrType;
    protected String antlrText;
    protected static ASTLogger astLogger = new ASTNullLogger();
    
    public static void setLogger(ASTLogger astLogger) {
        AST.astLogger = astLogger;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + " [type=" + antlrType + "] [text=" + antlrText + "]";
    }
}
