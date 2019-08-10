package Basic_Programs;

abstract class abstract2
{
	void Display() //same method modified in child class
	{
		System.out.println("I am in abstract Class");
	}
	
	abstract void TV();
	abstract void Radio();
	
}

abstract class Demo2 extends abstract2
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

class Demo3 extends Demo2
{
	void Child() //same method modified in child class
	{
		System.out.println("Child class");
	}
	
	void Radio() 
	{
		System.out.println("Radio is ON");
	}
}

public class F3_AbstractRef_MultiAbstractClass
{

	public static void main(String[] args) 
	{
	
		abstract2 d = new Demo3();//abstract ref to its child class
		d.TV();
		d.Radio();
		d.Display();
		
		Demo2 d1 = new Demo3();
		d1.parent();
		d1.Radio();
		d1.TV();
		d1.Display();
	}
}
