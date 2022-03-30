package day3Assignments;

import java.util.Scanner;

public class StrongNo6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number n");
		int a,b=0;    //a=storing factorial, b=storing sum, n=storing copy of the given
		              // no so that the changes we make should reflect in the original 
		              // no
		int number = sc.nextInt();
		int n=number;
		while(n!=0)
		{
			a=1;
			int r=n%10; //calculate factorial of r
			for(int i=r;i>=1;i--)
				a=a*i;   // storing sum  of fact of all digits of number
			b=b+a;
			n=n/10;	
		}
		if(b==number)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");

	}

}
