import java.lang.*;
public class burger extends food
{
	double p;
	double q;
	public burger()
	{
		System.out.println("empty for burger");
	}
	public burger(String n, String i,double p, double q)
	{
		super(n,i);
		this.p=p;
		this.q=q;
	}
	public void setp(double p)
	{
		this.p=p;
	}
	public void setq(double q)
	{
		this.q=q;
	}
	public double getp()
	{
		return p;
	}
	public double getq()
	{
		return q;
	}
	public double total()
	{
		double total=q*p;
		
		return total;
	}
	public void dis()
	{
		super.dis();
		System.out.println("PRICe: "+p);
		System.out.println("QUANTITY: "+q);
	}
}
		