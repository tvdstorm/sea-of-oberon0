/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.analysis;

import java.util.*;
import oberon.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAModule(AModule node)
    {
        defaultCase(node);
    }

    public void caseADeclarations(ADeclarations node)
    {
        defaultCase(node);
    }

    public void caseAConstdecl(AConstdecl node)
    {
        defaultCase(node);
    }

    public void caseAConstdeclaration(AConstdeclaration node)
    {
        defaultCase(node);
    }

    public void caseATypedecl(ATypedecl node)
    {
        defaultCase(node);
    }

    public void caseATypedeclaration(ATypedeclaration node)
    {
        defaultCase(node);
    }

    public void caseAVardecl(AVardecl node)
    {
        defaultCase(node);
    }

    public void caseAVardeclaration(AVardeclaration node)
    {
        defaultCase(node);
    }

    public void caseAFieldlst(AFieldlst node)
    {
        defaultCase(node);
    }

    public void caseAFieldlist(AFieldlist node)
    {
        defaultCase(node);
    }

    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    public void caseAArrayType(AArrayType node)
    {
        defaultCase(node);
    }

    public void caseARecordType(ARecordType node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierType(AIdentifierType node)
    {
        defaultCase(node);
    }

    public void caseAProceduredeclaration(AProceduredeclaration node)
    {
        defaultCase(node);
    }

    public void caseAProcedurecall(AProcedurecall node)
    {
        defaultCase(node);
    }

    public void caseAProcedureheading(AProcedureheading node)
    {
        defaultCase(node);
    }

    public void caseAProcedurebody(AProcedurebody node)
    {
        defaultCase(node);
    }

    public void caseAFpsection(AFpsection node)
    {
        defaultCase(node);
    }

    public void caseAWhilestatement(AWhilestatement node)
    {
        defaultCase(node);
    }

    public void caseAIfstatement(AIfstatement node)
    {
        defaultCase(node);
    }

    public void caseAAddExp(AAddExp node)
    {
        defaultCase(node);
    }

    public void caseASubExp(ASubExp node)
    {
        defaultCase(node);
    }

    public void caseAMulExp(AMulExp node)
    {
        defaultCase(node);
    }

    public void caseADivExp(ADivExp node)
    {
        defaultCase(node);
    }

    public void caseAModExp(AModExp node)
    {
        defaultCase(node);
    }

    public void caseAAmpExp(AAmpExp node)
    {
        defaultCase(node);
    }

    public void caseATilExp(ATilExp node)
    {
        defaultCase(node);
    }

    public void caseAExeqExp(AExeqExp node)
    {
        defaultCase(node);
    }

    public void caseAExhaExp(AExhaExp node)
    {
        defaultCase(node);
    }

    public void caseAExstExp(AExstExp node)
    {
        defaultCase(node);
    }

    public void caseAExseExp(AExseExp node)
    {
        defaultCase(node);
    }

    public void caseAExgtExp(AExgtExp node)
    {
        defaultCase(node);
    }

    public void caseAExgeExp(AExgeExp node)
    {
        defaultCase(node);
    }

    public void caseAParenExp(AParenExp node)
    {
        defaultCase(node);
    }

    public void caseAIntegerExp(AIntegerExp node)
    {
        defaultCase(node);
    }

    public void caseASelectorExp(ASelectorExp node)
    {
        defaultCase(node);
    }

    public void caseARecordSelector(ARecordSelector node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierSelector(AIdentifierSelector node)
    {
        defaultCase(node);
    }

    public void caseAArrayexpressionSelector(AArrayexpressionSelector node)
    {
        defaultCase(node);
    }

    public void caseARecord(ARecord node)
    {
        defaultCase(node);
    }

    public void caseAReadproc(AReadproc node)
    {
        defaultCase(node);
    }

    public void caseAWriteproc(AWriteproc node)
    {
        defaultCase(node);
    }

    public void caseAWritelnproc(AWritelnproc node)
    {
        defaultCase(node);
    }

    public void caseAStatassStatement(AStatassStatement node)
    {
        defaultCase(node);
    }

    public void caseAStatifStatement(AStatifStatement node)
    {
        defaultCase(node);
    }

    public void caseAReadprocStatement(AReadprocStatement node)
    {
        defaultCase(node);
    }

    public void caseAWriteprocStatement(AWriteprocStatement node)
    {
        defaultCase(node);
    }

    public void caseAWritelnprocStatement(AWritelnprocStatement node)
    {
        defaultCase(node);
    }

    public void caseAStatprocStatement(AStatprocStatement node)
    {
        defaultCase(node);
    }

    public void caseAStatwhileStatement(AStatwhileStatement node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    public void caseTLBrc(TLBrc node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    public void caseTRBrc(TRBrc node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTTil(TTil node)
    {
        defaultCase(node);
    }

    public void caseTExeq(TExeq node)
    {
        defaultCase(node);
    }

    public void caseTExha(TExha node)
    {
        defaultCase(node);
    }

    public void caseTExst(TExst node)
    {
        defaultCase(node);
    }

    public void caseTExse(TExse node)
    {
        defaultCase(node);
    }

    public void caseTExgt(TExgt node)
    {
        defaultCase(node);
    }

    public void caseTExge(TExge node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTAss(TAss node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTModuletxt(TModuletxt node)
    {
        defaultCase(node);
    }

    public void caseTConsttxt(TConsttxt node)
    {
        defaultCase(node);
    }

    public void caseTTypetxt(TTypetxt node)
    {
        defaultCase(node);
    }

    public void caseTVartxt(TVartxt node)
    {
        defaultCase(node);
    }

    public void caseTBegintxt(TBegintxt node)
    {
        defaultCase(node);
    }

    public void caseTEndtxt(TEndtxt node)
    {
        defaultCase(node);
    }

    public void caseTRecordtxt(TRecordtxt node)
    {
        defaultCase(node);
    }

    public void caseTArraytxt(TArraytxt node)
    {
        defaultCase(node);
    }

    public void caseTOftxt(TOftxt node)
    {
        defaultCase(node);
    }

    public void caseTWhiletxt(TWhiletxt node)
    {
        defaultCase(node);
    }

    public void caseTDotxt(TDotxt node)
    {
        defaultCase(node);
    }

    public void caseTIftxt(TIftxt node)
    {
        defaultCase(node);
    }

    public void caseTThentxt(TThentxt node)
    {
        defaultCase(node);
    }

    public void caseTElsiftxt(TElsiftxt node)
    {
        defaultCase(node);
    }

    public void caseTElsetxt(TElsetxt node)
    {
        defaultCase(node);
    }

    public void caseTReadtxt(TReadtxt node)
    {
        defaultCase(node);
    }

    public void caseTWritetxt(TWritetxt node)
    {
        defaultCase(node);
    }

    public void caseTWritelntxt(TWritelntxt node)
    {
        defaultCase(node);
    }

    public void caseTProceduretxt(TProceduretxt node)
    {
        defaultCase(node);
    }

    public void caseTSptxt(TSptxt node)
    {
        defaultCase(node);
    }

    public void caseTAdd(TAdd node)
    {
        defaultCase(node);
    }

    public void caseTSub(TSub node)
    {
        defaultCase(node);
    }

    public void caseTMul(TMul node)
    {
        defaultCase(node);
    }

    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    public void caseTAmp(TAmp node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTBlankNewline(TBlankNewline node)
    {
        defaultCase(node);
    }

    public void caseTBlankWhitespace(TBlankWhitespace node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
