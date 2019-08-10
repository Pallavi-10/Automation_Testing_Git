package Basic_Programs;

interface inter2 
{
	abstract void TV(); //Interface can not be instantiated

}

class inter_Child implements inter2
{
	void parent()
	{
		System.out.println("Parent class");
	}

	@Override
	public void TV()
	{
		System.out.println("TV brand is LG");
		
	}
	
}

class inter_Child2 implements inter2
{
	void parent()
	{
		System.out.println("Parent class");
	}

	@Override
	public void TV() 
	{
		System.out.println("TV brand is Sony");
		
	}
	
}

public class F5Interfc_MutiClassImpli 
{

	public static void main(String[] args) 
	{
		inter2 o = new inter_Child2(); //interface reference to its child
		o.TV();
		
		inter2 o1 = new inter_Child();//Up  casting
		inter_Child c =(inter_Child)o1; //down casting to access child members
		o1.TV();
		c.parent();
	}

}
