package Basic_Programs;

public class D7Glob_Instnce_Static_Varibles 
{
	static int a=100; //static variables are one for class 
	static int b = 200;
	
	int c=20; //Instance variables are one for object
	int d=40;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		a=500; 
		display();
		D7Glob_Instnce_Static_Varibles o = new D7Glob_Instnce_Static_Varibles();
		o.c=80;//changed by one object will not reflect to another object as it is instance variable
		
	}

	static void display()
	{
		
		System.out.println(a);
		
		D7Glob_Instnce_Static_Varibles o = new D7Glob_Instnce_Static_Varibles();
		System.out.println(o.c);
	}
}
