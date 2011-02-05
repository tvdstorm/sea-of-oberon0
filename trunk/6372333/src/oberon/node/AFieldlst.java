/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AFieldlst extends PFieldlst
{
    private final LinkedList<PFieldlist> _fieldlist_ = new LinkedList<PFieldlist>();

    public AFieldlst()
    {
        // Constructor
    }

    public AFieldlst(
        @SuppressWarnings("hiding") List<PFieldlist> _fieldlist_)
    {
        // Constructor
        setFieldlist(_fieldlist_);

    }

    @Override
    public Object clone()
    {
        return new AFieldlst(
            cloneList(this._fieldlist_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldlst(this);
    }

    public LinkedList<PFieldlist> getFieldlist()
    {
        return this._fieldlist_;
    }

    public void setFieldlist(List<PFieldlist> list)
    {
        this._fieldlist_.clear();
        this._fieldlist_.addAll(list);
        for(PFieldlist e : list)
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
            + toString(this._fieldlist_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldlist_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PFieldlist> i = this._fieldlist_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFieldlist) newChild);
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
