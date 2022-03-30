package day10Assignments;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input text: ");
		try
		{
			char c= sc.nextLine().charAt(4);
			System.out.println("The character at index 4 is :"+c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
