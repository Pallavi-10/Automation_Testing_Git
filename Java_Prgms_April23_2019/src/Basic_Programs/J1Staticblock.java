package Basic_Programs;

class Demop
{
	
	static
	{
		System.out.println("static block1");
	}
	{
		System.out.println("Non static block in Class Demop");
	}
	
	Demop()
	{
		System.out.println("I am a constructor");
	}
	static
	{
		System.out.println("static block2");
	}
}


public class J1Staticblock 
{
	
	public static void main(String[] args) 
	{
	    new Demop();
		{
			System.out.println("Statement in main");
			
		}

	}
	static
	{
		System.out.println("static block3 in main");
	}

}
