package Basic_Programs;

public class J3String_DateSplit
{

	public static void main(String[] args) 
	{
	
		String s= "06062019";
		
		String date =s.substring(0,2);
		System.out.println(date);
		String month =s.substring(2,4);
		String year =s.substring(4,8);
		System.out.println(month);
		System.out.println(year);

	}

}
