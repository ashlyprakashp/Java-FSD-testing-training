package day11Assignments;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value");
			int a=sc.nextInt();
			int result=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
