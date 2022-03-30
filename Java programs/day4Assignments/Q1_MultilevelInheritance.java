package day4Assignments;
class Shape
{
	void display()
	{
		System.out.println("Inside display");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Inside area");
	}
}

class Cube extends Rectangle
{
	void volume()
	{
		System.out.println("Inside volume");
	}
}

public class Q1_MultilevelInheritance {

	public static void main(String[] args) {
		Cube obj=new Cube();
		obj.display();
		obj.area();
		obj.volume();

	}

}
