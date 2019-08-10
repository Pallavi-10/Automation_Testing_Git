package Basic_Programs;

interface cowdog
{
	void drink();
	void eat();
	
}


class cow1 implements cowdog
{
	public void eat()
	{
		System.out.println("Dog eats chicken_net");
	}
	
	public void drink()
	{
		System.out.println("Cow drinks milk_net");
	}

}
class dog1 implements cowdog
{
	public void eat()
	{
		System.out.println("Dog eats chicken_net1");
	}
	
	public void drink()
	{
		System.out.println("Cow drinks milk_net1");
	}

}
class display1
{
	void display(cowdog o) //interface is used as a reference to call the method
	{
		o.drink();
		o.eat();
	}
}

public class F8ObjectrPass_Interface 
{

	public static void main(String[] args) 
	{
	
		cowdog n = new cow1();
		cowdog n1 = new dog1();
		display1 d = new display1();
		d.display(n);
		d.display(n1);
		
	}

}
