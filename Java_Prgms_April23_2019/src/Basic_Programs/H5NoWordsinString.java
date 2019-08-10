package Basic_Programs;

import java.util.Scanner;

public class H5NoWordsinString 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence"); 
		
		String rev =s.nextLine();
		
		String ar[]=rev.split(" ");
		int n = ar.length;
		
		System.out.println("No of words in a sentence are "+n);
		s.close();

	}

}
