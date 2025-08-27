import java.lang.*;

public class stringdemo
{
	public static void main(String[] args)
	{
		String s1="BANGLADESH"; //b=0 a=1 n=2 g=3 l=4 a=5 d=6 e=7 s=8 h=9
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.concat(s3));
		System.out.println(s1);
		System.out.println(s1.substring(2,5));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf("A"));
		System.out.println(s1.indexOf("A"));
	  
	}
}