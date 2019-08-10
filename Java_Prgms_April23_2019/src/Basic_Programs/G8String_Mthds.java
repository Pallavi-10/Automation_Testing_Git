package Basic_Programs;

public class G8String_Mthds 
{

	public static void main(String[] args) 
	{
		String s ="pallavi";
		String p ="ganavi";
		String m="PallAVI";
		int n = s.length();//String length
		System.out.println("Length of a string is "+n);
		
		if(s.equals(p)) //String equals
		{
			System.out.println("String is equal"+p);
		}
		else
		{
			System.out.println("String is not equal");	
		}
		
		if(s.equalsIgnoreCase(m))//String Equals ignore case
		 {
			 System.out.println("String equal "+s);
		 }
	
		char a = s.charAt(4);//Charter a specific index
		System.out.println("Character at index 3 of s = "+a);
		
		String o = " test test   ";
		String t =o.trim();//Trims starting and ending spaces
		System.out.println("After trimming o = "+t);
	
		String LC= s.toLowerCase(); //To lower case
		String UC =s.toUpperCase(); //To upper case
		System.out.println("Converted s to upper case = "+UC+" And also to lower case = "+LC);
		
		String sp="Pallavi,Ganavi,Nethra,Pavan,Nash,Dilip,Jaggu,Vin";
		String ar []= sp.split(","); //Split string to array with delimiter
		
		for(int i =0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		String con= s.concat(p);//Join two strings
		System.out.println("Concatinated result = "+con);
		
		int comp=s.compareTo(p);//Returns integer
		System.out.println(comp); 
		//s1 == s2 :0
		//s1 > s2   :positive value
		//s1 < s2   :negative value
	
		if(s.contains("i"))//Check if the string contains particular letter
		{
			System.out.println("String s contains letter \"i\" ");
		}
		
		String rep= s.replace('l', 'o');//Replace a character
		System.out.println("After replacing a character in string s = "+rep);
		
		char[] pal= s.toCharArray();
		for(int i =0;i<pal.length;i++)
		{
			System.out.println(pal[i]);
		}
		System.out.println("output of substring is");
		System.out.println(s.substring(1, 6));
	}

}
