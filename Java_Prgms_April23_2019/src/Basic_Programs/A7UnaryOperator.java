package Basic_Programs;

public class A7UnaryOperator {

	public static void main(String[] args)
	{
		int x =10;
		int y =20;
		
		System.out.println(y--);//prints 20 but y becomes 19 
		y--;//19 to 18 
		System.out.println(y);//18
		
		System.out.println(x++);//increment 10
		System.out.println(x);//11
		
		int z = y++;
		System.out.println(z);//20
		System.out.println(y);//21
		
		System.out.println(++x);//12
		
		
		int a =10;
		int c =30;
		System.out.println(a--);//decrement 10
		System.out.println(a);//9
		
		int d = c--;
		System.out.println(d);//30
		System.out.println(c);//29
		
		int p= 10;
		int q= 5;
		
		int s = ++p+--q+p---q+p++; //11+4+11-4+10
		System.out.println(s);//32
		System.out.println(p);//11
		System.out.println(q);//4

	}

}
