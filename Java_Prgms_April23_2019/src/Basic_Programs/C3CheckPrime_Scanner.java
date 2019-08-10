package Basic_Programs;

import java.util.Scanner;

public class C3CheckPrime_Scanner
{

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		boolean p=false;
		
		if (n!=1 && n!=2) 
		{
			for(int i =2;i<n;i++)
			{
				if(n%i==0)
				{
					p= true;
					break;
				
				}
				
			}
			if(p==true)
			
				System.out.println("Not a Prime");
			else
				System.out.println("Prime number");
		
		}
		else
		{
			System.out.println("entered value is one/two");
		}
		
		s.close();
	}

}
