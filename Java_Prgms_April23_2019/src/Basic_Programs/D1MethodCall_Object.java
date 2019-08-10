package Basic_Programs;

public class D1MethodCall_Object
{

	public static void main(String[] args)
	{
	
		int n=10;
		int m =20;
		D1MethodCall_Object o = new D1MethodCall_Object();	
		o.sum(n,m);// non static can be called on creating object		
		//Static can call only static members using class name else on creating object 
		
	}
	//**points**same class static can be called without even class name(previous pgm)but in other class use class name 
	//same class/from diff class non static can be called using object only
	//
	public void sum(int a,int b)
	{
		System.out.println("Sum of two digits is = "+(a+b));
	}

}
