package Basic_Programs;

public class D3Class1_TwoclassesClass 
{

	public static void main(String[] args)
	{
		
		int n=50; //local variables can not be made static onlt global can be made as static
		int m=20;
		D3Class2_Methods.sum(n,m); //static call to a method in different class
		
		D3Class2_Methods o = new D3Class2_Methods(); // object to call non static method
		o.Sub(n,m);
		
	}
}


