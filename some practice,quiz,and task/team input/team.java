import java.lang.*;
public class team
{
	long id;
	String tn;  //team name
	String tt;  //team  type
	int pn;     //player number
	String to;  //team owner
	
	public team()
	{
		System.out.println("-----Empty constractor-----");
	}
	public team(long id, String tn, String tt, int pn, String to)
	{
		this.id=id;
		this.tn=tn;
		this.tt=tt;
		this.pn=pn;
		this.to=to;
		System.out.println("-----parameterized constractor-----");
	}
	public void setid(long id)
	{
		this.id=id;
	}
	public void settn( String tn)
	{
		this.tn=tn;
	}
	public void settt(String tt)
	{
		this.tt=tt;
	}
	public void setpn( int pn)
	{
		this.pn=pn;
	}
	public void setto(String to)
	{
		this.to=to;
	}
	public long getid()
	{
		return id;
	}
	public String gettn()
	{
		return tn;
	}
	public String gettt()
	{
		return tt;
	}
	public int getpn()
	{
		return pn;
	}
	public String getto()
	{
		return to;
	}
	void show()
	{
		System.out.println("TEAM ID: "+id);
		System.out.println("TEAM NAME: "+tn);
		System.out.println("TEAM TYPE: "+tt);
		System.out.println("PLAYER NUMBER: "+pn);
		System.out.println("TEAM OWNER: "+to);
	}
	
}
