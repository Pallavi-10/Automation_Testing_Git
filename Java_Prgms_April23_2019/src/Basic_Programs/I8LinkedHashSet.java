package Basic_Programs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class I8LinkedHashSet 
{

	public static void main(String[] args)
	{
		Set<Object> a = new LinkedHashSet<Object>();//unordered output // Parent reference to child class
		a.add("NP");
		a.add(true);
		a.add(20.11);
		a.add("Nethra");
		a.add(null);//Null allowed
		a.add("NP");//Duplicates removed
		a.add(null);
		
	for(Object k:a)//No index based allowed
	{
		System.out.println(k);//Ordered Output
	}
	System.out.println("");
	
	Iterator<Object> i = a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}

}
