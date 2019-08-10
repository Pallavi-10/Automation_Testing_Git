package Basic_Programs;

public class J5stringpgm 
{

	public static void main(String[] args) 
	{
		String s = "AEgsdgdstyateimosu";//Remove vowels
		
		String a =s.replaceAll("[AEIOUaeiou]", "");
		System.out.println(a);
		
		
	}

}
