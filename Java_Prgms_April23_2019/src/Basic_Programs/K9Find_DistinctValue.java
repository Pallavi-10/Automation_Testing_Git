package Basic_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class K9Find_DistinctValue
{

		public static void main(String[] args) 
		{
			ArrayList<Integer> a =new ArrayList<Integer>();
			a.add(2);
			a.add(30);
			a.add(10);
			a.add(8);
			a.add(10);
			a.add(30);
			a.add(10);
			a.add(8);
			a.add(5);
			a.add(7);
			a.add(5);
			a.add(9);
			a.add(8);
			
			System.out.println(a);
			HashSet<Integer> b =new HashSet<Integer>();//doent take duplicates 
			
			for(int i=0;i<a.size();i++)
			{
				for(int j=i+1;j<a.size();j++)
				{
					if(a.get(i)==a.get(j))
					{
						b.add(a.get(i));
					}
				}
			}		
			System.out.println(b);
			
			a.removeAll(b);//remove all of collections of b from a 
			System.out.println(a);
		
			a.set(2, 64);//to replace
		System.out.println(a);
}
}
