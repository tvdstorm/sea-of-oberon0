/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AArraytype extends PArraytype
{
    private TArraytxt _arraytxt_;
    private PExpression _expression_;
    private TOftxt _oftxt_;
    private PType _type_;

    public AArraytype()
    {
        // Constructor
    }

    public AArraytype(
        @SuppressWarnings("hiding") TArraytxt _arraytxt_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TOftxt _oftxt_,
        @SuppressWarnings("hiding") PType _type_)
    {
        // Constructor
        setArraytxt(_arraytxt_);

        setExpression(_expression_);

        setOftxt(_oftxt_);

        setType(_type_);

    }

    @Override
    public Object clone()
    {
        return new AArraytype(
            cloneNode(this._arraytxt_),
            cloneNode(this._expression_),
            cloneNode(this._oftxt_),
            cloneNode(this._type_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArraytype(this);
    }

    public TArraytxt getArraytxt()
    {
        return this._arraytxt_;
    }

    public void setArraytxt(TArraytxt node)
    {
        if(this._arraytxt_ != null)
        {
            this._arraytxt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arraytxt_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TOftxt getOftxt()
    {
        return this._oftxt_;
    }

    public void setOftxt(TOftxt node)
    {
        if(this._oftxt_ != null)
        {
            this._oftxt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oftxt_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arraytxt_)
            + toString(this._expression_)
            + toString(this._oftxt_)
            + toString(this._type_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arraytxt_ == child)
        {
            this._arraytxt_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._oftxt_ == child)
        {
            this._oftxt_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arraytxt_ == oldChild)
        {
            setArraytxt((TArraytxt) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._oftxt_ == oldChild)
        {
            setOftxt((TOftxt) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}