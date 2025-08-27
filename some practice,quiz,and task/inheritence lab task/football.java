import java.lang.*;
public class football extends game
{
	String typ;
	String du;
	
	public football()
	{
		System.out.println("1------FOOTBALL----1");
	}
	public football(String name, String id, String typ,String du)
	{
		super(name,id);
		this.typ=typ;
		this.du=du;
		System.out.println("2-----FOOTBALL-----2");
	}
	public void settyp(String typ)
	{
		this.typ=typ;
	}
	public void setdu(String du)
	{
		this.du=du;
	}
	public String gettyp()
	{
		return typ;
	}
	public String getdu()
	{
		return du;
	}
	public void display()
	{
		super.display();
		System.out.println("type: "+typ);
		System.out.println("duration: "+du +" Hr");
	}
}
