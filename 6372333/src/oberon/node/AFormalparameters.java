/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AFormalparameters extends PFormalparameters
{
    private PFpsection _fpsection_;
    private final LinkedList<TSptxt> _sptxt_ = new LinkedList<TSptxt>();
    private final LinkedList<PMoreformalparameters> _moreformalparameters_ = new LinkedList<PMoreformalparameters>();

    public AFormalparameters()
    {
        // Constructor
    }

    public AFormalparameters(
        @SuppressWarnings("hiding") PFpsection _fpsection_,
        @SuppressWarnings("hiding") List<TSptxt> _sptxt_,
        @SuppressWarnings("hiding") List<PMoreformalparameters> _moreformalparameters_)
    {
        // Constructor
        setFpsection(_fpsection_);

        setSptxt(_sptxt_);

        setMoreformalparameters(_moreformalparameters_);

    }

    @Override
    public Object clone()
    {
        return new AFormalparameters(
            cloneNode(this._fpsection_),
            cloneList(this._sptxt_),
            cloneList(this._moreformalparameters_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormalparameters(this);
    }

    public PFpsection getFpsection()
    {
        return this._fpsection_;
    }

    public void setFpsection(PFpsection node)
    {
        if(this._fpsection_ != null)
        {
            this._fpsection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fpsection_ = node;
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

    public LinkedList<PMoreformalparameters> getMoreformalparameters()
    {
        return this._moreformalparameters_;
    }

    public void setMoreformalparameters(List<PMoreformalparameters> list)
    {
        this._moreformalparameters_.clear();
        this._moreformalparameters_.addAll(list);
        for(PMoreformalparameters e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fpsection_)
            + toString(this._sptxt_)
            + toString(this._moreformalparameters_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fpsection_ == child)
        {
            this._fpsection_ = null;
            return;
        }

        if(this._sptxt_.remove(child))
        {
            return;
        }

        if(this._moreformalparameters_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fpsection_ == oldChild)
        {
            setFpsection((PFpsection) newChild);
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

        for(ListIterator<PMoreformalparameters> i = this._moreformalparameters_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMoreformalparameters) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}