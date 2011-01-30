public class Program 
{
    public static void main(String args[])
    {
    	Test.testAll();
    	
    	AbstractSyntax.Structure.Module module = ANTLR.Helper.createModuleFromFile("D:\\Projects UVA\\Smoke Test.txt");
    	module.eval();
    	
    	System.exit(0);
    }
} 

