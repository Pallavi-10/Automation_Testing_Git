package Basic_Programs;

public class C8SwapNo_WithoutTemp
{

	public static void main(String[] args) 
	{
	
		int a =100;
		int b =50;
		
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a=a+b;
		a=a-b;
		b=a-b;
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
