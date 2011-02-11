/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AWritelnprocStatement extends PStatement
{
    private PWritelnproc _writelnproc_;

    public AWritelnprocStatement()
    {
        // Constructor
    }

    public AWritelnprocStatement(
        @SuppressWarnings("hiding") PWritelnproc _writelnproc_)
    {
        // Constructor
        setWritelnproc(_writelnproc_);

    }

    @Override
    public Object clone()
    {
        return new AWritelnprocStatement(
            cloneNode(this._writelnproc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWritelnprocStatement(this);
    }

    public PWritelnproc getWritelnproc()
    {
        return this._writelnproc_;
    }

    public void setWritelnproc(PWritelnproc node)
    {
        if(this._writelnproc_ != null)
        {
            this._writelnproc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._writelnproc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._writelnproc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._writelnproc_ == child)
        {
            this._writelnproc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._writelnproc_ == oldChild)
        {
            setWritelnproc((PWritelnproc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}