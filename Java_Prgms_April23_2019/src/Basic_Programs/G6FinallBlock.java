package Basic_Programs;

class div2
{
	int a=100;
	int b=0;
	
	void div1()
	{
	try 
	{
	int c =a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e) //catch should be immediate after try block
	{
		System.out.println("divide by zero error thrown");
	}
	finally
	{
		System.out.println("Finally am executed after exception");
	}//Exception handled or not finally will always execute
	}
}

public class G6FinallBlock 
{

	public static void main(String[] args) 
	{
		
		div2 d = new div2();
		d.div1();
	}

}
