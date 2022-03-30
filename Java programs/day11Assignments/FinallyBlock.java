package day11Assignments;

public class FinallyBlock {

	public static void main(String[] args) {
		try
		{
			int result =50/0;
			System.out.println(result);	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");

	}

}
