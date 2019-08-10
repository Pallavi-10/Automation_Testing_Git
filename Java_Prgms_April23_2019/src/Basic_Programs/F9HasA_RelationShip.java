package Basic_Programs;

class mobile
{
	
	void docall()
	{
		System.out.println("Use mobile to call");
	}
}

class person
{
	mobile m = new mobile(); // object inside a class
	void takemobile()
	{
		System.out.println("Get mobile to call");
	}
}


public class F9HasA_RelationShip 
{

	public static void main(String[] args) 
	{
		person p = new person();
		p.takemobile();
		p.m.docall(); // has a relationship where object is user through object to call a method of a class
	

	}

}
