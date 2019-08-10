package Basic_Programs;

interface inter3 
{
	abstract void TV(); //Interface can not be instantiated
	abstract void AC();
}
interface inter4 
{
	abstract void AC(); //Interface can not be instantiated

}

class EX1 implements inter3,inter4
{
	void parent()
	{
		System.out.println("Parent class");
	}

	@Override
	public void TV()
	{
		System.out.println("TV brand is Samsung");
		
	}

	@Override
	public void AC()
	{
		System.out.println("AC is LG brand");
		
	}
	
	
}

abstract class EX2 implements inter3 //Implements but not overridden so class becomes abstract
//Can not instantiate this class 
//Any class that extends this should provide body to TV method
{
	void parent()
	{
		System.out.println("Parent class");
	}
	
}


public class F6Inter_SingleClassMultiImplimnts 
{

	public static void main(String[] args)
	{
	
		inter3 p = new EX1();
		p.TV(); // Parent specific members
		p.AC();
		
		inter4 n = new EX1();
		n.AC();
		
		EX1 m = new EX1();
		m.AC(); 
		m.TV();
		m.parent();
		
		
	}

}
