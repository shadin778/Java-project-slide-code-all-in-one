import java.lang.*;
public class father extends grandf
{
	int age;
	
	
	public father()
	{
		System.out.println("empty for  father");
	}
	public father(String name,int age)
	{
		super (name);
		this.age=age;
		System.out.println("para for  father");
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
	public void show()
	{
		super.show();
		System.out.println("father's age: "+age);
	}
}