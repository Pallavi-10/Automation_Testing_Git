package Basic_Programs;
public class F1Method_Overriding
{
	public static void main(String[] args) 
	{
		
		A5 o = new B5();
		o.parentsaree(); // access method that is overridden
		//o.childmeth //can not be accessed through parent reference
		
		A5 o1 = new A5();
		o1.parentsaree(); //parent method
			
		B5 o2 = new B5();
		o2.parentsaree();//child method
		o2.childmeth();
		
		B5 p = (B5)o;
		p.parentsaree();//child method
		p.childmeth();			
	}
}
class A5
{
	void parentsaree() //same method modified in child class
	{
		System.out.println("Mummas saree");
	}
}

class B5 extends A5 //Inheritance is must for method overriding
{
	void parentsaree()
	{
		System.out.println("Mummas saree modified by child");
	}
	void childmeth()
	{
		System.out.println("Child method");
	}
}