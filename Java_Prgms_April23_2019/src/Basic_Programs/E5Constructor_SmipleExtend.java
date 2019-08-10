package Basic_Programs;

class AA
{
	AA()
	{
		System.out.println("AA conatructor");
	}
}

class BB extends AA
{
	BB()
	{
		System.out.println("BB Contracutor");
	}
}


class CC extends BB
{
	CC()
	{
		System.out.println("CC Construtor");
	}
	
	void msg() {
		System.out.println("Hello");
	}
}


public class E5Constructor_SmipleExtend extends CC
{

	E5Constructor_SmipleExtend()
	{
		System.out.println("Main class constructor");
	}
	
	public static void main(String[] args) 
	{
		
		CC o = new CC(); //constructor will be called only with new key word
		o.msg();
		
		//on extend parent constructor will be called first
	}

}
