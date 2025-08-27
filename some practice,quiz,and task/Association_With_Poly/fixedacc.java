import java.lang.*;
public class fixedacc extends account 
{
	private String name;
	private int year;
	
	public fixedacc()
	{
		System.out.println("Fixed empty cons");
	}
	public fixedacc(int number,double balance,String name,int year)
	{
		super(number,balance);
		this.name=name;
		this.year=year;
		System.out.println("Fixed paramiterized cons");
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setyear(int year)
	{
		this.year=year;
	}
	public String getname()
	{
		return name;
	}
	public int getyear()
	{
		return year;
	}
	public void details()
	{
		System.out.println("Fixed Detail");
		super.details();
		System.out.println("Name: "+name+"\n"+"Year: "+year);
	}
	
	
	
}