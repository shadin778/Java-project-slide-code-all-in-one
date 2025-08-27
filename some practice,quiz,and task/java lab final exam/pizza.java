import java.lang.*;
public class pizza extends food
{
	double pp;
	double qq;
	
	public pizza()
	{
		System.out.println("empty for pizza");
	}
	public pizza(String n, String i,double pp, double qq)
	{
		super(n,i);
		this.pp=pp;
		this.qq=qq;
	}
	public void setpp(double pp)
	{
		this.pp=pp;
	}
	public void setqq(double qq)
	{
		this.qq=qq;
	}
	public double getpp()
	{
		return pp;
	}
	public double getqq()
	{
		return qq;
	}
	public double totall()
	{
		double totall;
		totall=qq*pp;
		return totall;
	}
	public void dis()
	{
		super.dis();
		System.out.println("PRICE: "+pp);
		System.out.println("QUANTITY: "+qq);
	}
}
		