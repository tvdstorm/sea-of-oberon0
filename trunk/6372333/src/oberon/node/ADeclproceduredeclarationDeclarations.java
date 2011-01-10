/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.node;

import oberon.analysis.*;

@SuppressWarnings("nls")
public final class ADeclproceduredeclarationDeclarations extends PDeclarations
{
    private PDeclproceduredeclaration _declproceduredeclaration_;
    private TSemi _semi_;

    public ADeclproceduredeclarationDeclarations()
    {
        // Constructor
    }

    public ADeclproceduredeclarationDeclarations(
        @SuppressWarnings("hiding") PDeclproceduredeclaration _declproceduredeclaration_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setDeclproceduredeclaration(_declproceduredeclaration_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ADeclproceduredeclarationDeclarations(
            cloneNode(this._declproceduredeclaration_),
            cloneNode(this._semi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclproceduredeclarationDeclarations(this);
    }

    public PDeclproceduredeclaration getDeclproceduredeclaration()
    {
        return this._declproceduredeclaration_;
    }

    public void setDeclproceduredeclaration(PDeclproceduredeclaration node)
    {
        if(this._declproceduredeclaration_ != null)
        {
            this._declproceduredeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declproceduredeclaration_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declproceduredeclaration_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declproceduredeclaration_ == child)
        {
            this._declproceduredeclaration_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declproceduredeclaration_ == oldChild)
        {
            setDeclproceduredeclaration((PDeclproceduredeclaration) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
