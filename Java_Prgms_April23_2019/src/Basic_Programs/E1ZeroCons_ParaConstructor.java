package Basic_Programs;

public class E1ZeroCons_ParaConstructor 
{
	int a;
	int b;
	E1ZeroCons_ParaConstructor() //zero para
	{
		a=100;
		b=200;
		System.out.println("I am zero parameterized constructor "+(a+b));
	}

	E1ZeroCons_ParaConstructor(int a ,int b)// parameterized
	{
	 System.out.println("I am parameterized constructor "+(a+b));
	}
	
	public static void main(String[] args)
	{
		E1ZeroCons_ParaConstructor o = new E1ZeroCons_ParaConstructor();	
		E1ZeroCons_ParaConstructor o1 = new E1ZeroCons_ParaConstructor(10,20);
		
		//just avoid warning
		o.a=44;
		o1.b=55;
		System.out.println(o.a+o1.b);
	}

}
