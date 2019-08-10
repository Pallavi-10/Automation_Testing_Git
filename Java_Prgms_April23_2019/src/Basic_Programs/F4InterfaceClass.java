package Basic_Programs;

interface inter1
{
	 void TV();//these methods are by default abstract & public

}

class inter_parent implements inter1
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


public class F4InterfaceClass 
{

	public static void main(String[] args) 
	{
		
		inter_parent p = new inter_parent();
		p.parent();
		p.TV();
	}

}
