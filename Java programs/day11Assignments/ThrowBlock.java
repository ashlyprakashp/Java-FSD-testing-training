package day11Assignments;

public class ThrowBlock {

	public static void main(String[] args) {
		validate(10);
		System.out.println("Rest of the code");
	}
	public static void validate(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
}
		