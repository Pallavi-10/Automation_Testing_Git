package Basic_Programs;

public class D6GlobalStaticObject
{

	static D6GlobalStaticObject o =new D6GlobalStaticObject();// creating global object that can be used across
	public static void main(String[] args)
	{

		int a =20;
		int b =10;
		D6GlobalStaticObject o1 =new D6GlobalStaticObject();//block specific
		o.sum(a,b);
		o1.sum(a, b);
		
	}
	
	 void sum(int a,int b)
	{
		System.out.println("Sum = "+ (a+b));
		o.Mul(a,b);
		//o1.sum(a,b);//can not access o1 block specific
	}
	
	void Mul(int a,int b)
	{
		System.out.println("Mul = "+ (a*b));
		
	}

}
