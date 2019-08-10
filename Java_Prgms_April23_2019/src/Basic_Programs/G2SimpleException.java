package Basic_Programs;


class div
{
	int a=100;
	int b=0;
	
	void div1()
	{
	try 
	{
	int c =a/b; //exception caught ,Next next after exception will never be exceuted
	System.out.println("Hi");
	System.out.println(c);
	}
	catch(ArithmeticException e) //catch should be immediate after try block
	{
		System.out.println("divide by zero error thrown");
	}
	
	}
}

public class G2SimpleException
{

	public static void main(String[] args)
	{
	
		div d = new div();
		d.div1();

	}

}
