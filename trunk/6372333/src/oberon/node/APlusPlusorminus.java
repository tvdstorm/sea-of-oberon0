/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class APlusPlusorminus extends PPlusorminus
{
    private TPlus _plus_;

    public APlusPlusorminus()
    {
        // Constructor
    }

    public APlusPlusorminus(
        @SuppressWarnings("hiding") TPlus _plus_)
    {
        // Constructor
        setPlus(_plus_);

    }

    @Override
    public Object clone()
    {
        return new APlusPlusorminus(
            cloneNode(this._plus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusPlusorminus(this);
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._plus_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
