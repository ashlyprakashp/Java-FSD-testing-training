package day10Assignments;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		try
		{
			try
			{
				System.out.println("Enter values");
				Scanner sc=new Scanner(System.in);
				int a= sc.nextInt();
				int b=Integer.parseInt(sc.next());
				int result=a/b;
				System.out.println(result);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
