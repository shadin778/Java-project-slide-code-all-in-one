import java.lang.*;

public class account 
{
     String name;
     int id;
     double balance;

    public account(String name, int id, double balance) 
	{
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void showinfo() {
        System.out.println("Bank Name: " + name);
        System.out.println("Bank ID: " + id);
        System.out.println("Balance: " + balance+"TK");
		System.out.println();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance+"TK");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance+"TK");
        } 
		else
		{
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void transfermoney(account another, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            another.balance += amount;
            System.out.println("Transfer successful: "+amount+"TK");
            System.out.println("New balance for " + name + ": " + balance+"TK");
            System.out.println("New balance for " + another.name + ": " + another.balance+"TK");
			System.out.println();
        } 
		else
		{
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    public static void main(String[] args) {
        account a1 = new account("BANK APURBO", 1001, 5000);
        account a2 = new account("BANK ENAYET", 2002, 10000);

        System.out.println("-----Initial account info-----");
        a1.showinfo();
        a2.showinfo();

        a1.deposit(1000);
        a2.withdraw(500);

        System.out.println("-----Updated account info-----");
        a1.showinfo();
        a2.showinfo();

        a1.transfermoney(a2, 1000);

        System.out.println("-----Final account info:-----");
        a1.showinfo();
        a2.showinfo();
    }
}
