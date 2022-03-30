package day3Assignments;

import java.util.Scanner;

public class ArithOperation1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		double a,b,c;
		a= sc.nextDouble();
		b= sc.nextDouble();
		c=a+b;
		System.out.println("Sum :"+c);
		c=a-b;
		System.out.println("Sub :"+c);
		c=a*b;
		System.out.println("mul :"+c);
		c=a/b;
		System.out.println("div :"+c);
		c=a%b;
		System.out.println("rem :"+c);
		
		

	}

}
