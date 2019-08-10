package Basic_Programs;

import java.util.Vector;

class student
{
	int rollno;
	String name;
}

public class I6Vector_ClassObjectPass
{

	public static void main(String[] args)
	{
	
		Vector<student> a = new Vector<student>();
		
		student s = new student();
		s.rollno=63;
		s.name="pallavi";
		
		student p = new student();
		p.rollno=64;
		p.name="Pavan";
		
		a.add(s);
		a.add(p);
		
		for(student k:a)
		{
			System.out.println(k.name);
			System.out.println(k.rollno);
			
		}
		
	}

}
