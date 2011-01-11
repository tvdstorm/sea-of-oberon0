/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class ATilfactorFactor extends PFactor
{
    private TTilde _tilde_;
    private PFactor _factor_;

    public ATilfactorFactor()
    {
        // Constructor
    }

    public ATilfactorFactor(
        @SuppressWarnings("hiding") TTilde _tilde_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setTilde(_tilde_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new ATilfactorFactor(
            cloneNode(this._tilde_),
            cloneNode(this._factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATilfactorFactor(this);
    }

    public TTilde getTilde()
    {
        return this._tilde_;
    }

    public void setTilde(TTilde node)
    {
        if(this._tilde_ != null)
        {
            this._tilde_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tilde_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tilde_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tilde_ == child)
        {
            this._tilde_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tilde_ == oldChild)
        {
            setTilde((TTilde) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}