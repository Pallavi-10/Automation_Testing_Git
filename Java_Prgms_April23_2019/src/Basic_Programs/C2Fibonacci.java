package Basic_Programs;

public class C2Fibonacci {

	public static void main(String[] args) 
	{
		int i =0;
		int j =1;
		int k=0;
		System.out.println("0");
		System.out.println("1");
		for (int m =0;m<=10;m++)
		{
			k=i+j;
			i=j;
			j=k;
			System.out.println(k);
		}
		
		

	}

}
