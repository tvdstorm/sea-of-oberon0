/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AAdditionaloperations extends PAdditionaloperations
{
    private PTermoperator _termoperator_;
    private PFactor _factor_;

    public AAdditionaloperations()
    {
        // Constructor
    }

    public AAdditionaloperations(
        @SuppressWarnings("hiding") PTermoperator _termoperator_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setTermoperator(_termoperator_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new AAdditionaloperations(
            cloneNode(this._termoperator_),
            cloneNode(this._factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionaloperations(this);
    }

    public PTermoperator getTermoperator()
    {
        return this._termoperator_;
    }

    public void setTermoperator(PTermoperator node)
    {
        if(this._termoperator_ != null)
        {
            this._termoperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoperator_ = node;
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
            + toString(this._termoperator_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoperator_ == child)
        {
            this._termoperator_ = null;
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
        if(this._termoperator_ == oldChild)
        {
            setTermoperator((PTermoperator) newChild);
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
