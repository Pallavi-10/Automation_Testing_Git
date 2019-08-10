package Basic_Programs;

class Acon1
{
	Acon1()
	{
		System.out.println("AAAAAAA");
	}
	Acon1(int n)
	{
		System.out.println("AAAA int");
	}
}


class Bcon1 extends Acon1
{
	Bcon1()
	{
		System.out.println("BBB");
	}
	Bcon1(int n)
	{
		System.out.println("BBBB int");
	}
}



public  class K4Practice_Constructor 
{

	public static void main(String[] args)
	{
		new Bcon1(8);
		
	}

}
