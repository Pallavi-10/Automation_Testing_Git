package Basic_Programs;

public class K7NumberPyramid_FIS
{

	public static void main(String[] args)
	{
		int n=4;
		
		for(int i=0;i<=n;i++)
		{
				
		for(int j =n;j>1;j--)
		{
			System.out.print(" ");
			
		}
		 int num=1;
		for(int j=0;j<=i;j++)
		{
			System.out.print(num);
			num++;
		}
		 
			for(int j=0;j<i;j++)
			{
				System.out.print(num);
				num++;
			}
		
		n--;
		System.out.println();
		
		}
	}

}
