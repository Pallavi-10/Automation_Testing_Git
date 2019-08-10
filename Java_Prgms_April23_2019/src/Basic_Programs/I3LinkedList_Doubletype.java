package Basic_Programs;

import java.util.LinkedList;

public class I3LinkedList_Doubletype
{

	public static void main(String[] args)
	{
		LinkedList<Double> a = new LinkedList<Double>();
		a.add(99.99);
		a.add(20.11);
		a.add(100.927);
		a.add(20.11);
		a.add(108.4);
		
		for(double k:a)
		{
			System.out.println(k);
		}
		

	}

}
