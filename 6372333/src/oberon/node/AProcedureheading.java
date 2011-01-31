/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AProcedureheading extends PProcedureheading
{
    private TIdentifier _identifier_;
    private final LinkedList<PFpsection> _formalparams_ = new LinkedList<PFpsection>();

    public AProcedureheading()
    {
        // Constructor
    }

    public AProcedureheading(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PFpsection> _formalparams_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setFormalparams(_formalparams_);

    }

    @Override
    public Object clone()
    {
        return new AProcedureheading(
            cloneNode(this._identifier_),
            cloneList(this._formalparams_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProcedureheading(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PFpsection> getFormalparams()
    {
        return this._formalparams_;
    }

    public void setFormalparams(List<PFpsection> list)
    {
        this._formalparams_.clear();
        this._formalparams_.addAll(list);
        for(PFpsection e : list)
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
            + toString(this._identifier_)
            + toString(this._formalparams_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._formalparams_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PFpsection> i = this._formalparams_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFpsection) newChild);
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
