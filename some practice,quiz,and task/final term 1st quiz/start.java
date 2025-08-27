import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		patient p1=new patient("apurbo","110-120",1728,"pabna");
		patient p2=new patient("belayet","110-121",1997,"santhia");
		doctor c1=new doctor("Yousube ali","MBBS,BCS",5);
		
		c1.insertpp(p1);
		c1.insertpp(p2);
		c1.deletepp(p2);
		c1.info();
	}	
}