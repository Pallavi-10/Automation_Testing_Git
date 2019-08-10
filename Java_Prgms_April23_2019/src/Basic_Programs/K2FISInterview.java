package Basic_Programs;


class AP
{
	AP()
	{
		System.out.println("A");
	}
	
	void m1()
	{
		System.out.println("AA");
	}
	
}

class BP extends AP
{
	BP()
	{
		System.out.println("B");
	}
	void m1()
	{
		System.out.println("BB");
	}
}





public class K2FISInterview {

	public static void main(String[] args) {
		 AP a = new AP();
		 BP b = new BP();
		 
		 a.m1();
		 b.m1();

	}

}
