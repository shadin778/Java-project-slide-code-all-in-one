import java.lang.*;
public class programmer
{
	private String n; //name
	private String e; //email
	public programmer()
	{
	}
	public programmer(String n, String e)
	{
		this.n=n;
		this.e=e;
	}
	public void setn(String n)
	{
		this.n=n;
	}
	public void sete(String e)
	{
		this.e=e;
	}
	public String getn()
	{
		return n;
	}
	public String gete()
	{
		return e=e;
	}
	public void dis()
	{
		System.out.println("NAME: "+n);
		System.out.println("EMAIL: "+e);
	}
}