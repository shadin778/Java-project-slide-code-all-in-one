import java.lang.*;
public class customer
{
	private String name;
	private account acc[];
	public customer()
	{
		System.out.println("Customer empty constructor");
	}
	public customer(String name,int size)
	{
		this.name=name;
		acc=new account[size];
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void insertacc(account a)
	{
		int flag=0;
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==null)
			{
			acc[i]=a;
			flag=1;
			break;
			}
		}
		if(flag==1)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
	}
	public void show()
	{
		System.out.println("Name: "+name);
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]!=null)
			{
				acc[i].details();
			}
			else{
				System.out.println("empty");
			}
		}
	}
	
}