import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		p1 p=new p1("apurbo","apurbo@gmail.com","22-48-6","task1","task2");
		//p.dis();
		p2 pp=new p2("enayet","enayet@gmail.com","22-48-6","task3","task4");
		//pp.dis();
		
		programmer pa[]=new programmer[2];
		pa[0]=p;
		pa[1]=pp;
		for(int i=0;i<pa.length;i++)
		{
			pa[i].dis();
		}
		
	}
}