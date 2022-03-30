package day4Assignments;
class Main
{
	void draw()
	{
		System.out.println("ANY");
	}
}
class A extends Main
{
	void draw()
	{
		System.out.println("WITH A");
	}
}
class B extends Main
{
	void draw()
	{
		System.out.println("WITH B");
	}
}
class C extends Main
{
	void draw()
	{
		System.out.println("WITH C");
	}
}

public class Q2_MethodOverriding {

	public static void main(String[] args) {
		Main s=null;
		s=new Main();
		s.draw();
		s=new A();
		s.draw();
		s=new B();
		s.draw();
		s=new C();
		s.draw();
	}

}

