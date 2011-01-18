/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleexpression extends PSimpleexpression
{
    private TPlusorminus _plusorminus_;
    private PTerm _term_;
    private final LinkedList<PMoreterms> _moreterms_ = new LinkedList<PMoreterms>();

    public ASimpleexpression()
    {
        // Constructor
    }

    public ASimpleexpression(
        @SuppressWarnings("hiding") TPlusorminus _plusorminus_,
        @SuppressWarnings("hiding") PTerm _term_,
        @SuppressWarnings("hiding") List<PMoreterms> _moreterms_)
    {
        // Constructor
        setPlusorminus(_plusorminus_);

        setTerm(_term_);

        setMoreterms(_moreterms_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleexpression(
            cloneNode(this._plusorminus_),
            cloneNode(this._term_),
            cloneList(this._moreterms_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleexpression(this);
    }

    public TPlusorminus getPlusorminus()
    {
        return this._plusorminus_;
    }

    public void setPlusorminus(TPlusorminus node)
    {
        if(this._plusorminus_ != null)
        {
            this._plusorminus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plusorminus_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    public LinkedList<PMoreterms> getMoreterms()
    {
        return this._moreterms_;
    }

    public void setMoreterms(List<PMoreterms> list)
    {
        this._moreterms_.clear();
        this._moreterms_.addAll(list);
        for(PMoreterms e : list)
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
            + toString(this._plusorminus_)
            + toString(this._term_)
            + toString(this._moreterms_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plusorminus_ == child)
        {
            this._plusorminus_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        if(this._moreterms_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plusorminus_ == oldChild)
        {
            setPlusorminus((TPlusorminus) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        for(ListIterator<PMoreterms> i = this._moreterms_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMoreterms) newChild);
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