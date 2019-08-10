package Basic_Programs;

public class C7Pattern2 
{

	public static void main(String[] args) 
	{


		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print("*");// should print in same line until it comes out f loop
			}
			System.out.println("");//should point to next line for new looping
		}


	}

}
