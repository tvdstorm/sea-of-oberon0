/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.analysis;

import java.util.*;
import oberon.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getOperator() != null)
        {
            node.getOperator().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAProgram(node);
    }

    public void inAPlusOperator(APlusOperator node)
    {
        defaultIn(node);
    }

    public void outAPlusOperator(APlusOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusOperator(APlusOperator node)
    {
        inAPlusOperator(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusOperator(node);
    }

    public void inAMinusOperator(AMinusOperator node)
    {
        defaultIn(node);
    }

    public void outAMinusOperator(AMinusOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusOperator(AMinusOperator node)
    {
        inAMinusOperator(node);
        if(node.getMin() != null)
        {
            node.getMin().apply(this);
        }
        outAMinusOperator(node);
    }

    public void inAMultiplyOperator(AMultiplyOperator node)
    {
        defaultIn(node);
    }

    public void outAMultiplyOperator(AMultiplyOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplyOperator(AMultiplyOperator node)
    {
        inAMultiplyOperator(node);
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        outAMultiplyOperator(node);
    }

    public void inADivOperator(ADivOperator node)
    {
        defaultIn(node);
    }

    public void outADivOperator(ADivOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivOperator(ADivOperator node)
    {
        inADivOperator(node);
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        outADivOperator(node);
    }

    public void inAModOperator(AModOperator node)
    {
        defaultIn(node);
    }

    public void outAModOperator(AModOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModOperator(AModOperator node)
    {
        inAModOperator(node);
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        outAModOperator(node);
    }
}
