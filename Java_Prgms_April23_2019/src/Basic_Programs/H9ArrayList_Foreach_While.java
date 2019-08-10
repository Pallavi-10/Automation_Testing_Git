package Basic_Programs;

import java.util.ArrayList;

public class H9ArrayList_Foreach_While
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("hello");
		a.add(20);
		a.add('p');
		
		for(Object k:a) //For each
		{
			System.out.println(k);
		}
		System.out.println("");
		
		int i=0;
		while(i<a.size())//While loop
		{
			System.out.println(a.get(i));
			i++;
		}
		
		System.out.println(a);//Prints in array manner [hello, 20, p]
	}

}
