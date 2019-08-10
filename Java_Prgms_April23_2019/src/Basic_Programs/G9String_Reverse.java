package Basic_Programs;

import java.util.Scanner;

public class G9String_Reverse 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string"); 
		
		String rev =s.next();
	
		//String p = "pallavi";
		
		int n = rev.length(); // starts from 1 so length is 7
		
		for(int i =n-1;i>=0;i--)//but index starts from 0 so use n-1
		{
			System.out.print(rev.charAt(i));//print to print in same line not println
		}
		s.close();
	}

}
