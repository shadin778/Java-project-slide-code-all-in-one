import java.lang.*;
public class son extends father
{
	String id;
	
	
	public son()
	{
		System.out.println("empty for  son");
	}
	public son(String name, int age, String id)
	{
		super (name,age);
		this.id=id;
		System.out.println("para for  son");
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public String getid()
	{
		return id;
	}
	public void show()
	{
		super.show();
		System.out.println("son's id: "+id);
	}
}