package day3Assignments;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,m=0,count=0,n;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++) 
		{
			if(n%i==0)
			{
			 count++;
			 break;
			}
		}
		if(count==0 && n!=1);
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		
			

	}

}
