package Basic_Programs;

public class C5Global_LocalVariables 
{
	static int a;//default 0
	static double b;//default 0.0
	static int c=1;
	static String s; // default null
	static char d;// default space
	static boolean e;//default false
	static int p =50;//same in local 

	public static void main(String[] args) 
	{
		//all local variables should be initialized
		int p=10; // block specific 
		int q=20;
		int j=30;
		int a=9; // local can have same name as global variable but preference will be to local variable only
		//int p =90;// Can not declare same name with in a method or inside any loop with in a 
		
		System.out.println("GV "+a);
		System.out.println("GV "+b);
		System.out.println("GV "+c);
		System.out.println("GV "+s);
		System.out.println("GV "+e);
		System.out.println(d+"space exists for default char");
		
		System.out.println("GV"+C5Global_LocalVariables.p);//then to access global use class name  or create object
		System.out.println("LV"+q);
		System.out.println("LV"+j);
		System.out.println("LV"+p);
		
		sum();
		a=10;//when same variable is declared in local then this points to local not the global so local is changed now
		C5Global_LocalVariables.sum();//method call in both the ways in same class
		
	// method inside a method is not possible even main is a method.
		C5Global_LocalVariables.a=500;
		C5Global_LocalVariables.sum();
	}
	
	public static void sum()
	{
		
		//System.out.println(j);// can not use i as it is block specific
		System.out.println("Global variable "+a); //Any function can access the global variable and change it
		//latest updated value will be considered
	}

}
