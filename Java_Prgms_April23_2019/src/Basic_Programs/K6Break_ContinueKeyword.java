package Basic_Programs;

public class K6Break_ContinueKeyword {

	public static void main(String[] args)
	
	{
		int b=(int) 9.1;
		double a =9.933333333;
		System.out.println(a);
		System.out.println(b);
		
		int counter;
		for (counter = 0; counter<=10; counter++)
		{
		   System.out.print(counter);
		if (counter == 4)// once 4 is encountered loop will break
		{

		    break;
		}

		}
		System.out.println();
		for (counter = 0; counter < 10; counter++)
		{
		    System.out.println(counter);

		if (counter == 4) 
		{

		    continue;// when counter is 4 next line will not executed it goes to loop instead
		    //so below line will not get printed for 4
		}
		System.out.println("This will not get printed when counter is 4");
		}
	}
}

