package Basic_Programs;
class A
{
	 public void sum(int a,int b)//method member
	 {
		 
		 System.out.println("Sum of two = "+(a+b));
	 }
	 
}

class B extends A
{

	 public void sub(int a,int b)
	 {
		 System.out.println("Sub of two = "+(a-b));
		 
	 }
}
class C extends B
{
	 public void mul(int a,int b)//method member
	 {
		 
		 System.out.println("Mul of two = "+a*b);
	 }
	 
}

public class E6Multilevel_Inheritance 
{

	public static void main(String[] args) 
	{
		C oc = new C();
		oc.sum(10,20);
		oc.sub(50,40);
		oc.mul(10,10);
		
		B ob= new B();
		ob.sum(20,20);
		ob.sum(30,10);
		
		A oa = new A();
		oa.sum(100,20);
	}

}