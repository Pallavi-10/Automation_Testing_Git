package Basic_Programs;

public class E3ConstClass_Extended
{
	E3ConstClass_Extended()
	{
		System.out.println("Parent constructor");
	}

	public static void main(String[] args)
	{
		Demo d = new Demo(); 
	//Parent constructor gets executed first as it is extended then child class constructor
		d.display("Hello");
	}
}

class Demo extends E3ConstClass_Extended
{
	Demo()
	{
		System.out.println("Child constructor");
	}
	void display(String h)
	{
		System.out.println("In child class-"+h);
	}
	
}
