package Basic_Programs;

public class J7CharOccuranceString 
{

	public static void main(String[] args)
	{
		String s = "AEgsdaaagdstyateimosu";//Remove vowels
		
		int a =s.replaceAll("a", "").length();
		int countofa = s.length()-a;
		
		System.out.println("Occurance of a in string = "+countofa);
	}

}
