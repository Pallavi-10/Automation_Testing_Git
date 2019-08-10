package Basic_Programs;

import java.util.Scanner;

public class H1Sentence_Reverse
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence"); 
		
		String rev =s.nextLine();
		
		String ar[]=rev.split(" ");
		int n = ar.length;
		System.out.println("Reverse of a string is ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ar[i]);
			System.out.print(" ");
		}
		
		s.close();
	}

}
