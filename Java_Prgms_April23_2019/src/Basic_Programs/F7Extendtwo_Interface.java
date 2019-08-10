package Basic_Programs;

interface inter5 
{
	abstract void TV(); //Interface can not be instantiated

}
interface inter6 extends inter5
{
	abstract void AC(); //Interface can not be instantiated

}

class pav implements inter6
{
	void parent()
	{
		System.out.println("Parent class");
	}

	@Override
	public void AC()
	{
		System.out.println("AC is LG brand");
		
	}

	@Override
	public void TV() 
	{
		System.out.println("TV is sony brand");
		
	}

}
public class F7Extendtwo_Interface 
{

	public static void main(String[] args) 
	{
		
		inter6 k = new pav();
		k.AC();
		k.TV();
	}

}
