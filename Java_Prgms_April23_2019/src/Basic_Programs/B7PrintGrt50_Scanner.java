package Basic_Programs;

import java.util.Scanner;

public class B7PrintGrt50_Scanner
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter list of numbers");
		int n =0;
		for(;s.hasNextInt();n=s.nextInt())
		{

			if (n>=50)
			{
				System.out.println(n);
			}
		}
		s.close();
	}

}
