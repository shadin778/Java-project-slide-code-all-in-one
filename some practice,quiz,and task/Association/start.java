import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		account a1=new account(588,70000.0768);
		account a2=new account(600,7800000);
		customer c1=new customer("sakib",5);
		c1.insertacc(a1);
		c1.insertacc(a2);
		c1.show();
	}	
}