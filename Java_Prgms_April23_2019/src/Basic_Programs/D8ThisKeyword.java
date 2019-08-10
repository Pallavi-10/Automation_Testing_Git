package Basic_Programs;

public class D8ThisKeyword
{

	int a,b;
	public static void main(String[] args) 
	{

		D8ThisKeyword o =new D8ThisKeyword();
		o.sum(10,20);
		
	}
	
	 void sum(int a,int b)
	{
		 //By default local will have preference
		 //To avoid conflict between global and local naming we can use this
		 //This refers to current class member
		this.a=a;//10 is assigned to a
		b=this.b;// 0 is assigned to b
		System.out.println(a);
		System.out.println(b);
	}

}
