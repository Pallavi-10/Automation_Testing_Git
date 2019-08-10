package Basic_Programs;

public class K3Pyramid_FIS
{

	public static void main(String[] args) 
	{
		
		int n =5;
		int num;
		
		for(int i=0;i<n;i++)
		{
		
			for(int j=n;j>1;j--)
			{
				
			System.out.print(" ");
			
			}
			num=1;
			for(int j=0;j<=i;j++)
			{
			
				System.out.print(num+" ");
				
				num++;
			}
			for(int j=n-2;j>1;j--)
			{
				System.out.print(" ");
			}
			n--;
			System.out.println();	
		}
		
		
		

	}

}
