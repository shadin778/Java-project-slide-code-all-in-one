import java.lang.*;
public class cricket extends game
{
	String type;
	String d;
	
	public cricket()
	{
		System.out.println("1-----CRICKET-----1");
	}
	public cricket(String name, String id, String type,String d)
	{
		super(name,id);
		this.type=type;
		this.d=d;
		System.out.println("2-----CRICKET-----2");
	}
	public void settype(String type)
	{
		this.type=type;
	}
	public void setd(String d)
	{
		this.d=d;
	}
	public String gettype()
	{
		return type;
	}
	public String getd()
	{
		return d;
	}
	public void display()
	{
		super.display();
		System.out.println("type: "+type);
		System.out.println("duration: "+d+" Hr");
	}
}