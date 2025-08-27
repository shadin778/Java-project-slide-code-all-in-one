import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		burger b1=new burger("burger","110",150,3);
		b1.dis();
		
		System.out.println("total: "+b1.total());
		System.out.println();
		pizza p1=new pizza("pizza","1025",200,2);
		p1.dis();
		System.out.println("total: "+p1.totall());
		
		/*food f[]=new food[2];
		f[0]=b1;
		f[1]=p1;
		for(int i=0;i<f.length;i++)
		{
			f[i].dis();
		}*/
	}
}