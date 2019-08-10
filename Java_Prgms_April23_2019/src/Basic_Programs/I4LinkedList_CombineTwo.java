package Basic_Programs;

import java.util.LinkedList;

public class I4LinkedList_CombineTwo 
{

	public static void main(String[] args) 
	{
	
		LinkedList<Object> a = new LinkedList<Object>();
		a.add("NP");
		a.add(true);
		a.add("Pallavi");
		a.add(20.11);
		a.add("Nethra");
		
		LinkedList<Object> a1 = new LinkedList<Object>();
		a1.add("hello");
		a1.add(20);
		a1.add('p');
		
		a1.addAll(a);//Add complete list

		for(Object k:a1)
		{
			System.out.println(k);
		}

	}

}
