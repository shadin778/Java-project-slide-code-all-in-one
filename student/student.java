import java.lang.*;
import java.util.*;

public class student
{
	String name;
    int age;
	String email;
	
	public student()
	{
		System.out.println("Empty constructor");
	}
	public student(String name,int age,String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		System.out.println("para constructor");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getemail()
	{
		return email;
	}
	
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("email "+email);
	}	
}