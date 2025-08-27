import java.lang.*;
import java.util.*;
public class end
{



public static void main(String[]args)
	{
		Scanner t=new Scanner(System.in);
		System.out.print("Enter team id: ");
		long id=t.nextLong();
		System.out.print("Enter team name: ");
		String tn=t.next();
		System.out.print("Enter team type: ");
		String tt=t.next();
		System.out.print("Enter player number: ");
		int pn=t.nextInt(); 
		System.out.print("Enter team owner name: ");
		String to=t.next();
		
		
		
		team t1=new team(id,tn,tt,pn,to);
		t1.show();
		team t2=new team();
		System.out.print("Enter team id: ");
		t2.setid(t.nextLong());
		System.out.print("Enter team name: ");
		t2.settn(t.next());
		System.out.print("Enter team type: ");
		t2.settt(t.next());
		System.out.print("Enter player number: ");
		t2.setpn(t.nextInt());
		System.out.print("Enter team owner name: ");
		t2.setto(t.next());
		t2.show();
	}
}