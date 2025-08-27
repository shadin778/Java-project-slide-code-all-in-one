public class Box
{
	// within the class we can define instance variable
	// access_modifier dataType variable_name
	private double length;
	private double width;
	private double height;
	
	//we want to keep track of how many box were created??
	public static int BoxCount;
	public Box(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	
	static{
		BoxCount=0;
	}
	
	// Constructor for Box class
	public Box(){
		//let us consider default value is 0.5
		length=0.5;
		width=0.5;
		height=0.5;
		
		BoxCount++;
	}
	
	//setter methods
	public void setLength(double l){
		length = l;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setHeight(double h){
		height = h;
	}
	
	public void setDimension(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	
	//Getter Method for getting values from instance variable
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}	
	public double getHeight(){
		return height;
	}

	// get volume of the box
	public double getVolume(){
		return length*width*height;
	}
	
	//Show method for displaying information about the object
	public void showBox(){
		System.out.println("Length = "+length);
		System.out.println("Width  = "+width);
		System.out.println("Height = "+height);
		System.out.println("Volume ="+getVolume());
	}
	
	
	
	/*
	See Lecture 4.1 - Array slide Page 24 for Example
	
	We can not print data from an index if there 
	is null in that index. The followings steps 
	can be followed to print data of the boxes 
	stored in the array:
	1. Start from the 1st index of the array and check the value of that index.
	2. If it is not null, print data and go to next index. 
		Else, ignore and go to next index.
	3. Repeat until the last index.*/	
	
	public static void showAllBoxs(Box bs[]){
	System.out.println("###Showing Information of All Box Object ###");
	for(int i=0;i<bs.length;i++){
			if(bs[i] != null){
			System.out.println("===== Box at index "+i+" =====");
			bs[i].showBox();
			
			}
		}
	}
	
	
	
	
	
	/* 
	
		#### Mehod for insering object to array ####
	
	See Lecture 4.1 - Array slide Page 20 for Example
	
	We can only assign these objects in the array 
	if there is null value in any of the indexes. 
	The followings steps can be followed 
	to assign an object in the array:
		1. Start from the 1st index of the array and check the value of that index.
		2. If it is null, assign the object and exit. Else, go to the next index.
		3. Repeat until the last index.
	*/
	public void insertBox(Box bs[]){
		for(int i=0;i<bs.length;i++){
			//to check if the cell is empty
			if(bs[i] == null)
			{
				/*this means the reference of the current object 
				that called insertBox method*/
				bs[i] = this;
				/*here we use break break we want to stop 
				the loop if we save the object in array once*/
				break;
			}
		}
	}
	
	// #### Mehod for Finding object from an array ####
	public boolean findBox(Box bs[]){
		
		boolean foundStatus = false;
		
		for(int i=0;i<bs.length;i++){
			if(bs[i] == this)
			{
				foundStatus = true;
				break;
			}
		}
		
		if(foundStatus){
			System.out.println("Box is found");
		}
		else{
			System.out.println("Box is not found");
		}
		
		return foundStatus;
	}
	
	// #### Mehod for removing object from an array ####	
	public void deleteBox(Box bs[]){
		
		for(int i=0;i<bs.length;i++){
			if(bs[i] == this)
			{
				bs[i] = null;
				break;
			}
		}
	}
		
}





