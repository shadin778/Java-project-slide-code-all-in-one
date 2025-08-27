import java.lang.*;
public class patient
{
	private String n;
	private String i;
	private long pq;
	private String a;
	
	public patient(String n, String i, long pq, String a)
	{
		this.n=n;
		this.i=i;
		this.pq=pq;
		this.a=a;
	}
	public void show()
	{
		System.out.println("patient details");
		System.out.println("Name: "+n +"\n"+"ID: "+i+"\n"+"Phone number: "+pq+"\n"+"Address :"+a);
	}
}