package Basic_Programs;

public class C4nCr_Calculation
{

	public static void main(String[] args)
	{
	int n =8;
	int r =4;
	int Nfact=1;
	int Rfact=1;
	int NRfact=1;
	for(int i =n;i>0;i--)
	{
		Nfact=i*Nfact;
		
	}
	for(int i =r;i>0;i--)
	{
		Rfact=i*Rfact;
		
	}
	
	for(int i =n-r;i>0;i--)
	{
		NRfact=i*NRfact;
		
	}
	
	System.out.println(Nfact/(NRfact*Rfact));

	}

}
