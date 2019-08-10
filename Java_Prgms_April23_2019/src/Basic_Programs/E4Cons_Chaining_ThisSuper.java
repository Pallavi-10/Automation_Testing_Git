package Basic_Programs;

public class E4Cons_Chaining_ThisSuper 
{
	E4Cons_Chaining_ThisSuper()
	{
	
		System.out.println("Parent class constructor with zero para");
	}
	
	E4Cons_Chaining_ThisSuper(String a)
	{
		this();
		System.out.println("Parent class cons with string para "+a);
	}
	

	public static void main(String[] args)
	{
		
		ConsThis o = new ConsThis();
		o.display("done");
	}

}

class ConsThis extends E4Cons_Chaining_ThisSuper
{
	ConsThis()
	{
		this("This call from child");
		System.out.println("Inside Child constructor");
		
	}
	
	ConsThis(String m)
	{
		super("Super call from child");
		System.out.println("Inside Child constructor "+m);
	}
	
	void display(String h)
	{
		System.out.println("In child class-"+h);
	}
	
}
