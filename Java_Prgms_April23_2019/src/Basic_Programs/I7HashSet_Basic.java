package Basic_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class I7HashSet_Basic 
{

	public static void main(String[] args)
	{
		Set<Object> a = new HashSet<Object>();//unordered output // Parent reference to child class
		a.add("NP");
		a.add(true);
		a.add(20.11);
		a.add("Nethra");
		a.add(null);//1 o no Null allowed
		a.add("NP");//Duplicates removed
		a.add(null);
		
	for(Object k:a)//No index based allowed
	{
		System.out.println(k);//Unordered output
	}
	System.out.println("");
	
	Iterator<Object> i = a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}

}
