package language;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import language.parser.oberonParser;

public class ModuleParseFunc implements IParseFunc {

	@Override
	public ParserRuleReturnScope parse(oberonParser parser) throws RecognitionException {
		assert(parser != null);
		return parser.module();
	}
	
	@Override
	public IAstNode buildAst(CommonTree tree) throws Exception {
		assert(tree != null);
		return AstNodeCreater.createModule(tree);
	}
}
