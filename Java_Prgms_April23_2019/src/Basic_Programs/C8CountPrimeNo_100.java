package Basic_Programs;

public class C8CountPrimeNo_100 
{
	static boolean p=false;
	static int count =0;
	public static void main(String[] args) 
	{
		
		for(int i=2;i<=100;i++)
		{
			for(int j =2;j<i;j++)
			{
				if(i%j==0)
				{
					p=true;
					break;
				}
				else
				{
					p=false;
				}
			}
			
			if(p==false) 
			{
				count++;
			}
		}
		System.out.println("total number of prime from 1-100 = "+count);

	}

}
