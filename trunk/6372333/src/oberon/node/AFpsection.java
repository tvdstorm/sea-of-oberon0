/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AFpsection extends PFpsection
{
    private TVartxt _vartxt_;
    private PIdentlist _identlist_;
    private TColon _colon_;
    private final LinkedList<TSptxt> _sptxt_ = new LinkedList<TSptxt>();
    private PType _type_;

    public AFpsection()
    {
        // Constructor
    }

    public AFpsection(
        @SuppressWarnings("hiding") TVartxt _vartxt_,
        @SuppressWarnings("hiding") PIdentlist _identlist_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") List<TSptxt> _sptxt_,
        @SuppressWarnings("hiding") PType _type_)
    {
        // Constructor
        setVartxt(_vartxt_);

        setIdentlist(_identlist_);

        setColon(_colon_);

        setSptxt(_sptxt_);

        setType(_type_);

    }

    @Override
    public Object clone()
    {
        return new AFpsection(
            cloneNode(this._vartxt_),
            cloneNode(this._identlist_),
            cloneNode(this._colon_),
            cloneList(this._sptxt_),
            cloneNode(this._type_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFpsection(this);
    }

    public TVartxt getVartxt()
    {
        return this._vartxt_;
    }

    public void setVartxt(TVartxt node)
    {
        if(this._vartxt_ != null)
        {
            this._vartxt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vartxt_ = node;
    }

    public PIdentlist getIdentlist()
    {
        return this._identlist_;
    }

    public void setIdentlist(PIdentlist node)
    {
        if(this._identlist_ != null)
        {
            this._identlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identlist_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public LinkedList<TSptxt> getSptxt()
    {
        return this._sptxt_;
    }

    public void setSptxt(List<TSptxt> list)
    {
        this._sptxt_.clear();
        this._sptxt_.addAll(list);
        for(TSptxt e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
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
            + toString(this._vartxt_)
            + toString(this._identlist_)
            + toString(this._colon_)
            + toString(this._sptxt_)
            + toString(this._type_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._vartxt_ == child)
        {
            this._vartxt_ = null;
            return;
        }

        if(this._identlist_ == child)
        {
            this._identlist_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._sptxt_.remove(child))
        {
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
        if(this._vartxt_ == oldChild)
        {
            setVartxt((TVartxt) newChild);
            return;
        }

        if(this._identlist_ == oldChild)
        {
            setIdentlist((PIdentlist) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        for(ListIterator<TSptxt> i = this._sptxt_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TSptxt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
