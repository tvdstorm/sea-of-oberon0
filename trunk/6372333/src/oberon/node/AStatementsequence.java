/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AStatementsequence extends PStatementsequence
{
    private PStatement _statement_;
    private final LinkedList<PAndstatement> _andstatement_ = new LinkedList<PAndstatement>();

    public AStatementsequence()
    {
        // Constructor
    }

    public AStatementsequence(
        @SuppressWarnings("hiding") PStatement _statement_,
        @SuppressWarnings("hiding") List<PAndstatement> _andstatement_)
    {
        // Constructor
        setStatement(_statement_);

        setAndstatement(_andstatement_);

    }

    @Override
    public Object clone()
    {
        return new AStatementsequence(
            cloneNode(this._statement_),
            cloneList(this._andstatement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementsequence(this);
    }

    public PStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(PStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    public LinkedList<PAndstatement> getAndstatement()
    {
        return this._andstatement_;
    }

    public void setAndstatement(List<PAndstatement> list)
    {
        this._andstatement_.clear();
        this._andstatement_.addAll(list);
        for(PAndstatement e : list)
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
            + toString(this._statement_)
            + toString(this._andstatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._statement_ == child)
        {
            this._statement_ = null;
            return;
        }

        if(this._andstatement_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

        for(ListIterator<PAndstatement> i = this._andstatement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAndstatement) newChild);
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