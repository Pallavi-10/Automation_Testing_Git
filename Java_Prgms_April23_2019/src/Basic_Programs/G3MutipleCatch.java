package Basic_Programs;

class Exception
{
	int a=100;
	int b=0;
	int p[] = new int[4];
	String m=null;
	
	void Exception1()
	{
	try 
	{
		m.equals("pall"); //Throws null pointer exception
		p[6]=10; //Respective catch will be executed , Index out of bound
	  int c=a/b; //Arithmetic Exception
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
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsExceptionexception  "+e); 
	}
	}
}

public class G3MutipleCatch 
{

	public static void main(String[] args) 
	{
		Exception e = new Exception();
		e.Exception1();

	}

}
