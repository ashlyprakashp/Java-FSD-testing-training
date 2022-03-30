package day4Assignments;
                 // Performed by changing the number of arguments
public class Q3_aMethodOverloading
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		add(5,2);
		add(5,2,6);
	}
}
