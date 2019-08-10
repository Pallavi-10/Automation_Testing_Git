package Basic_Programs;


class Exception1
{
	int a=100;
	int b=0;
	int p[] = new int[4];
	String m=null;
	
	void Excep()
	{
	try 
	{
		
		p[6]=10; //Arrar index out of bound 
	  int c=a/b; 
	  System.out.println(c);
		
	}
	catch(ArithmeticException e) 
	{
		System.out.println("divide by zero error thrown  "+e);
	}
	catch(NullPointerException e)
	{
		System.out.println("Null Pointer exception  "+e); 
	}
	catch(java.lang.Exception e)
	{
		System.out.println("Generic Exception "+e); //Generic catches those which are not defined 
	}
	//Generic Catch should always be written at the end//it generic for all
	}
}

public class G4GenericException
{

	public static void main(String[] args)
	{
	
		Exception1 e = new Exception1();
		e.Excep();
	}

}
