import java.util.*;

class Date{
	private double day;
	private double month;
	private double year;
	public Room(double d, double m, double y){
		day=d;
		month=m;
		year=y;
	}
	
	public void setLength(double d){
		day=d;
		
	}
		public void setWidth(double m){
		month=m;
		
	}
		public void setHeight(double y){
		year=y;
		
	}
	
	    
    	public double getLength(){
		return length;
		
	}
		public double getWidth(){
		return width;
		
	}
		public double getHeight(){
		return height;
		
	}
	
	public double surfaceArea(){
		double area = 2*(length*width + width*height + height*length);
		return area;
	}
	public double Volume(){
		double volume = length*width*height;
		return volume;
	}
	
}
class Driver{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length, width and height of the room: ");
		double l,w,h;
		l=sc.nextDouble();
		w=sc.nextDouble();
		h=sc.nextDouble();
		
		Room r = new Room(l,w,h);
		
		System.out.println("Lenght: " + r.getLength() + "\nWidth: " + r.getWidth() + "\nHeight: " + r.getHeight());
		System.out.println("Surface Area: " + r.surfaceArea() + "\nVolume: " + r.Volume());
		
}
}