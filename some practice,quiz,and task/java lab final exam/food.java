import java.lang.*;
public class food
{
	String n;
	String i;
	public food()
	{
		System.out.println("empty for food");
	}
	public food(String n,String i)
	{
		this.n=n;
		this.i=i;
	}
	public void setn(String n)
	{
		this.n=n;
	}
	public void seti(String i)
	{
		this.i=i;
	}
	public String getn()
	{
		return n;
	}
	public String geti()
	{
		return i;
	}
	public void dis()
	{
		System.out.println("FOOD NAME: "+n);
		System.out.println("ID: "+i);
	}
}
	