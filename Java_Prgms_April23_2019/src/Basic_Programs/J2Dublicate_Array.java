package Basic_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class J2Dublicate_Array 
{

	public static void main(String[] args) 
	{
		int [] a = {10,3,20,5,10,6,3,1,6,3};
		ArrayList<Integer> b = new ArrayList<Integer>();
		int n = a.length;
		
		for(int i =0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				
				if(a[i]==a[j])
				{
					if(!b.contains(a[i]))
					{
						b.add(a[i]);
					}
				}
			}			
		}
		
		for(int m=0;m<b.size();m++)
		{
			Collections.sort(b);
			System.out.println(b.get(m));
			
		}

		
	}
	
}
