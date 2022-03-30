package day3Assignments;

import java.util.Scanner;

public class TernaryOpe2b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a,b,c,d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=a<b?(a<c?a:c):(b<c?b:c);
		System.out.println("smallest of three numbers: "+d);		
		

	}

}
