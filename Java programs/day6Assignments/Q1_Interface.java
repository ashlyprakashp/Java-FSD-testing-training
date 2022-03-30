package day6Assignments;
interface Shape
{
	void volume();    //Interface with 2 methods
	void area();	
}
class Cylinder implements Shape
{
	public void volume()
	{
		System.out.println("Volume measured..");
	}
	public void area()
	{
		System.out.println("Area measured..");
	}
	
}

public class Q1_Interface {

	public static void main(String[] args) {
		Cylinder v =new Cylinder();
		Cylinder a= new Cylinder();
		v.area();
		v.volume();
		a.area();
		a.volume();

	}

}
