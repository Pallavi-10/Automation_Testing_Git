package Basic_Programs;


 class parent1 
 {
	 int p=100;//variable member 
	 public void sum(int a,int b)//method member
	 {
		 
		 System.out.println(a+b);
	 }
	 
 }

 class child1 extends parent1
 {

	 public void sub(int a,int b)
	 {
		 System.out.println(a-b);
		 System.out.println(p);// can be accessed as it is extended
		 sum(10,10);//non static can call static & non static members
	 }
	 
 }
 public class E5SingleInheritance 
 {

 	public static void main(String[] args) 
 	{
 		child1 c = new child1();
 		c.sub(10,5);
 		c.sum(50,30);
 //Child object can call parent as it extended
 	}

 }
