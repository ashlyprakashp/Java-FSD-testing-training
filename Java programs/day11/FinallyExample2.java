package day11;

public class FinallyExample2 {

	public static void main(String[] args) {
		try
		{
			int data=25/0;  //divide by zero not possible
			System.out.println("data="+data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	/*	catch(Exception e)//default Exception Handler
		{
			System.out.println("there is some arithmetic Exception :"+e);
		} */
		finally 
		{
			System.out.println("Finally block is always executed");
		}

		System.out.println("Rest of the code");
	}	
}

