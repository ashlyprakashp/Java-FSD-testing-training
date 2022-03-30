package day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		System.out.println("1.MONDAY,2.TUESDAY,3.WEDNESDAY,4.THURSDAY,5.FRIDAY");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:System.out.println("Today is monday");
		break;
		case 2:System.out.println("Today is tuesday");
		break;
		case 3:System.out.println("Today is wednesday");
		break;
		case 4:System.out.println("Today is thursday");
		break;
		case 5:System.out.println("Today is friday");
		break;
		default:System.out.println("Invalid input");
		break;
		}
		System.out.println("end of program");

	}

}
