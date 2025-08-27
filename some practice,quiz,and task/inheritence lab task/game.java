import java.lang.*;
public class game
{
	String name;
	String id;
	
	public game()
	{
		System.out.println("empty for game");
	}
	public game(String name, String id)
	{
		this.name=name;
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public String getid()
	{
		return id;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
	}
}