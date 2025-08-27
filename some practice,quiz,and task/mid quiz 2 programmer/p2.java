import java.lang.*;
public class p2 extends programmer
{
	private String iid;
	private String t1; //ae_task
	private String t2; //ce_task

 public p2()
 {
 }
 public p2(String n, String e, String iid, String t1, String t2)
 {
	 super(n,e);
	 this.iid=iid;
	 this.t1=t1;
	 this.t2=t2;
 }
 public void setiid(String iid)
 {
	 this.iid=iid;
 }
 public void sett1(String t1)
 {
	 this.t1=t1;
 }
 public void sett2(String t2)
 {
	 this.t2=t2;
 }
 public String getiid()
 {
	 return iid;
 }
 public String gett1()
 {
	 return t1;
 }
 public String gett2()
 {
	 return t2;
 }
 public void dis()
 {
	 super.dis();
	 System.out.println("ID: "+iid);
		System.out.println("TASK 3: "+t1);
		System.out.println("TASK 4: "+t2);
 }
}