import java.lang.*;
import java.util.*;
public class startt
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=s.next();
		System.out.print("Enter id: ");
		String id=s.next();
		System.out.print("Enter type: ");
		String type=s.next();
		System.out.print("Enter duration: ");
		String d=s.next();
		
		cricket c1=new cricket(name, id, type,d);
		//c1.display();
		
		cricket c2=new cricket();
		System.out.print("Enter name: ");
		c2.setname(s.next());
		System.out.print("Enter id: ");
		c2.setid(s.next());
		System.out.print("Enter type: ");
		c2.settype(s.next());
		System.out.print("Enter duration: ");
		c2.setd(s.next());
		//c2.display();
		
		
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name1=ss.next();
		System.out.print("Enter id: ");
		String id1=ss.next();
		System.out.print("Enter type: ");
		String typ=ss.next();
		System.out.print("Enter duration: ");
		String du=ss.next();
		
		
		football f1=new football(name1,id1,type,d);
		//f1.display();
		
		System.out.println();
		football f2=new football();
		System.out.print("Enter name: ");
		f2.setname(ss.next());
		System.out.print("Enter id: ");
		f2.setid(ss.next());
		System.out.print("Enter type: ");
		f2.settyp(ss.next());
		System.out.print("Enter duration: ");
		f2.setdu(ss.next());
		//f2.display();
		
		game g[]=new game[7];
		g[0]=c1;
		g[3]=c2;
		g[4]=f1;
		g[5]=f2;
		for (int i=0;i<g.length;i++)
		{
			if(g[i]!=null)
			{
				g[i].display();
				System.out.println();
			}
			else
			{
				System.out.println("empty index");
			}
		}
		
	}
}