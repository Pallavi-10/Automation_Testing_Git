package Basic_Programs;

public class H3Compare_String 
{

	public static void main(String[] args) 
	{
	
		String s ="pallavi";
		String g ="ganavii";
		
		int n =s.length();
		int m =g.length();
		
		if(n==m)
		{
			for(int i =0;i<n;i++)
			{
				if(s.charAt(i)==g.charAt(i))
				{
					System.out.println("Letter at index "+i+" is same in both the strings ="+s.charAt(i));
				}
				else
				{
					System.out.println("Letter at index "+i+" is not same in both the strings");
				}
			}
		}
		else
		{
			System.out.println("Strings are of different length");
		}

	}

}
