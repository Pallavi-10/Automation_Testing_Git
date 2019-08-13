package Basic_Programs;

public class H4String_Palindrome
{

	public static void main(String[] args)
	{

		String g ="abCivicba";
		String s =g.toUpperCase();
		Boolean palin =false;
		int n =s.length();
		char c[]=s.toCharArray();
		
		int k=n-1;
		for(int j=0;j<n/2;j++)
		{
			if(c[j]==c[k])
			{
				palin =true;
				k--;
			}
			else
			{
				palin=false;
				break;
			}			
		}
		if(palin)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
			
		}
	}

}
