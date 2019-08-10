package Basic_Programs;

import java.util.ListIterator;
import java.util.Vector;

public class I5Vector_Flow 
{

	public static void main(String[] args) 
	{
		Vector<Object> a = new Vector<Object>();
		a.add("NP");
		a.add(true);
		a.add(20.11);
		a.add("Nethra");
		
		for(int i =0;i<a.size();i++)
		{
			Object o=a.get(i);
			System.out.println(o);
		}
		System.out.println("");
		for(Object k:a)
		{
			System.out.println(k);
		}
		System.out.println("");
		a.add(3,"pallavi");
		
		for(Object k:a)
		{
			System.out.println(k);
		}
		System.out.println("");
		System.out.println("Forward");
		ListIterator<Object> l = a.listIterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		System.out.println("");
		
		System.out.println("Backward"); //to print backward same iterator of forward needs to be used
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
	}

}
