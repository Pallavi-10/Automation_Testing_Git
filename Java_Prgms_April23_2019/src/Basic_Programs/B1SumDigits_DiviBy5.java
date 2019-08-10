package Basic_Programs;

public class B1SumDigits_DiviBy5 {

	public static void main(String[] args)
	{
		int j =0;

		for(int i =1;i<=100;i++)
		{
			if(i%5==0)
			{
				j=j+i;
			}
			
		}
		System.out.println(j);
	}


	}

