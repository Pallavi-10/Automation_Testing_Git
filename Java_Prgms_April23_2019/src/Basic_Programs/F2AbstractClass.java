package Basic_Programs;

abstract class abstract1
{
	void Display() //same method modified in child class
	{
		System.out.println("I am in abstract Class");
	}
	
	abstract void TV();
	
}

class Demo1 extends abstract1
{
	void parent() //same method modified in child class
	{
		System.out.println("Parent class");
	}
	
	void TV()
	{
		System.out.println("TV brand is LG");
	}
}


public class F2AbstractClass 
{

	public static void main(String[] args)
	{
		
		Demo1 d = new Demo1();
		d.TV();
		d.Display();
		d.parent();
	}

}
