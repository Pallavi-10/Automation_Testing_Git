package Basic_Programs;

class Acon2
{
	Acon2()
	{
		System.out.println("AAAAAAA cons");//1
	}
	void bujji(int n)
	{
		System.out.println("AAAA int"+n);//3
	}
}


class Bcon2 extends Acon2
{
	Bcon2()
	{
		System.out.println("BBB cons");//2
	}
	void Baby(int n)
	{
		super.bujji(80);
		System.out.println("BBBB int"+n);//4
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
