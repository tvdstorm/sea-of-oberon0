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
        node.getPModule().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAModule(AModule node)
    {
        defaultIn(node);
    }

    public void outAModule(AModule node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModule(AModule node)
    {
        inAModule(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatements());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAModule(node);
    }

    public void inADeclarations(ADeclarations node)
    {
        defaultIn(node);
    }

    public void outADeclarations(ADeclarations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarations(ADeclarations node)
    {
        inADeclarations(node);
        if(node.getConstdecl() != null)
        {
            node.getConstdecl().apply(this);
        }
        if(node.getTypedecl() != null)
        {
            node.getTypedecl().apply(this);
        }
        if(node.getVardecl() != null)
        {
            node.getVardecl().apply(this);
        }
        {
            List<PProceduredeclaration> copy = new ArrayList<PProceduredeclaration>(node.getProceduredeclaration());
            for(PProceduredeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outADeclarations(node);
    }

    public void inAConstdecl(AConstdecl node)
    {
        defaultIn(node);
    }

    public void outAConstdecl(AConstdecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstdecl(AConstdecl node)
    {
        inAConstdecl(node);
        {
            List<PConstdeclaration> copy = new ArrayList<PConstdeclaration>(node.getConstdeclaration());
            for(PConstdeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outAConstdecl(node);
    }

    public void inAConstdeclaration(AConstdeclaration node)
    {
        defaultIn(node);
    }

    public void outAConstdeclaration(AConstdeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstdeclaration(AConstdeclaration node)
    {
        inAConstdeclaration(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAConstdeclaration(node);
    }

    public void inATypedecl(ATypedecl node)
    {
        defaultIn(node);
    }

    public void outATypedecl(ATypedecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypedecl(ATypedecl node)
    {
        inATypedecl(node);
        {
            List<PTypedeclaration> copy = new ArrayList<PTypedeclaration>(node.getTypedeclaration());
            for(PTypedeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outATypedecl(node);
    }

    public void inATypedeclaration(ATypedeclaration node)
    {
        defaultIn(node);
    }

    public void outATypedeclaration(ATypedeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypedeclaration(ATypedeclaration node)
    {
        inATypedeclaration(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outATypedeclaration(node);
    }

    public void inAVardecl(AVardecl node)
    {
        defaultIn(node);
    }

    public void outAVardecl(AVardecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVardecl(AVardecl node)
    {
        inAVardecl(node);
        {
            List<PVardeclaration> copy = new ArrayList<PVardeclaration>(node.getVardeclaration());
            for(PVardeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outAVardecl(node);
    }

    public void inAVardeclaration(AVardeclaration node)
    {
        defaultIn(node);
    }

    public void outAVardeclaration(AVardeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVardeclaration(AVardeclaration node)
    {
        inAVardeclaration(node);
        {
            List<TIdentifier> copy = new ArrayList<TIdentifier>(node.getIdentifier());
            for(TIdentifier e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAVardeclaration(node);
    }

    public void inAAssignment(AAssignment node)
    {
        defaultIn(node);
    }

    public void outAAssignment(AAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        inAAssignment(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAssignment(node);
    }

    public void inAArrayType(AArrayType node)
    {
        defaultIn(node);
    }

    public void outAArrayType(AArrayType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayType(AArrayType node)
    {
        inAArrayType(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAArrayType(node);
    }

    public void inAIdentifierType(AIdentifierType node)
    {
        defaultIn(node);
    }

    public void outAIdentifierType(AIdentifierType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierType(AIdentifierType node)
    {
        inAIdentifierType(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierType(node);
    }

    public void inAProceduredeclaration(AProceduredeclaration node)
    {
        defaultIn(node);
    }

    public void outAProceduredeclaration(AProceduredeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProceduredeclaration(AProceduredeclaration node)
    {
        inAProceduredeclaration(node);
        if(node.getProcedureheading() != null)
        {
            node.getProcedureheading().apply(this);
        }
        if(node.getProcedurebody() != null)
        {
            node.getProcedurebody().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAProceduredeclaration(node);
    }

    public void inAProcedurecall(AProcedurecall node)
    {
        defaultIn(node);
    }

    public void outAProcedurecall(AProcedurecall node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedurecall(AProcedurecall node)
    {
        inAProcedurecall(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAProcedurecall(node);
    }

    public void inAProcedureheading(AProcedureheading node)
    {
        defaultIn(node);
    }

    public void outAProcedureheading(AProcedureheading node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedureheading(AProcedureheading node)
    {
        inAProcedureheading(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            List<PFpsection> copy = new ArrayList<PFpsection>(node.getFormalparams());
            for(PFpsection e : copy)
            {
                e.apply(this);
            }
        }
        outAProcedureheading(node);
    }

    public void inAProcedurebody(AProcedurebody node)
    {
        defaultIn(node);
    }

    public void outAProcedurebody(AProcedurebody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedurebody(AProcedurebody node)
    {
        inAProcedurebody(node);
        if(node.getDeclarations() != null)
        {
            node.getDeclarations().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAProcedurebody(node);
    }

    public void inAFpsection(AFpsection node)
    {
        defaultIn(node);
    }

    public void outAFpsection(AFpsection node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFpsection(AFpsection node)
    {
        inAFpsection(node);
        {
            List<TIdentifier> copy = new ArrayList<TIdentifier>(node.getIdentifier());
            for(TIdentifier e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAFpsection(node);
    }

    public void inAWhilestatement(AWhilestatement node)
    {
        defaultIn(node);
    }

    public void outAWhilestatement(AWhilestatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhilestatement(AWhilestatement node)
    {
        inAWhilestatement(node);
        if(node.getCondition() != null)
        {
            node.getCondition().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getBody());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAWhilestatement(node);
    }

    public void inAIfstatement(AIfstatement node)
    {
        defaultIn(node);
    }

    public void outAIfstatement(AIfstatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfstatement(AIfstatement node)
    {
        inAIfstatement(node);
        if(node.getCondition() != null)
        {
            node.getCondition().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getBody());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PIfstatement> copy = new ArrayList<PIfstatement>(node.getElseifs());
            for(PIfstatement e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getElse());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAIfstatement(node);
    }

    public void inAAddExp(AAddExp node)
    {
        defaultIn(node);
    }

    public void outAAddExp(AAddExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddExp(AAddExp node)
    {
        inAAddExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAddExp(node);
    }

    public void inASubExp(ASubExp node)
    {
        defaultIn(node);
    }

    public void outASubExp(ASubExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExp(ASubExp node)
    {
        inASubExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASubExp(node);
    }

    public void inAMulExp(AMulExp node)
    {
        defaultIn(node);
    }

    public void outAMulExp(AMulExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMulExp(AMulExp node)
    {
        inAMulExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMulExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExp(node);
    }

    public void inAModExp(AModExp node)
    {
        defaultIn(node);
    }

    public void outAModExp(AModExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExp(AModExp node)
    {
        inAModExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModExp(node);
    }

    public void inAAmpExp(AAmpExp node)
    {
        defaultIn(node);
    }

    public void outAAmpExp(AAmpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAmpExp(AAmpExp node)
    {
        inAAmpExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAmpExp(node);
    }

    public void inATilExp(ATilExp node)
    {
        defaultIn(node);
    }

    public void outATilExp(ATilExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATilExp(ATilExp node)
    {
        inATilExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outATilExp(node);
    }

    public void inAExeqExp(AExeqExp node)
    {
        defaultIn(node);
    }

    public void outAExeqExp(AExeqExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExeqExp(AExeqExp node)
    {
        inAExeqExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExeqExp(node);
    }

    public void inAExhaExp(AExhaExp node)
    {
        defaultIn(node);
    }

    public void outAExhaExp(AExhaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExhaExp(AExhaExp node)
    {
        inAExhaExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExhaExp(node);
    }

    public void inAExstExp(AExstExp node)
    {
        defaultIn(node);
    }

    public void outAExstExp(AExstExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExstExp(AExstExp node)
    {
        inAExstExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExstExp(node);
    }

    public void inAExseExp(AExseExp node)
    {
        defaultIn(node);
    }

    public void outAExseExp(AExseExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExseExp(AExseExp node)
    {
        inAExseExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExseExp(node);
    }

    public void inAExgtExp(AExgtExp node)
    {
        defaultIn(node);
    }

    public void outAExgtExp(AExgtExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExgtExp(AExgtExp node)
    {
        inAExgtExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExgtExp(node);
    }

    public void inAExgeExp(AExgeExp node)
    {
        defaultIn(node);
    }

    public void outAExgeExp(AExgeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExgeExp(AExgeExp node)
    {
        inAExgeExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExgeExp(node);
    }

    public void inAParenExp(AParenExp node)
    {
        defaultIn(node);
    }

    public void outAParenExp(AParenExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenExp(AParenExp node)
    {
        inAParenExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAParenExp(node);
    }

    public void inAIntegerExp(AIntegerExp node)
    {
        defaultIn(node);
    }

    public void outAIntegerExp(AIntegerExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerExp(AIntegerExp node)
    {
        inAIntegerExp(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerExp(node);
    }

    public void inAIdentselExp(AIdentselExp node)
    {
        defaultIn(node);
    }

    public void outAIdentselExp(AIdentselExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentselExp(AIdentselExp node)
    {
        inAIdentselExp(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getSelector() != null)
        {
            node.getSelector().apply(this);
        }
        outAIdentselExp(node);
    }

    public void inAIdentifierSelector(AIdentifierSelector node)
    {
        defaultIn(node);
    }

    public void outAIdentifierSelector(AIdentifierSelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierSelector(AIdentifierSelector node)
    {
        inAIdentifierSelector(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierSelector(node);
    }

    public void inAExpressionSelector(AExpressionSelector node)
    {
        defaultIn(node);
    }

    public void outAExpressionSelector(AExpressionSelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressionSelector(AExpressionSelector node)
    {
        inAExpressionSelector(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpressionSelector(node);
    }

    public void inANoneSelector(ANoneSelector node)
    {
        defaultIn(node);
    }

    public void outANoneSelector(ANoneSelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneSelector(ANoneSelector node)
    {
        inANoneSelector(node);
        outANoneSelector(node);
    }

    public void inAStatassStatement(AStatassStatement node)
    {
        defaultIn(node);
    }

    public void outAStatassStatement(AStatassStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatassStatement(AStatassStatement node)
    {
        inAStatassStatement(node);
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        outAStatassStatement(node);
    }

    public void inAStatprocStatement(AStatprocStatement node)
    {
        defaultIn(node);
    }

    public void outAStatprocStatement(AStatprocStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatprocStatement(AStatprocStatement node)
    {
        inAStatprocStatement(node);
        if(node.getProcedurecall() != null)
        {
            node.getProcedurecall().apply(this);
        }
        outAStatprocStatement(node);
    }

    public void inAStatifStatement(AStatifStatement node)
    {
        defaultIn(node);
    }

    public void outAStatifStatement(AStatifStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatifStatement(AStatifStatement node)
    {
        inAStatifStatement(node);
        if(node.getIfstatement() != null)
        {
            node.getIfstatement().apply(this);
        }
        outAStatifStatement(node);
    }

    public void inAStatwhileStatement(AStatwhileStatement node)
    {
        defaultIn(node);
    }

    public void outAStatwhileStatement(AStatwhileStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatwhileStatement(AStatwhileStatement node)
    {
        inAStatwhileStatement(node);
        if(node.getWhilestatement() != null)
        {
            node.getWhilestatement().apply(this);
        }
        outAStatwhileStatement(node);
    }
}
