import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		account a1=new fixedacc(100,79999,"F1234",5);
		account a2=new fixedacc(500,566999,"F677",10);
		account s1=new savingacc(800,88888,"S1234",4.5);
		account s2=new savingacc(600,9999,"S453",3.5);
		customer c1=new customer("sakib",5);
		c1.insertacc(a1);
		c1.insertacc(a2);
		c1.insertacc(s1);
		c1.insertacc(s2);
		c1.deleteacc(s1);
		c1.show();
		
		
		
		
		
	}
	
	
}