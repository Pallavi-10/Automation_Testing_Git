package Basic_Programs;

import java.util.Scanner;

public class B3Check_EvenorOdd {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = s.nextInt();
		
		System.out.println("Value entered is = "+n);
		
		if(n%2==0)
		{
		System.out.println("entered value is even");	
		}
		else
		{
			System.out.println("Value entered is Odd");	
		}
		s.close();
	}

}
