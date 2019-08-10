package Basic_Programs;

public class C1Factorial_6 
{

	public static void main(String[] args) 
	{
		int n =4;
		int fact =1;
		for (int i=n;i>=1;i--)
		{
			//int j = 0;// becomes block specific which can not be accesed 
			fact= i*fact;
			
		}
		System.out.println(fact);
	}

}
