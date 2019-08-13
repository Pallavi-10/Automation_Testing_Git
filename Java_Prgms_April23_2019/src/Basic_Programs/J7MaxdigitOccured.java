package Basic_Programs;

import java.util.ArrayList;

public class J7MaxdigitOccured
{

	public static void main(String[] args) 
	{
		int a[] = {1,3,1,4,9,4,1,4,1,3,20,9,6,1};
		int max=0;
		ArrayList<Integer> o = new ArrayList<Integer>();
		
		int p=0;
		int q=1;
		for(int m=0;m<a.length;m++)
		{
			if(a[m]>max)
			{
				max=a[m];
			}
		}
		
		System.out.println("Max digit in the array is "+max);
		
		 int count;
		    
		    for (int i=0;i<max+1;i++) 
		    {
		        count = 0;
		        for (int j = 0; j < a.length; j++) 
		        {
		            if (i==a[j])
		            {
		                count++;
		            }
		        }
		        
		        if(count>0)
		        {
		        	
		        	//o.clear();
		        		o.add(p,i);
		        		o.add(q,count);
		        		p=p+2;
		        		q=q+2;
		        }

	}
		    for(int pal:o)
			{
				System.out.print(pal);
			}
			
		    
}
}
