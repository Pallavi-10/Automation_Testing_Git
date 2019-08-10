package Basic_Programs;

class A1
{
	 public void sum(int a,int b)//method member
	 {		 
		 System.out.println("Sum of two = "+(a+b));
	 }	 
}

class B1 extends A1
{
	 public void sub(int a,int b)
	 {
		 System.out.println("Sub of two = "+(a-b));
		 
	 }
}

class C1 extends A1
{
	 public void mul(int a,int b)//method member
	 {
		 
		 System.out.println("Mul of two = "+a*b);
	 }
	 
}

public class E7Hierarchical_Inheritance
{

	public static void main(String[] args) 
	{
		C1 oc = new C1();
		oc.sum(10,20);
		oc.mul(10,10);
		
		B1 ob= new B1();
		ob.sum(20,20);
		ob.sum(30,10);
		
		A1 oa = new A1();
		oa.sum(100,20);

	}

}
