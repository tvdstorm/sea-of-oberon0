package uva.oberon0;

public class Program 
{
    public static void main(String args[])
    {
    	//Test.testAll();
    	
    	uva.oberon0.abstractsyntax.declarations.Module module = uva.oberon0.parser.Helper.createModuleFromFile("D:\\Projects UVA\\Smoke Test.txt");
    	module.eval();
    	
    	System.exit(0);
    }
} 

