package Basic_Programs;

import java.util.ArrayList;

public class H7Basic_Arraylist_Collections 
{

	public static void main(String[] args)
	{
	
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("hello");
		a.add(20);
		a.add('p');
		a.add(10.99);
		a.add(null);//null allowed in list
		a.add('p');//duplicates allowed
		
		for(int i =0;i<a.size();i++)
		{
			Object o = a.get(i);
			System.out.println(o);//Ordered output and index based
		}
	}

}
