package Basic_Programs;

public class C8SwapNo_UsingTemp
{

	public static void main(String[] args)
	{
		int a =100;
		int b =50;
		
		int temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
