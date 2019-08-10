package Basic_Programs;

import java.util.Scanner;

public class B8FilterStringInt_Scanner {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value to filter");
		
		while(s.hasNext())
		{
			if(s.hasNextInt())
			{
				System.out.println("Entered value is a integer = " + s.nextInt());
				
			}
			else
			{
				System.out.println("Enetered value is not a integer = "+ s.next());
			}
		}
		s.close();

	}

}
