import java.lang.*;
import java.util.*;

public class start
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String n=obj.next();
		
		System.out.println("Enter your age: ");
		int a=obj.nextInt();
		
		System.out.println("Enter your email: ");
		String e=obj.next();
		
		student s1=new student(n,a,e);
		s1.display();
		
		student s2=new student();
		System.out.println("Enter your Name: ");
		s2.setname(obj.next());
		
		System.out.println("Enter your age: ");
		s2.setage(obj.nextInt());
		
		System.out.println("Enter your email: ");
		s2.setemail(obj.next());
		
		s2.display();
		
		
		
	}
}