/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class TAss extends Token
{
    public TAss(String text)
    {
        setText(text);
    }

    public TAss(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAss(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAss(this);
    }
}
