/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AReadproc extends PReadproc
{
    private PSelector _selector_;

    public AReadproc()
    {
        // Constructor
    }

    public AReadproc(
        @SuppressWarnings("hiding") PSelector _selector_)
    {
        // Constructor
        setSelector(_selector_);

    }

    @Override
    public Object clone()
    {
        return new AReadproc(
            cloneNode(this._selector_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReadproc(this);
    }

    public PSelector getSelector()
    {
        return this._selector_;
    }

    public void setSelector(PSelector node)
    {
        if(this._selector_ != null)
        {
            this._selector_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._selector_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._selector_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._selector_ == child)
        {
            this._selector_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._selector_ == oldChild)
        {
            setSelector((PSelector) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
