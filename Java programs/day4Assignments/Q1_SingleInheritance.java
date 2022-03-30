package day4Assignments;
class Car
{
	void speed()
	{
		System.out.println("High speed");
	}
}
class Audi extends Car
{
	void control()
	{
		System.out.println("High control");
	}
}

public class Q1_SingleInheritance {

	public static void main(String[] args) {
		Audi obj= new Audi();
		obj.speed();
		obj.control();
	}

}
