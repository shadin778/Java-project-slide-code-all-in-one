import java.lang.*;
public class p1 extends programmer
{
	private String id;
	private String t; //ac_task
	private String tt; //ce_task

 public p1()
 {
 }
 public p1(String n, String e, String id, String t, String tt)
 {
	 super(n,e);
	 this.id=id;
	 this.t=t;
	 this.tt=tt;
 }
 public void setid(String id)
 {
	 this.id=id;
 }
 public void sett(String t)
 {
	 this.t=t;
 }
 public void settt(String tt)
 {
	 this.tt=tt;
 }
 public String getid()
 {
	 return id;
 }
 public String gett()
 {
	 return t;
 }
 public String gettt()
 {
	 return tt;
 }
 public void dis()
 {
	 super.dis();
	 System.out.println("ID: "+id);
		System.out.println("TASK 1: "+t);
		System.out.println("TASK 2: "+tt);
 }
}