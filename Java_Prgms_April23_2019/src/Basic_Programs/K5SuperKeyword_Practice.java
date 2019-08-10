package Basic_Programs;

class Acon2
{
	Acon2()
	{
		System.out.println("AAAAAAA cons");
	}
	void bujji(int n)
	{
		System.out.println("AAAA int"+n);
	}
}


class Bcon2 extends Acon2
{
	Bcon2()
	{
		System.out.println("BBB cons");
	}
	void Baby(int n)
	{
		super.bujji(80);
		System.out.println("BBBB int"+n);
	}
}


public class K5SuperKeyword_Practice 
{

	public static void main(String[] args)
	{
		Bcon2 o = new Bcon2();
		o.Baby(7);

	}

}
