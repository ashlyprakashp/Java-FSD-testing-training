package day2;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a= sc.nextDouble();
		double b=sc.nextDouble();
		double c;
		c=a+b;
		System.out.println("sum "+c);
		c=a-b;
		System.out.println("sub "+c);
		c=a*b;
		System.out.println("mul "+c);
		c=a/b;
		System.out.println("div "+c);
		c=a%b;
		System.out.println("remainder "+c);

	}

}
