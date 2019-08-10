package Basic_Programs;

public class H2Swap_Strings 
{

	public static void main(String[] args)
	{
		
		String p ="Pallavi";
		String g ="Ganavi";
		String temp;
		
		System.out.println("Before swap P= "+p);
		System.out.println("Before swap G= "+g);
		
		temp =g;
		g=p;
		p=temp;
		System.out.println("");
		System.out.println("After swap P= "+p);
		System.out.println("After swap G= "+g);

	}

}
