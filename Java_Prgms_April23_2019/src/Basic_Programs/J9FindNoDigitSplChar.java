package Basic_Programs;

public class J9FindNoDigitSplChar 
{

	public static void main(String[] args)
	{
		String s ="#$#%ERTYetrt#$%676";
		
		int LC=0;
		int UC=0;
		int dig=0;
		int spl=0;
		
		for(int i =0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				LC++;
			}

			else if(Character.isUpperCase(ch))
			{
				UC++;
			}

			else if(Character.isDigit(ch))
			{
				dig++;
			}

			else
			{
				spl++;
			}
			
		}
		
		System.out.println("Lower case count ="+ LC);
		System.out.println("Upper case count ="+ UC);
		System.out.println("Digit case count ="+ dig);
		System.out.println("Special case count ="+ spl);
	}

}
