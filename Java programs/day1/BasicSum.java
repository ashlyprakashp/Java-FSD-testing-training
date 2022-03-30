package day1;

import java.util.Scanner;

public class BasicSum {

	public static void main(String[] args) {
		double a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first value");
		a=s.nextDouble();
		System.out.println("Enter second value");
		b=s.nextDouble();
		c=a+b;
		System.out.println("Sum= "+c);

	}

}
