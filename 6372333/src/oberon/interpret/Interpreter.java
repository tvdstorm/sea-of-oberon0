package oberon.interpret;

import oberon.analysis.DepthFirstAdapter;
import oberon.node.AProgram;

public class Interpreter extends DepthFirstAdapter { 
	  
	   public void caseAProgram(AProgram node) { 	
		  /*String lhs = node.getLeft().getText().trim(); 
	      String rhs = node.getRight().getText().trim();
	      POperator operator = node.getOperator();
	      int result = 0;
	      String operatorString = "";
	      if (operator instanceof APlusOperator)
	      {
	    	  result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue();
	    	  operatorString = "+";
	      }
	      else if(operator instanceof AMinusOperator)
	      {
	    	  result = (new Integer(lhs)).intValue() - (new Integer(rhs)).intValue();
	    	  operatorString = "-";
	      }
	      
	      System.out.println(lhs + operatorString + rhs + "=" + result); */
	   } 
	}