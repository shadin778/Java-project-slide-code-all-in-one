import java.lang.*;
public class vehicle
{
		String vt;
	    String bn;
		String mn;
		long vi;
		String ln;
		long p;
		public vehicle()
		{
			System.out.println("--------VEHICLE-1-----------");
		}
		public vehicle(String vt,String bn,String mn,long vi,String ln,long p)
		{
			this.vt=vt;
			this.bn=bn;
			this.mn=mn;
			this.vi=vi;
			this.ln=ln;
			this.p=p;
			System.out.println("-----------VEHICLE-2-----------");
		}
		public void setvt(String vt)
		{
			this.vt=vt;
		}
		public void setbn(String bn)
		{
			this.bn=bn;
		}
		public void setmn(String mn)
		{
			this.mn=mn;
		}
		public void setvi(long vi)
		{
			this.vi=vi;
		}
		public void setln(String ln)
		{
			this.ln=ln;
		}
		public void setp(long p)
		{
			this.p=p;
		}
		public String getvt()
	{
		return vt;
	}
	public String getbn()
	{
		return bn;
	}
	public String getmn()
	{
		return mn;
	}
	public long getvi()
	{
		return vi;
	}
	public String getln()
	{
		return ln;
	}
	public long getp()
	{
		return p;
	}
	public void showinfo()
	{
		System.out.println("VEHICLE TYPE :"+vt);
		System.out.println("BRAND NAME :"+bn);
		System.out.println("MODEL :"+mn);
		System.out.println("ID :"+vi);
		System.out.println("LICENCE NUMBER :"+ln);
		System.out.println("PRICE :"+p+"TAKA");
	}
	public static void main(String[]args)
	{
		vehicle v1=new vehicle("Sedan","Rolls-Royce Motor Cars Limited","Phantom VII",0123456,"TN065",44940000);
		v1.showinfo();
		vehicle v2=new vehicle();
		v2.setvt("SUV");
		v2.setbn("Range Rover");
		v2.setmn("Land Rover");
		v2.setvi(110120);
		v2.setln("TS3451");
		v2.setp(23500000);
		v2.showinfo();
	}
}