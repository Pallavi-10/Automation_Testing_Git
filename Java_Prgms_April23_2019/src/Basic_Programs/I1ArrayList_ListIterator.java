package Basic_Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class I1ArrayList_ListIterator
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("hello");
		a.add(20);
		a.add('p');
		
		ListIterator<Object> l= a.listIterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("");
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}

		l.remove();
		
		System.out.println("After remove");
	
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}

}
