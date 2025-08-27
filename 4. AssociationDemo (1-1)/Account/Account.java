import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private Date openingDate;
	
	public Account()
	{
		System.out.println("Empty Account");
	}
	public Account(int accountNumber, String accountHolderName, double balance, Date openingDate)
	{
		System.out.println("Parameterized Account");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.openingDate = openingDate;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setOpeningDate(Date openingDate){
		this.openingDate=openingDate;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	public Date getOpeningDate(){return openingDate;}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Opening Date: "+openingDate.getDate());
	}	
}