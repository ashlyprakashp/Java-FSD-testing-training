package day4Assignments;
              //performed by changing the type of arguments
public class Q3_bMethodoverloading
{
	static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	static void add(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		add(11.67,12.3456);
		add(17.1,200);
	}
}
