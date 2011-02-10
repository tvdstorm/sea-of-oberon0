package oberon.test;

import java.io.PushbackReader;

import oberon.lexer.Lexer;

class PrintLexer extends Lexer
{
   PrintLexer(final PushbackReader reader)
   {
       super(reader);
   }

   protected void filter()
   {
       System.out.println(token.getClass() + ", text : [" +
token.getText() + "]");
   }
}
