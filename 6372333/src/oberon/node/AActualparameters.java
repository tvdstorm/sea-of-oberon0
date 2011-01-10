/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import java.util.*;
import oberon.analysis.*;

@SuppressWarnings("nls")
public final class AActualparameters extends PActualparameters
{
    private PExpression _expression_;
    private final LinkedList<PMoreactualparameters> _moreactualparameters_ = new LinkedList<PMoreactualparameters>();

    public AActualparameters()
    {
        // Constructor
    }

    public AActualparameters(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") List<PMoreactualparameters> _moreactualparameters_)
    {
        // Constructor
        setExpression(_expression_);

        setMoreactualparameters(_moreactualparameters_);

    }

    @Override
    public Object clone()
    {
        return new AActualparameters(
            cloneNode(this._expression_),
            cloneList(this._moreactualparameters_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAActualparameters(this);
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

    public LinkedList<PMoreactualparameters> getMoreactualparameters()
    {
        return this._moreactualparameters_;
    }

    public void setMoreactualparameters(List<PMoreactualparameters> list)
    {
        this._moreactualparameters_.clear();
        this._moreactualparameters_.addAll(list);
        for(PMoreactualparameters e : list)
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
            + toString(this._expression_)
            + toString(this._moreactualparameters_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._moreactualparameters_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator<PMoreactualparameters> i = this._moreactualparameters_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMoreactualparameters) newChild);
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
