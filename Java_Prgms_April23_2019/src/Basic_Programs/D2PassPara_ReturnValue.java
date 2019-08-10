package Basic_Programs;

public class D2PassPara_ReturnValue
{

	public static void main(String[] args) 
	{
		
		int n=10;
		int m =20;
		System.out.println("Sum of two digits is = "+sum(n,m));// Passing argument
		
	}
	
	public static int sum(int a,int b) // These are parameters
	{
		return a+b; // Return type should be mentioned and return can only pass one value.
	}

}
