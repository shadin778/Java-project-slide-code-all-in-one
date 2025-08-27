import java.lang.*;

public class savingacc extends account
{
	private String name;
	private double rate;
	
	public savingacc()
	{
		System.out.println("Saving Empty Cons");
	}
	
	public savingacc(int number,double balance,String name,double rate)
	{
		super(number,balance);
		this.name=name;
		this.rate=rate;
		System.out.println("Saving Paramiterized cons");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setrate(double rate)
	{
		this.rate=rate;
	}
	public String getname()
	{
		return name;
	}
	public double getrate()
	{
		return rate;
	}
	public void details()
	{
		System.out.println("Saving Detail");
		super.details();
		System.out.println("name: "+name+"\n"+"Rate: "+rate);
	}
}