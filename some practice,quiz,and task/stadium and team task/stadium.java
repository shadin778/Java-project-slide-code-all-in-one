import java.lang.*;
public class stadium
{
	String stadium_name;
	String location;
	long id;
	long capacity;
    double feild_length;
	double feild_width;
	public stadium()
	{
		System.out.println("CRICKET STADIUM");
	}
	public stadium(String stadium_name,String location,long id,long capacity,double feild_length,double feild_width)
	{
		this.stadium_name=stadium_name;
		this.location=location;
		this.id=id;
		this.capacity=capacity;
		this.feild_length=feild_length;
		this.feild_width=feild_width;
		System.out.println("FOOTBALL STADIUM");
	}
	public void setstadium_name(String stadium_name)
	{
		this.stadium_name=stadium_name;
	}
	public void setlocation(String location)
	{
		this.location=location;
	}
	public void setid(long id)
	{
		this.id=id;
	}
	public void setcapacity(long capacity)
	{
		this.capacity=capacity;
	}
	public void setfeild_length(double feild_length)
	{
		this.feild_length=feild_length;
	}
	public void setfeild_width(double feild_width)
	{
		this.feild_width=feild_width;
	}
	public String getstadium_name()
	{
		return stadium_name;
	}
	public String getlocation()
	{
		return location;
	}
	public long getid()
	{
		return id;
	}
	public long getcapacity()
	{
		return capacity;
	}
	public double getfeild_lenth()
	{
		return feild_length;
	}
	public double getfeild_width()
	{
		return feild_width;
	}
	public void showinfo()
	{
		System.out.println("STADIUM NAME :"+stadium_name);
		System.out.println("LOCATION :"+location);
		System.out.println("ID :"+id);
		System.out.println("CAPACITY :"+capacity+" PEOPLE");
		System.out.println("FEILD LENGTH :"+feild_length+" meter");
		System.out.println("FEILD WIDTH :"+feild_width+" meter");
		
		
	}
	public static void main(String[]args)
	{
		System.out.println("-----STADIUM INFORMATION-----");
		stadium b1=new stadium("Stadium 974","7HQ8+G4, Doha, Qatar",110120,40000,105,68);
		b1.showinfo();
		stadium b2=new stadium();
		b2.setstadium_name("The Melbourne Cricket Ground");
		b2.setlocation("Brunton Ave, Richmond VIC 3002, Australia");
		b2.setid(120458);
		b2.setcapacity(100024);
		b2.setfeild_length(171);
		b2.setfeild_width(146);
		b2.showinfo();
	}
}