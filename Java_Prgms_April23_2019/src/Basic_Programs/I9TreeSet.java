package Basic_Programs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class I9TreeSet
{

	public static void main(String[] args) 
	{
		Set<Double> a = new TreeSet<Double>();//unordered output // Parent reference to child class
		//Tree is homogeneous
		a.add(100.9);
		a.add(20.11);
		a.add(99.82);
		a.add(99.1);
		a.add(10.55);//Duplicates removed
		a.add(20.11);
		
	for(Object k:a)//No index based allowed
	{
		System.out.println(k);//Sorted Output
	}
	System.out.println("");
	
	Iterator<Double> i = a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

	}

}
