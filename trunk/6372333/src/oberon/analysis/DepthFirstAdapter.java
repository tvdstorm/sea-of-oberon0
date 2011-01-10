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
        if(node.getModuletxt() != null)
        {
            node.getModuletxt().apply(this);
        }
        if(node.getBeginid() != null)
        {
            node.getBeginid().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getDeclarations() != null)
        {
            node.getDeclarations().apply(this);
        }
        if(node.getBegstat() != null)
        {
            node.getBegstat().apply(this);
        }
        if(node.getEndtxt() != null)
        {
            node.getEndtxt().apply(this);
        }
        if(node.getEndid() != null)
        {
            node.getEndid().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        outAProgram(node);
    }

    public void inADeclconstDeclarations(ADeclconstDeclarations node)
    {
        defaultIn(node);
    }

    public void outADeclconstDeclarations(ADeclconstDeclarations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclconstDeclarations(ADeclconstDeclarations node)
    {
        inADeclconstDeclarations(node);
        if(node.getConsttxt() != null)
        {
            node.getConsttxt().apply(this);
        }
        {
            List<PAssignment> copy = new ArrayList<PAssignment>(node.getAssignment());
            for(PAssignment e : copy)
            {
                e.apply(this);
            }
        }
        outADeclconstDeclarations(node);
    }

    public void inADecltypeDeclarations(ADecltypeDeclarations node)
    {
        defaultIn(node);
    }

    public void outADecltypeDeclarations(ADecltypeDeclarations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecltypeDeclarations(ADecltypeDeclarations node)
    {
        inADecltypeDeclarations(node);
        if(node.getTypetxt() != null)
        {
            node.getTypetxt().apply(this);
        }
        {
            List<PTypedeclaration> copy = new ArrayList<PTypedeclaration>(node.getTypedeclaration());
            for(PTypedeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outADecltypeDeclarations(node);
    }

    public void inADeclvarDeclarations(ADeclvarDeclarations node)
    {
        defaultIn(node);
    }

    public void outADeclvarDeclarations(ADeclvarDeclarations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclvarDeclarations(ADeclvarDeclarations node)
    {
        inADeclvarDeclarations(node);
        if(node.getVartxt() != null)
        {
            node.getVartxt().apply(this);
        }
        {
            List<PVardeclaration> copy = new ArrayList<PVardeclaration>(node.getVardeclaration());
            for(PVardeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outADeclvarDeclarations(node);
    }

    public void inADeclproceduredeclarationDeclarations(ADeclproceduredeclarationDeclarations node)
    {
        defaultIn(node);
    }

    public void outADeclproceduredeclarationDeclarations(ADeclproceduredeclarationDeclarations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclproceduredeclarationDeclarations(ADeclproceduredeclarationDeclarations node)
    {
        inADeclproceduredeclarationDeclarations(node);
        if(node.getDeclproceduredeclaration() != null)
        {
            node.getDeclproceduredeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outADeclproceduredeclarationDeclarations(node);
    }

    public void inABegstat(ABegstat node)
    {
        defaultIn(node);
    }

    public void outABegstat(ABegstat node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABegstat(ABegstat node)
    {
        inABegstat(node);
        if(node.getBegintxt() != null)
        {
            node.getBegintxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        outABegstat(node);
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
        if(node.getAss() != null)
        {
            node.getAss().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAAssignment(node);
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
        if(node.getAss() != null)
        {
            node.getAss().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outATypedeclaration(node);
    }

    public void inAStatementsequence(AStatementsequence node)
    {
        defaultIn(node);
    }

    public void outAStatementsequence(AStatementsequence node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatementsequence(AStatementsequence node)
    {
        inAStatementsequence(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        {
            List<PAndstatement> copy = new ArrayList<PAndstatement>(node.getAndstatement());
            for(PAndstatement e : copy)
            {
                e.apply(this);
            }
        }
        outAStatementsequence(node);
    }

    public void inADeclproceduredeclaration(ADeclproceduredeclaration node)
    {
        defaultIn(node);
    }

    public void outADeclproceduredeclaration(ADeclproceduredeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclproceduredeclaration(ADeclproceduredeclaration node)
    {
        inADeclproceduredeclaration(node);
        if(node.getProceduredeclaration() != null)
        {
            node.getProceduredeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outADeclproceduredeclaration(node);
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
        if(node.getIdentlist() != null)
        {
            node.getIdentlist().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAVardeclaration(node);
    }

    public void inAExpression(AExpression node)
    {
        defaultIn(node);
    }

    public void outAExpression(AExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpression(AExpression node)
    {
        inAExpression(node);
        if(node.getSimpleexpression() != null)
        {
            node.getSimpleexpression().apply(this);
        }
        if(node.getSimpleexpressionevaluation() != null)
        {
            node.getSimpleexpressionevaluation().apply(this);
        }
        outAExpression(node);
    }

    public void inAIdtypeType(AIdtypeType node)
    {
        defaultIn(node);
    }

    public void outAIdtypeType(AIdtypeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdtypeType(AIdtypeType node)
    {
        inAIdtypeType(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdtypeType(node);
    }

    public void inAArrtypeType(AArrtypeType node)
    {
        defaultIn(node);
    }

    public void outAArrtypeType(AArrtypeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrtypeType(AArrtypeType node)
    {
        inAArrtypeType(node);
        if(node.getArraytype() != null)
        {
            node.getArraytype().apply(this);
        }
        outAArrtypeType(node);
    }

    public void inARectypeType(ARectypeType node)
    {
        defaultIn(node);
    }

    public void outARectypeType(ARectypeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARectypeType(ARectypeType node)
    {
        inARectypeType(node);
        if(node.getRecordtype() != null)
        {
            node.getRecordtype().apply(this);
        }
        outARectypeType(node);
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

    public void inAStatwhiStatement(AStatwhiStatement node)
    {
        defaultIn(node);
    }

    public void outAStatwhiStatement(AStatwhiStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatwhiStatement(AStatwhiStatement node)
    {
        inAStatwhiStatement(node);
        if(node.getWhilestatement() != null)
        {
            node.getWhilestatement().apply(this);
        }
        outAStatwhiStatement(node);
    }

    public void inAStatnoneStatement(AStatnoneStatement node)
    {
        defaultIn(node);
    }

    public void outAStatnoneStatement(AStatnoneStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatnoneStatement(AStatnoneStatement node)
    {
        inAStatnoneStatement(node);
        if(node.getSptxt() != null)
        {
            node.getSptxt().apply(this);
        }
        outAStatnoneStatement(node);
    }

    public void inAIdentlist(AIdentlist node)
    {
        defaultIn(node);
    }

    public void outAIdentlist(AIdentlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentlist(AIdentlist node)
    {
        inAIdentlist(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getAndidentifier() != null)
        {
            node.getAndidentifier().apply(this);
        }
        outAIdentlist(node);
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
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
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

    public void inAAndstatement(AAndstatement node)
    {
        defaultIn(node);
    }

    public void outAAndstatement(AAndstatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndstatement(AAndstatement node)
    {
        inAAndstatement(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAAndstatement(node);
    }

    public void inAAndidentifier(AAndidentifier node)
    {
        defaultIn(node);
    }

    public void outAAndidentifier(AAndidentifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndidentifier(AAndidentifier node)
    {
        inAAndidentifier(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAAndidentifier(node);
    }

    public void inASimpleexpressionevaluation(ASimpleexpressionevaluation node)
    {
        defaultIn(node);
    }

    public void outASimpleexpressionevaluation(ASimpleexpressionevaluation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleexpressionevaluation(ASimpleexpressionevaluation node)
    {
        inASimpleexpressionevaluation(node);
        if(node.getExpressionoperator() != null)
        {
            node.getExpressionoperator().apply(this);
        }
        if(node.getSimpleexpression() != null)
        {
            node.getSimpleexpression().apply(this);
        }
        outASimpleexpressionevaluation(node);
    }

    public void inASimpleexpression(ASimpleexpression node)
    {
        defaultIn(node);
    }

    public void outASimpleexpression(ASimpleexpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleexpression(ASimpleexpression node)
    {
        inASimpleexpression(node);
        if(node.getPlusorminus() != null)
        {
            node.getPlusorminus().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getMoreterms() != null)
        {
            node.getMoreterms().apply(this);
        }
        outASimpleexpression(node);
    }

    public void inARecordtype(ARecordtype node)
    {
        defaultIn(node);
    }

    public void outARecordtype(ARecordtype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARecordtype(ARecordtype node)
    {
        inARecordtype(node);
        if(node.getRecordtxt() != null)
        {
            node.getRecordtxt().apply(this);
        }
        if(node.getFieldlist() != null)
        {
            node.getFieldlist().apply(this);
        }
        if(node.getMorefields() != null)
        {
            node.getMorefields().apply(this);
        }
        if(node.getEndtxt() != null)
        {
            node.getEndtxt().apply(this);
        }
        outARecordtype(node);
    }

    public void inAArraytype(AArraytype node)
    {
        defaultIn(node);
    }

    public void outAArraytype(AArraytype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArraytype(AArraytype node)
    {
        inAArraytype(node);
        if(node.getArraytxt() != null)
        {
            node.getArraytxt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getOftxt() != null)
        {
            node.getOftxt().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAArraytype(node);
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
        if(node.getWhiletxt() != null)
        {
            node.getWhiletxt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getDotxt() != null)
        {
            node.getDotxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        if(node.getEndtxt() != null)
        {
            node.getEndtxt().apply(this);
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
        if(node.getIftxt() != null)
        {
            node.getIftxt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getThentxt() != null)
        {
            node.getThentxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        if(node.getElsif() != null)
        {
            node.getElsif().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getEndtxt() != null)
        {
            node.getEndtxt().apply(this);
        }
        outAIfstatement(node);
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
            List<PActualparams> copy = new ArrayList<PActualparams>(node.getActualparams());
            for(PActualparams e : copy)
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
        if(node.getProceduretxt() != null)
        {
            node.getProceduretxt().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getFormalparams() != null)
        {
            node.getFormalparams().apply(this);
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
        if(node.getProcedurebodystatements() != null)
        {
            node.getProcedurebodystatements().apply(this);
        }
        if(node.getEndtxt() != null)
        {
            node.getEndtxt().apply(this);
        }
        outAProcedurebody(node);
    }

    public void inATerm(ATerm node)
    {
        defaultIn(node);
    }

    public void outATerm(ATerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATerm(ATerm node)
    {
        inATerm(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getAdditionaloperations() != null)
        {
            node.getAdditionaloperations().apply(this);
        }
        outATerm(node);
    }

    public void inAMoreterms(AMoreterms node)
    {
        defaultIn(node);
    }

    public void outAMoreterms(AMoreterms node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreterms(AMoreterms node)
    {
        inAMoreterms(node);
        if(node.getPlusorminusoror() != null)
        {
            node.getPlusorminusoror().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAMoreterms(node);
    }

    public void inAFieldlistFieldlist(AFieldlistFieldlist node)
    {
        defaultIn(node);
    }

    public void outAFieldlistFieldlist(AFieldlistFieldlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFieldlistFieldlist(AFieldlistFieldlist node)
    {
        inAFieldlistFieldlist(node);
        if(node.getIdentlist() != null)
        {
            node.getIdentlist().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAFieldlistFieldlist(node);
    }

    public void inAListnoneFieldlist(AListnoneFieldlist node)
    {
        defaultIn(node);
    }

    public void outAListnoneFieldlist(AListnoneFieldlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListnoneFieldlist(AListnoneFieldlist node)
    {
        inAListnoneFieldlist(node);
        if(node.getSptxt() != null)
        {
            node.getSptxt().apply(this);
        }
        outAListnoneFieldlist(node);
    }

    public void inAMorefields(AMorefields node)
    {
        defaultIn(node);
    }

    public void outAMorefields(AMorefields node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMorefields(AMorefields node)
    {
        inAMorefields(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getFieldlist() != null)
        {
            node.getFieldlist().apply(this);
        }
        outAMorefields(node);
    }

    public void inAElsif(AElsif node)
    {
        defaultIn(node);
    }

    public void outAElsif(AElsif node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElsif(AElsif node)
    {
        inAElsif(node);
        if(node.getElsiftxt() != null)
        {
            node.getElsiftxt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getThentxt() != null)
        {
            node.getThentxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        outAElsif(node);
    }

    public void inAElse(AElse node)
    {
        defaultIn(node);
    }

    public void outAElse(AElse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElse(AElse node)
    {
        inAElse(node);
        if(node.getElsetxt() != null)
        {
            node.getElsetxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        outAElse(node);
    }

    public void inAActualparams(AActualparams node)
    {
        defaultIn(node);
    }

    public void outAActualparams(AActualparams node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAActualparams(AActualparams node)
    {
        inAActualparams(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getActualparameters() != null)
        {
            node.getActualparameters().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAActualparams(node);
    }

    public void inAFormalparams(AFormalparams node)
    {
        defaultIn(node);
    }

    public void outAFormalparams(AFormalparams node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormalparams(AFormalparams node)
    {
        inAFormalparams(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFormalparameters() != null)
        {
            node.getFormalparameters().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAFormalparams(node);
    }

    public void inAProcedurebodystatements(AProcedurebodystatements node)
    {
        defaultIn(node);
    }

    public void outAProcedurebodystatements(AProcedurebodystatements node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedurebodystatements(AProcedurebodystatements node)
    {
        inAProcedurebodystatements(node);
        if(node.getBegintxt() != null)
        {
            node.getBegintxt().apply(this);
        }
        if(node.getStatementsequence() != null)
        {
            node.getStatementsequence().apply(this);
        }
        outAProcedurebodystatements(node);
    }

    public void inAAdditionaloperations(AAdditionaloperations node)
    {
        defaultIn(node);
    }

    public void outAAdditionaloperations(AAdditionaloperations node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditionaloperations(AAdditionaloperations node)
    {
        inAAdditionaloperations(node);
        if(node.getTermoperator() != null)
        {
            node.getTermoperator().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAAdditionaloperations(node);
    }

    public void inAIdfactorFactor(AIdfactorFactor node)
    {
        defaultIn(node);
    }

    public void outAIdfactorFactor(AIdfactorFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdfactorFactor(AIdfactorFactor node)
    {
        inAIdfactorFactor(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getSelector() != null)
        {
            node.getSelector().apply(this);
        }
        outAIdfactorFactor(node);
    }

    public void inAIntfactorFactor(AIntfactorFactor node)
    {
        defaultIn(node);
    }

    public void outAIntfactorFactor(AIntfactorFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntfactorFactor(AIntfactorFactor node)
    {
        inAIntfactorFactor(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntfactorFactor(node);
    }

    public void inAExpfactorFactor(AExpfactorFactor node)
    {
        defaultIn(node);
    }

    public void outAExpfactorFactor(AExpfactorFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpfactorFactor(AExpfactorFactor node)
    {
        inAExpfactorFactor(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAExpfactorFactor(node);
    }

    public void inATilfactorFactor(ATilfactorFactor node)
    {
        defaultIn(node);
    }

    public void outATilfactorFactor(ATilfactorFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATilfactorFactor(ATilfactorFactor node)
    {
        inATilfactorFactor(node);
        if(node.getTilde() != null)
        {
            node.getTilde().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outATilfactorFactor(node);
    }

    public void inAActualparameters(AActualparameters node)
    {
        defaultIn(node);
    }

    public void outAActualparameters(AActualparameters node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAActualparameters(AActualparameters node)
    {
        inAActualparameters(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            List<PMoreactualparameters> copy = new ArrayList<PMoreactualparameters>(node.getMoreactualparameters());
            for(PMoreactualparameters e : copy)
            {
                e.apply(this);
            }
        }
        outAActualparameters(node);
    }

    public void inAFormalparameters(AFormalparameters node)
    {
        defaultIn(node);
    }

    public void outAFormalparameters(AFormalparameters node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormalparameters(AFormalparameters node)
    {
        inAFormalparameters(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFpsection() != null)
        {
            node.getFpsection().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAFormalparameters(node);
    }

    public void inADotselectorSelector(ADotselectorSelector node)
    {
        defaultIn(node);
    }

    public void outADotselectorSelector(ADotselectorSelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADotselectorSelector(ADotselectorSelector node)
    {
        inADotselectorSelector(node);
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outADotselectorSelector(node);
    }

    public void inAArrselectorSelector(AArrselectorSelector node)
    {
        defaultIn(node);
    }

    public void outAArrselectorSelector(AArrselectorSelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrselectorSelector(AArrselectorSelector node)
    {
        inAArrselectorSelector(node);
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        outAArrselectorSelector(node);
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
        if(node.getVartxt() != null)
        {
            node.getVartxt().apply(this);
        }
        if(node.getIdentlist() != null)
        {
            node.getIdentlist().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAFpsection(node);
    }

    public void inAMoreactualparameters(AMoreactualparameters node)
    {
        defaultIn(node);
    }

    public void outAMoreactualparameters(AMoreactualparameters node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreactualparameters(AMoreactualparameters node)
    {
        inAMoreactualparameters(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAMoreactualparameters(node);
    }
}
