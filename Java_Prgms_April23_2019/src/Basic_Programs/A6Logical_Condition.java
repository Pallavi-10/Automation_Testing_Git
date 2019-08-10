package Basic_Programs;

public class A6Logical_Condition {

	public static void main(String[] args) 
	{
		int a =10;
		int b =20;
		int c =30;
		int d =50;
		
		if(a<b && a<c)
		{
			System.out.println("A is smaller that other B & C");
			
		}
		
		 if(b<c || c>d)
		
		{
			System.out.println("Using Or condition");
		}
		
		if(c!=b)
		{
			System.out.println("c is not equal to b");
		}
		else
		{
			System.out.println("c is equal t o B");
		}

	}

}
