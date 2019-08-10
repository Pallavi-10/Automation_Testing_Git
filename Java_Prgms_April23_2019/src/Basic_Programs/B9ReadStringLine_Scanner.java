package Basic_Programs;

import java.util.Scanner;

public class B9ReadStringLine_Scanner
{

	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the line");
		
		if(s.hasNextLine())
		{
		System.out.println("Complete sentence is read as a line using nextline() \n" + s.nextLine());
		}
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the line");
		
		while(s1.hasNext())
		{
		String q = s1.next();
		System.out.println("Sentence where space and next line is considered as delimeter "+ q);
		}
		s.close();
		s1.close();
	}

}
