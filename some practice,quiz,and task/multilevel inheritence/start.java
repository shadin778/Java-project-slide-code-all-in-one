import java.lang.*;
import java.util.*;
public class start
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER NAME: ");
		String name=s.next();
		System.out.print("ENTER AGE: ");
		int age=s.nextInt();
		System.out.print("ENTER ID: ");
		String id=s.next();
		
		
		son s1=new son(name,age,id);
		//s1.show();
		son s2=new son();
		System.out.print("ENTER NAME: ");
		s2.setname(s.next());
		System.out.print("ENTER AGE: ");
		s2.setage(s.nextInt());
		System.out.print("ENTER ID: ");
		s2.setid(s.next());
		//s2.show();
		
		son x[]=new son[5];
		x[0]=s1;
		x[4]=s2;
		for (int i=0; i<x.length; i++)
		{
			if (x[i]!=null)
			{
				x[i].show();
			}
			else
			{
				System.out.println("EMPTY INDEX");
			}
		}
	}
}