import java.lang.*;
public class grandf
{
	String name;
	
	
	public grandf()
	{
		System.out.println("empty for grand father");
	}
	public grandf(String name)
	{
		this.name=name;
		System.out.println("para for grand father");
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void show()
	{
		System.out.println("name of grand father: "+name);
	}
}