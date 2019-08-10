package Basic_Programs;

interface cow
{
void eat();
	
}
interface dog
{
	void eat();
}

class animal implements cow,dog
{
	public void eat() 
	{
		System.out.println("Eating");
		
	}
	
}
public class G1Interface_SameMthd 
{
	public static void main(String[] args) 
	{
		dog d = new animal();
		d.eat();
		animal a = new animal();
		a.eat();
	}

}
