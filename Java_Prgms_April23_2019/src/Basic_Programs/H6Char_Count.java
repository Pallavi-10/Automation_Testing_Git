package Basic_Programs;

public class H6Char_Count {

	public static void main(String[] args) 
	{
		   
		    int count;
		    String a = "pnvkaskas";
		    a = a.toLowerCase();
		    for (char p = 'a'; p <= 'z'; p++) 
		    {
		        count = 0;
		        for (int i = 0; i < a.length(); i++) 
		        {
		            if (p== a.charAt(i))
		            {
		                count++;
		            }
		        }

		        if(count>0)
		        {
		        System.out.println("Number of occurences of " + p + " is " + count);
		        }
		    }
		    
		    char pal= 'p';
		    pal++;
		    System.out.println(pal);
		    }
	
	}


