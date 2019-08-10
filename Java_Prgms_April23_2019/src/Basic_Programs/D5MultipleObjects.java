package Basic_Programs;

public class D5MultipleObjects
{

	public static void main(String[] args) 
	{
		int n=10;
		int m =20;
		int p =80;
		D5MultipleObjects o = new D5MultipleObjects(); //first object for same class
		
		int value=	o.sum(m,n);
		System.out.println("Sum called by first object = "+ value);
		
		Message(); //static method called twice
		
		D5MultipleObjects o1 = new D5MultipleObjects();//second object for same class
		System.out.println("Sum called by second object = "+o1.sum(n,p));
		
		Message();
		
	}
	
	public int sum(int a,int b) 
	{
		return a+b;
		
	}

	static void Message()
	{
		System.out.println("I am a static message");
	}
}
