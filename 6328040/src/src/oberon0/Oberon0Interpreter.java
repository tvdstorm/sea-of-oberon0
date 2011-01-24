package oberon0;

import java.io.IOException;
import java.util.Stack;

import oberon0.grammar.*;
import oberon0.listener.InterpreterListener;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class Oberon0Interpreter {
    public InterpreterListener listener = 						// default response to messages
        new InterpreterListener();

    public static final ReturnValue sharedReturnValue = new ReturnValue();

    /** An adaptor that tells ANTLR to build Oberon0AST nodes */
    public static TreeAdaptor Oberon0Adaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new Oberon0AST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((Oberon0AST)t).token);
        }
        public Object errorNode(TokenStream input, Token start, Token stop,
                                RecognitionException e)
        {
            return new Oberon0ErrorNode(input, start, stop, e);
        }
    };
    
    
    GlobalScope globalScope;   									// global scope is filled by the parser
    MemorySpace globals = new MemorySpace("globals");       	// global memory
    MemorySpace currentSpace = globals;
    Stack<FunctionSpace> stack = new Stack<FunctionSpace>();	// call stack
    Oberon0AST root;               								// the AST represents our code memory
    TokenRewriteStream tokens;
    Oberon0Lexer lex;              								// lexer/parser are part of the processor
    Oberon0Parser parser;

    public void interp(ANTLRFileStream inputfile) throws RecognitionException, IOException {
        globalScope = new GlobalScope();
        lex = new Oberon0Lexer(inputfile);
        tokens = new TokenRewriteStream(lex);
        parser = new Oberon0Parser(tokens);
        parser.setTreeAdaptor(Oberon0Adaptor);

        Oberon0Parser.module_return r = parser.module();
        if ( parser.getNumberOfSyntaxErrors()==0 ) {
            root = (Oberon0AST)r.getTree();
            //System.out.println("tree: "+root.toStringTree());
            ///block(root);
        }
    }

    /** visitor dispatch according to node token type */
    public Object exec(Oberon0AST t) {
        try {
            switch ( t.getType() ) {
                case Oberon0Parser.ASSIGN : assign(t); break;
                case Oberon0Parser.IF : ifstat(t); break;
                case Oberon0Parser.WHILE : whileloop(t); break;
                case Oberon0Parser.PROCEDURECALL 	: return procedurecall(t);
                case Oberon0Parser.ADD 				: return add(t);
                case Oberon0Parser.SUBTRACT 		: return op(t);
                case Oberon0Parser.MULTIPLY 		: return op(t);
                case Oberon0Parser.EQUALS 			: return eq(t);
                case Oberon0Parser.SMALLERTHEN		: return lt(t);
                case Oberon0Parser.INTEGER			: return Integer.parseInt(t.getText());
                case Oberon0Parser.SELECTOR 		: return load(t);
                default : 										// catch unhandled node types
                    throw new UnsupportedOperationException("Node "+
                        t.getText()+"<"+t.getType()+"> not handled");
            }
        }
        catch (Exception e) {
            listener.error("problem executing "+t.toStringTree(), e);
        }
        return null;
    }
    
    public Object procedurecall(Oberon0AST t) {
        // Resolve function's name
        String fname = t.getChild(0).getText();
        FunctionSymbol fs = (FunctionSymbol)t.scope.resolve(fname);
        if ( fs==null ) {
            listener.error("no such function "+fname, t.token);
            return null;
        }
        FunctionSpace fspace = new FunctionSpace(fs);
        MemorySpace saveSpace = currentSpace;
        currentSpace = fspace;

        int argCount = t.getChildCount()-1;
        // check for argument compatibility
        if ( fs.formalArgs==null && argCount>0 || 				// args compatible?
             fs.formalArgs!=null && fs.formalArgs.size()!=argCount ) {
            listener.error("function "+fs.name+" argument list mismatch");
            return null;
        }
        int i = 0; 												// define args according to order in formalArgs
        for (Symbol argS : fs.formalArgs.values()) {
            VariableSymbol arg = (VariableSymbol)argS;
            Oberon0AST ithArg = (Oberon0AST)t.getChild(i+1);
            Object argValue = exec(ithArg);
            fspace.put(arg.name, argValue);
            i++;
        }
        Object result = null;
        stack.push(fspace);        								// PUSH new arg, local scope
        try { exec(fs.blockAST); } 								// do the call
        catch (ReturnValue rv) { result = rv.value; } 			// trap return value
        stack.pop();               								// POP arg, locals
        currentSpace = saveSpace;
        return result;
    }

    public void ret(Oberon0AST t) {
        sharedReturnValue.value = exec((Oberon0AST)t.getChild(0));
        throw sharedReturnValue;
    }

    public void print(Oberon0AST t) {
        Oberon0AST expr = (Oberon0AST)t.getChild(0);
        System.out.println( exec(expr) );
    }

    public void assign(Oberon0AST t) {
        Oberon0AST lhs = (Oberon0AST)t.getChild(0);   			// get operands
        Oberon0AST expr = (Oberon0AST)t.getChild(1);
        Object value = exec(expr);           					// walk/evaluate expr
        if ( lhs.getType()==Oberon0Parser.SELECTOR ) {
        	arrayassign(lhs, value); 							// field ^('=' ^('.' a x) expr)
            return;
        }
        // var assign ^('=' a expr)
        MemorySpace space = getSpaceWithSymbol(lhs.getText());
        if ( space==null ) space = currentSpace; 				// create in current space
        space.put(lhs.getText(), value);         				// store
    }
    
    public void arrayassign(Oberon0AST lhs, Object value) {
    	Oberon0AST o = (Oberon0AST) lhs.getChild(0);
    	Oberon0AST f = (Oberon0AST) lhs.getChild(1);
        String fieldname = f.getText();
        Object a = load(o);
        if ( !(a instanceof ArrayInstance) ) {
            // make a good error message:
            String leftpart = parser.input.toString(lhs.getTokenStartIndex(),
                                                    lhs.getTokenStopIndex()-2);
            String all = parser.input.toString(lhs.getTokenStartIndex(),
                                               lhs.getTokenStopIndex());
            listener.error(leftpart+" is not a struct in "+all, o.token);
            return;
        }
        ArrayInstance struct = (ArrayInstance)a;
        if ( struct.def.resolveMember(fieldname) == null ) {
            listener.error("can't assign; "+struct.name+" has no "+fieldname+
                           " field", f.token);
            return;
        }
        struct.put(fieldname, value);
    }

    public void whileloop(Oberon0AST t) {
        Oberon0AST condStart = (Oberon0AST)t.getChild(0);
        Oberon0AST codeStart = (Oberon0AST)t.getChild(1);
        Boolean c = (Boolean)exec(condStart);
        while ( c ) {
            exec(codeStart);
            c = (Boolean)exec(condStart);
        }
    }

    public void ifstat(Oberon0AST t) {
        Oberon0AST condStart = (Oberon0AST)t.getChild(0);
        Oberon0AST codeStart = (Oberon0AST)t.getChild(1);
        Oberon0AST elseCodeStart = null;
        if ( t.getChildCount()==3 ) elseCodeStart = (Oberon0AST)t.getChild(2);
        Boolean c = (Boolean)exec(condStart);
        if ( ((Boolean)c).booleanValue() ) exec(codeStart);
        else if ( elseCodeStart!=null ) exec(elseCodeStart);
    }

    public boolean eq(Oberon0AST t) {
        Object a = exec( (Oberon0AST)t.getChild(0) );
        Object b = exec( (Oberon0AST)t.getChild(1) );
        return a.equals(b);
    }

    public boolean lt(Oberon0AST t) {
        Object a = exec( (Oberon0AST)t.getChild(0) );
        Object b = exec( (Oberon0AST)t.getChild(1) );
        if ( a instanceof Number && b instanceof Number ) {
            Number x = (Number)a;
            Number y = (Number)b;
            return x.floatValue() < y.floatValue();
        }
        return false;
    }

    public Object op(Oberon0AST t) {
        Object a = exec( (Oberon0AST)t.getChild(0) );
        Object b = exec( (Oberon0AST)t.getChild(1) );
        if ( a instanceof Float || b instanceof Float ) {
            float x = ((Number)a).floatValue();
            float y = ((Number)b).floatValue();
            switch (t.getType()) {
                case Oberon0Parser.ADD 		: return x + y;
                case Oberon0Parser.SUBTRACT : return x - y;
                case Oberon0Parser.MULTIPLY : return x * y;
            }
        }
        if ( a instanceof Integer || b instanceof Integer ) {
            int x = ((Number)a).intValue();
            int y = ((Number)b).intValue();
            switch (t.getType()) {
                case Oberon0Parser.ADD 		: return x + y;
                case Oberon0Parser.SUBTRACT : return x - y;
                case Oberon0Parser.MULTIPLY	: return x * y;
            }
        }
        return 0;
    }
    
    public Object fieldload(Oberon0AST t) { // E.g., a.b in tree ^('.' a b)
    	Oberon0AST expr = (Oberon0AST)t.getChild(0); // get left node or subtree
    	Oberon0AST b = (Oberon0AST)t.getChild(1);    // must be an ID node
        String id = b.getText();
        ArrayInstance struct = (ArrayInstance)load(expr); // find expr
        if ( struct.def.resolveMember(id)==null ) { // is it a struct?
            listener.error(struct.name+" has no "+id+" field", b.token);
            return null;
        }
        return struct.get(id);
    }

    public Object add(Oberon0AST t) {
        Object a = exec( (Oberon0AST)t.getChild(0) );
        Object b = exec( (Oberon0AST)t.getChild(1) );
        if ( a instanceof String || b instanceof String ) {
            return a.toString() + b.toString();
        }
        return op(t);
    }

    public Object load(Oberon0AST t) {
        if ( t.getType()==Oberon0Parser.SELECTOR ) return fieldload(t);
        MemorySpace s = getSpaceWithSymbol(t.getText()); // just a not a.b
        if ( s!=null ) return s.get(t.getText());
        listener.error("no such variable "+t.getText(), t.token);
        return null;
    }


    /** Return scope holding id's value; current func space or global. */
    public MemorySpace getSpaceWithSymbol(String id) {
        if (stack.size()>0 && stack.peek().get(id)!=null) { // in top stack?
            return stack.peek();
        }
        if ( globals.get(id)!=null ) return globals;        // in globals?
        return null;                                        // nowhere
    }
}
