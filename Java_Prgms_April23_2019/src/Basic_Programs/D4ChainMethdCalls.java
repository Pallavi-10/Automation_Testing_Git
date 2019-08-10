package Basic_Programs;

public class D4ChainMethdCalls {

	public static void main(String[] args)
	{

		int a =20;
		int b =10;
		sum(a,b);//static can call only static methods
		
	}
	
	static void sum(int a,int b)
	{
		System.out.println("Sum = "+ (a+b));
		D4ChainMethdCalls o1 = new D4ChainMethdCalls(); //Non static by object creation
		o1.Mul(a,b);
	}
	
	void Mul(int a,int b)
	{
		System.out.println("Mul = "+ (a*b));
		div(a,b);
		sub(a,b);//Non static can call both static and non static methods
	}
	
	void sub(int a,int b) //Non static method
	{
		System.out.println("Sub = "+ (a-b));
	}

	static void div(int a,int b) //Static method
	{
		System.out.println("Div = "+ (a/b));
	}

}
