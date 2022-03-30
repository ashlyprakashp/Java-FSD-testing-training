package day3Assignments;

import java.util.Scanner;

public class DuckNumber7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,count=0,rem;
		System.out.println("enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)
				count++;
			n=n/10;
		}
		if(count>0)
			System.out.println(temp+" is a duck number");
		else
			System.out.println(temp+" is not a duck number");
		

	}

}
