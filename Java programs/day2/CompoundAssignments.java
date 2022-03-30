package day2;

import java.util.Scanner;

public class CompoundAssignments {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a= sc.nextDouble();
		double b=sc.nextDouble();
		double c;
		a+=b;
		System.out.println("sum "+a);
		a-=b;
		System.out.println("sub "+a);
		a*=b;
		System.out.println("mul "+a);
		a/=b;
		System.out.println("div "+a);
		a%=b;
		System.out.println("remainder "+a);

	}

}
