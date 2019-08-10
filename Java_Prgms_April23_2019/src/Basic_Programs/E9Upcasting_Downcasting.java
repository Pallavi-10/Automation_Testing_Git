package Basic_Programs;

public class E9Upcasting_Downcasting 
{

	public static void main(String[] args) 
	{
		A4 a =new B4();//up casting
		B4 b = (B4)a; //Down casting
		
		b.sub(20,10);
		b.sum(10,30);
		b.mul(40,5);
	}
}
class A4
{
	 public void sum(int a,int b)//method member
	 {		 
		 System.out.println("Sum of two = "+(a+b));
	 }	 
	 public void mul(int a,int b)//method member
	 {
		 
		 System.out.println("Mul of two = "+a*b);
	 }
	 
}

class B4 extends A4
{
	 public void sub(int a,int b)
	 {
		 System.out.println("Sub of two = "+(a-b));
		 
	 }
}