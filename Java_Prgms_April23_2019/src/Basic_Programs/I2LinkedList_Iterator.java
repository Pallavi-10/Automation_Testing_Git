package Basic_Programs;
import java.util.Iterator;
import java.util.LinkedList;

public class I2LinkedList_Iterator 
{

	public static void main(String[] args) 
	{
		
		LinkedList<Object> a = new LinkedList<Object>();
		a.add("hello");
		a.add(20);
		a.add('p');
		
		Iterator<Object> o = a.iterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
		
	}

}
