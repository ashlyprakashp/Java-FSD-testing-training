package day3Assignments;

import java.util.Scanner;

public class Palindrome8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n, rem, sum=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp)
			System.out.print(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
		

	}

}
