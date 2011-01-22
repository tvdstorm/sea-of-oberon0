/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AProcedurebody extends PProcedurebody
{
    private PDeclarations _declarations_;
    private final LinkedList<PStatement> _statement_ = new LinkedList<PStatement>();

    public AProcedurebody()
    {
        // Constructor
    }

    public AProcedurebody(
        @SuppressWarnings("hiding") PDeclarations _declarations_,
        @SuppressWarnings("hiding") List<PStatement> _statement_)
    {
        // Constructor
        setDeclarations(_declarations_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new AProcedurebody(
            cloneNode(this._declarations_),
            cloneList(this._statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProcedurebody(this);
    }

    public PDeclarations getDeclarations()
    {
        return this._declarations_;
    }

    public void setDeclarations(PDeclarations node)
    {
        if(this._declarations_ != null)
        {
            this._declarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declarations_ = node;
    }

    public LinkedList<PStatement> getStatement()
    {
        return this._statement_;
    }

    public void setStatement(List<PStatement> list)
    {
        this._statement_.clear();
        this._statement_.addAll(list);
        for(PStatement e : list)
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
            + toString(this._declarations_)
            + toString(this._statement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declarations_ == child)
        {
            this._declarations_ = null;
            return;
        }

        if(this._statement_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declarations_ == oldChild)
        {
            setDeclarations((PDeclarations) newChild);
            return;
        }

        for(ListIterator<PStatement> i = this._statement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStatement) newChild);
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