package language;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import language.parser.oberonParser;

public interface IParseFunc {
	public ParserRuleReturnScope parse(oberonParser parser) throws RecognitionException;
	public IAstNode buildAst(CommonTree tree) throws Exception;
}
