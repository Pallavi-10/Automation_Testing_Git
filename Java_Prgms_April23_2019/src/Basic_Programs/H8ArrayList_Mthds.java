package Basic_Programs;

import java.util.ArrayList;

public class H8ArrayList_Mthds
{

	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("hello");
		a.add(20);
		a.add('p');
		a.add(10.99);
		a.add(null);//null allowed in list
		a.add("Rahul");
		a.add("Rahul");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		System.out.println("");
		
		a.remove(3);//remove index based
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		System.out.println("");
		
		a.remove("Rahul");//remove object based (first element will be removed)
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		
		System.out.println("");
		a.set(0, "BYEE");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		System.out.println("");
		System.out.println("Provided arraylist id empty \"TRUE\" or \"FALSE\" ="+a.isEmpty()); //check if list is empty

		System.out.println("");
		a.add(2,"HELLO");//Added to specific index ,next element pushed
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		
		System.out.println("");
		
		System.out.println("Array list contains letter p = "+a.contains('p'));//Check if object present or not
		
		System.out.println("");
		
		System.out.println("Index of Rahul is = "+a.indexOf("Rahul"));//To get the index
		
		System.out.println("");
		
		a.clear();
		
		System.out.println("Arraylist cleared");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));//Ordered output and index based
		}
		
		
	}

}
