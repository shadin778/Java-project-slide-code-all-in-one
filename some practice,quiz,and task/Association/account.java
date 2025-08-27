import java.lang.*;
public class account
{
	private int number;
	private double balance;
	public account()
	{
		System.out.println("Account empty constructor");
	}
	public account(int number,double balance)
	{
		System.out.println("Account para constructor");
		this.number=number;
		this.balance=balance;
	}
	public void setnumber(int number)
	{
		this.number=number;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public int getnumber()
	{
		return number;
	}
	public double getbalance()
	{
		return balance;
	}
	public void details()
	{
		System.out.println("Number: "+number+"\n"+"balance: "+balance);
	}
}