/* This file was generated by SableCC (http://www.sablecc.org/). */

package oberon.analysis;

import oberon.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAModule(AModule node);
    void caseADeclarations(ADeclarations node);
    void caseAConstdecl(AConstdecl node);
    void caseAConstdeclaration(AConstdeclaration node);
    void caseATypedecl(ATypedecl node);
    void caseATypedeclaration(ATypedeclaration node);
    void caseAVardecl(AVardecl node);
    void caseAVardeclaration(AVardeclaration node);
    void caseAAssignment(AAssignment node);
    void caseAArrayType(AArrayType node);
    void caseAIdentifierType(AIdentifierType node);
    void caseAProceduredeclaration(AProceduredeclaration node);
    void caseAProcedurecall(AProcedurecall node);
    void caseAProcedureheading(AProcedureheading node);
    void caseAProcedurebody(AProcedurebody node);
    void caseAFpsection(AFpsection node);
    void caseAWhilestatement(AWhilestatement node);
    void caseAIfstatement(AIfstatement node);
    void caseAAddExp(AAddExp node);
    void caseASubExp(ASubExp node);
    void caseAMulExp(AMulExp node);
    void caseADivExp(ADivExp node);
    void caseAModExp(AModExp node);
    void caseAAmpExp(AAmpExp node);
    void caseATilExp(ATilExp node);
    void caseAExeqExp(AExeqExp node);
    void caseAExhaExp(AExhaExp node);
    void caseAExstExp(AExstExp node);
    void caseAExseExp(AExseExp node);
    void caseAExgtExp(AExgtExp node);
    void caseAExgeExp(AExgeExp node);
    void caseAParenExp(AParenExp node);
    void caseAIntegerExp(AIntegerExp node);
    void caseAIdentselExp(AIdentselExp node);
    void caseAIdentifierSelector(AIdentifierSelector node);
    void caseAExpressionSelector(AExpressionSelector node);
    void caseANoneSelector(ANoneSelector node);
    void caseAStatassStatement(AStatassStatement node);
    void caseAStatprocStatement(AStatprocStatement node);
    void caseAStatifStatement(AStatifStatement node);
    void caseAStatwithStatement(AStatwithStatement node);

    void caseTDot(TDot node);
    void caseTLBkt(TLBkt node);
    void caseTLBrc(TLBrc node);
    void caseTLPar(TLPar node);
    void caseTRBkt(TRBkt node);
    void caseTRBrc(TRBrc node);
    void caseTRPar(TRPar node);
    void caseTTil(TTil node);
    void caseTExeq(TExeq node);
    void caseTExha(TExha node);
    void caseTExst(TExst node);
    void caseTExse(TExse node);
    void caseTExgt(TExgt node);
    void caseTExge(TExge node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTAss(TAss node);
    void caseTSemi(TSemi node);
    void caseTModuletxt(TModuletxt node);
    void caseTConsttxt(TConsttxt node);
    void caseTTypetxt(TTypetxt node);
    void caseTVartxt(TVartxt node);
    void caseTBegintxt(TBegintxt node);
    void caseTEndtxt(TEndtxt node);
    void caseTRecordtxt(TRecordtxt node);
    void caseTArraytxt(TArraytxt node);
    void caseTOftxt(TOftxt node);
    void caseTWhiletxt(TWhiletxt node);
    void caseTDotxt(TDotxt node);
    void caseTIftxt(TIftxt node);
    void caseTThentxt(TThentxt node);
    void caseTElsiftxt(TElsiftxt node);
    void caseTElsetxt(TElsetxt node);
    void caseTProceduretxt(TProceduretxt node);
    void caseTSptxt(TSptxt node);
    void caseTAdd(TAdd node);
    void caseTSub(TSub node);
    void caseTMul(TMul node);
    void caseTMod(TMod node);
    void caseTAmp(TAmp node);
    void caseTDiv(TDiv node);
    void caseTInteger(TInteger node);
    void caseTIdentifier(TIdentifier node);
    void caseTBlankNewline(TBlankNewline node);
    void caseTBlankWhitespace(TBlankWhitespace node);
    void caseTTab(TTab node);
    void caseEOF(EOF node);
}
