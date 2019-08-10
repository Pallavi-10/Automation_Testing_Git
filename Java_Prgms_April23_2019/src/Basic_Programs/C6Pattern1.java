package Basic_Programs;

public class C6Pattern1 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print("*");// should print in same line until it comes out f loop
			}
			System.out.println("");//should point to next line for new looping
		}

	}

}
