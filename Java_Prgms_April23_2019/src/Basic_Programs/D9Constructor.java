package Basic_Programs;

public class D9Constructor 
{
	 int a;
    //constructor can not n static final or abstract
   //Constructor can not be overridden because its not a member of class to inherit
 //It is always called by NEW keyword
	D9Constructor()//same name as class name. no return type
	{
		
		System.out.println("I am a Constructor "+a);
	}
	
	
	public static void main(String[] args) 
	{
		
		D9Constructor o = new D9Constructor();
		// on the time of object creation constructor will be called
		o.a=100;// global and instance variable so one for object changing will not affect the value of a
		new D9Constructor();
	}

}
