package Basic_Programs;

public class C9StaticCall_SumMethd 
{

	public static void main(String[] args)
	{
		
		int n=10;
		int m=20;
	  sum(n,m); // within same class no need of using class name to call
		// static can call only static members.
	}
	
	public static  void sum(int a,int b)// method can not be written in another method(main is a method)
	{
		System.out.println("Sum of two digits is = "+(a+b));
			
	}


}
