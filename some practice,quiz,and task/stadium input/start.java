import java.lang.*;
import java.util.*;

public class start
{



public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter stadium name: ");
		String stadium_name=ob.next();
		System.out.print("Enter stadium location: ");
		String location=ob.next();
		System.out.print("Enter stadium id: ");
		long id=ob.nextLong();
		System.out.print("Enter stadium capacity: ");
		long capacity=ob.nextLong();
		System.out.print("Feild length: ");
		double feild_length=ob.nextDouble();
		System.out.print("Feild width: ");
		double feild_width=ob.nextDouble();
		
		
		System.out.println("-----STADIUM INFORMATION-----");
		stadium b1=new stadium(stadium_name,location,id,capacity,feild_length,feild_width);
		b1.showinfo();
		
		stadium b2=new stadium();
		System.out.print("Enter stadium name: ");
		b2.setstadium_name(ob.next());
		System.out.print("Enter stadium location: ");
		b2.setlocation(ob.next());
		System.out.print("Enter stadium id: ");
		b2.setid(ob.nextLong());
		System.out.print("Enter stadium capacity: ");
		b2.setcapacity(ob.nextLong());
		System.out.print("Enter feild length: ");
		b2.setfeild_length(ob.nextDouble());
		System.out.print("Enter feild width: ");
		b2.setfeild_width(ob.nextDouble());
		b2.showinfo();
		
		
		
		
	}
}