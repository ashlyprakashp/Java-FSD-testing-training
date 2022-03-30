package day7Assignments;

import java.util.Scanner;

public class Q5Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of employee");
		String name = sc.next();
		System.out.println("Enter salary");
		int salary= sc.nextInt();
		System.out.println("Enter year of joining");
		int year = sc.nextInt();
		System.out.println(name+" salary is "+salary+" and year of joining "+year);
		

	}

}
