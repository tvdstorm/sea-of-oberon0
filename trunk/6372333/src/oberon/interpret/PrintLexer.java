package oberon.interpret;

import java.io.PushbackReader;

import oberon.lexer.Lexer;

class PrintLexer extends Lexer
{
  PrintLexer(PushbackReader reader)
  {
    super(reader);
  }

  protected void filter()
  {
    System.out.println(token.getClass() +
                       ", state : " + state.id() +
                       ", text : [" + token.getText() + "]");
  }
}

