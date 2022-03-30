package day4;

public class MethodOverloading2 {
	static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	static void add (int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add (1112,3456);
		add (100,200);

	

	}

}
