import java.util.*;
class Cylinder{
	double length;
	double radius;
	
	public void setSize(double l, double r){
		length=l;
		radius=r;
	}
	public void printVolume(){
		double volume;
		volume =Math.PI*radius*length;
		System.out.println("Volume of the Cylinder :"+volume);
	}
	public void printArea(){
		double area;
		area=2*Math.PI*radius*radius+2*Math.PI*radius*length;
		System.out.println("Area of the Cylinder :"+area);
	}
}
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input length of Cylinder : ");
		double length=input.nextDouble();
		System.out.print("Input radius of Cylinder : ");
		double radius=input.nextDouble();
		System.out.println();
		Cylinder c=new Cylinder();
		c.setSize(length,radius);
		c.printVolume();
		c.printArea();
	}
}
