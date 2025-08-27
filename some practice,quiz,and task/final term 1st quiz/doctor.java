import java.lang.*;
public class doctor
{
	private String n;
	private String d;
	public patient pp[];
	
	public doctor(String n, String d,int size)
	{
		this.n=n;
		this.d=d;
		pp=new patient[size];
	}
public void	insertpp(patient p)
{
	int flag=0;
	for(int i=0;i<pp.length;i++)
	
		{
			if(pp[i]==null)
			{
			pp[i]=p;
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
	public void deletepp(patient p)
	{
		int flag=0;
		for(int i=0;i<pp.length;i++)
		{
			if(pp[i]==p)
			{
				pp[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("Not Deleted");
		}
	}
	public void info()
	{
		System.out.println("Name: "+n);
		System.out.println("Degree: "+d);
		
		for(int i=0;i<pp.length;i++)
		{
			if(pp[i]!=null)
			{
				pp[i].show();
			}
			else
			{
				System.out.println("empty");
			}
		}
	}
	
}