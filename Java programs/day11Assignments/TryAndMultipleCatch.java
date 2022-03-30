package day11Assignments;

public class TryAndMultipleCatch {

	public static void main(String[] args) {
		try
		{
			int a[]= new int[5];
			a[5]=30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound Exception occurs" +e);
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs" +e);
		}

	}

}
