/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AConstdecl extends PConstdecl
{
    private final LinkedList<PConstdeclaration> _constdeclaration_ = new LinkedList<PConstdeclaration>();

    public AConstdecl()
    {
        // Constructor
    }

    public AConstdecl(
        @SuppressWarnings("hiding") List<PConstdeclaration> _constdeclaration_)
    {
        // Constructor
        setConstdeclaration(_constdeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AConstdecl(
            cloneList(this._constdeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstdecl(this);
    }

    public LinkedList<PConstdeclaration> getConstdeclaration()
    {
        return this._constdeclaration_;
    }

    public void setConstdeclaration(List<PConstdeclaration> list)
    {
        this._constdeclaration_.clear();
        this._constdeclaration_.addAll(list);
        for(PConstdeclaration e : list)
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
            + toString(this._constdeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._constdeclaration_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PConstdeclaration> i = this._constdeclaration_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PConstdeclaration) newChild);
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