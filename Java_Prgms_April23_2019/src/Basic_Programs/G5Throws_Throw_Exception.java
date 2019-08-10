package Basic_Programs;

public class G5Throws_Throw_Exception 
{

	public static void main(String[] args) throws InterruptedException,ArithmeticException
	{
		  Thread.sleep(10000); 
		  System.out.println("Hello Geeks"); 
		  
		//  int a =100/0;
		//  System.out.println(a);
		  throw new InterruptedException("Time out pallu");
		  //to explicitly call the exception 
	       

	}

}
