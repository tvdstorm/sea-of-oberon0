/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AStatwithStatement extends PStatement
{
    private PWithstatement _withstatement_;

    public AStatwithStatement()
    {
        // Constructor
    }

    public AStatwithStatement(
        @SuppressWarnings("hiding") PWithstatement _withstatement_)
    {
        // Constructor
        setWithstatement(_withstatement_);

    }

    @Override
    public Object clone()
    {
        return new AStatwithStatement(
            cloneNode(this._withstatement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatwithStatement(this);
    }

    public PWithstatement getWithstatement()
    {
        return this._withstatement_;
    }

    public void setWithstatement(PWithstatement node)
    {
        if(this._withstatement_ != null)
        {
            this._withstatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._withstatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._withstatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._withstatement_ == child)
        {
            this._withstatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._withstatement_ == oldChild)
        {
            setWithstatement((PWithstatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}