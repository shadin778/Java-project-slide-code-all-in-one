class Date{
	private int day;
	private int month;
	private int year;
	
	Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getDate(){
		return day+"."+month+"."+year;
	}
	public void showDate(){
		System.out.println(day+"."+month+"."+year);
	}
}