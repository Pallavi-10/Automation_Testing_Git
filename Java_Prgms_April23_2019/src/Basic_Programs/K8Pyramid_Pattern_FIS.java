package Basic_Programs;

public class K8Pyramid_Pattern_FIS {

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
		 	num=num-2;//change to num=num-1 for different output
		 	if(i!=0)
		 	{
			for(int j=0;j<i;j++)
			{
				System.out.print(num);
				num--;
			}
		 	}
		n--;
		System.out.println();
		
		}

	}

}
