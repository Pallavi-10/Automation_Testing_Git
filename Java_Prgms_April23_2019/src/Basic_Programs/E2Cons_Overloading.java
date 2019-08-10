package Basic_Programs;

public class E2Cons_Overloading
{
	int v1;
	int v2;
	
	E2Cons_Overloading()
	{
		System.out.println("No parameter");
	}
	
	E2Cons_Overloading(int a ,int b)
	{
		v1=a;
		v2=b;
	}
	
	E2Cons_Overloading(int a)
	{
		v1=a;
	}
	void display()
	{
		System.out.println("values are "+v1+" and "+v2);
	}
	public static void main(String[] args)
	{
		E2Cons_Overloading o1 =new E2Cons_Overloading();
		E2Cons_Overloading o2 =new E2Cons_Overloading(10,20);
		E2Cons_Overloading o3 =new E2Cons_Overloading(99);
		
		o1.display();
		o2.display();
		o3.display();
	}

}
