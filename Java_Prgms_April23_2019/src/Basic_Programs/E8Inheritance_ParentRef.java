package Basic_Programs;

class pal
{
	public void pal1()
	 {		 
		 System.out.println("Pall mnethod");
	 }	
}
class A3 extends pal
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

class B3 extends A3
{
	 public void sub(int a,int b)
	 {
		 System.out.println("Sub of two = "+(a-b));
		 
	 }
}

public class E8Inheritance_ParentRef
{

	public static void main(String[] args) 
	{
	
		A3 a =new B3();
		a.sum(100,100);
		//Parent Reference can access only parent specific members & the class mem if any extended
		a.mul(30, 2);
		a.pal1();
		//B3 b = new A3();//Child reference can not b given to parent	
	}
}
