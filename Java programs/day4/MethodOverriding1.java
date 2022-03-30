package day4;
class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is running");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.run();
		

	}

}
