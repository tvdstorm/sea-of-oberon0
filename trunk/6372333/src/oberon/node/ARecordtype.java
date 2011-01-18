/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class ARecordtype extends PRecordtype
{
    private TRecordtxt _recordtxt_;
    private PFieldlist _fieldlist_;
    private PMorefields _morefields_;
    private TEndtxt _endtxt_;

    public ARecordtype()
    {
        // Constructor
    }

    public ARecordtype(
        @SuppressWarnings("hiding") TRecordtxt _recordtxt_,
        @SuppressWarnings("hiding") PFieldlist _fieldlist_,
        @SuppressWarnings("hiding") PMorefields _morefields_,
        @SuppressWarnings("hiding") TEndtxt _endtxt_)
    {
        // Constructor
        setRecordtxt(_recordtxt_);

        setFieldlist(_fieldlist_);

        setMorefields(_morefields_);

        setEndtxt(_endtxt_);

    }

    @Override
    public Object clone()
    {
        return new ARecordtype(
            cloneNode(this._recordtxt_),
            cloneNode(this._fieldlist_),
            cloneNode(this._morefields_),
            cloneNode(this._endtxt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARecordtype(this);
    }

    public TRecordtxt getRecordtxt()
    {
        return this._recordtxt_;
    }

    public void setRecordtxt(TRecordtxt node)
    {
        if(this._recordtxt_ != null)
        {
            this._recordtxt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._recordtxt_ = node;
    }

    public PFieldlist getFieldlist()
    {
        return this._fieldlist_;
    }

    public void setFieldlist(PFieldlist node)
    {
        if(this._fieldlist_ != null)
        {
            this._fieldlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldlist_ = node;
    }

    public PMorefields getMorefields()
    {
        return this._morefields_;
    }

    public void setMorefields(PMorefields node)
    {
        if(this._morefields_ != null)
        {
            this._morefields_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._morefields_ = node;
    }

    public TEndtxt getEndtxt()
    {
        return this._endtxt_;
    }

    public void setEndtxt(TEndtxt node)
    {
        if(this._endtxt_ != null)
        {
            this._endtxt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endtxt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._recordtxt_)
            + toString(this._fieldlist_)
            + toString(this._morefields_)
            + toString(this._endtxt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._recordtxt_ == child)
        {
            this._recordtxt_ = null;
            return;
        }

        if(this._fieldlist_ == child)
        {
            this._fieldlist_ = null;
            return;
        }

        if(this._morefields_ == child)
        {
            this._morefields_ = null;
            return;
        }

        if(this._endtxt_ == child)
        {
            this._endtxt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._recordtxt_ == oldChild)
        {
            setRecordtxt((TRecordtxt) newChild);
            return;
        }

        if(this._fieldlist_ == oldChild)
        {
            setFieldlist((PFieldlist) newChild);
            return;
        }

        if(this._morefields_ == oldChild)
        {
            setMorefields((PMorefields) newChild);
            return;
        }

        if(this._endtxt_ == oldChild)
        {
            setEndtxt((TEndtxt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}