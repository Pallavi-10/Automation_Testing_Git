package Basic_Programs;

import java.util.Arrays;

public class J8Anangram 
{

	public static void main(String[] args) 
	{
	
		String a= "peek hi";
		String b = "KEEP iH";
		boolean ana = false;
		String a1= a.replaceAll("//s", "").toLowerCase();
		String b1=b.replaceAll("//s", "").toLowerCase();

		
		if(a1.length()!=b1.length())
		{
			ana=false;
		}
		else
		{

			char a3[]=a1.toCharArray();
			char b3[] = b1.toCharArray();
			Arrays.sort(a3);
			Arrays.sort(b3);
			ana=Arrays.equals(a3, b3);
			
		}
		if(ana==true)
		{
			System.out.println("String is a anagram ");
		}
		else
		{
			System.out.println("String is not a anagram ");
			
		}
		

	}

}
