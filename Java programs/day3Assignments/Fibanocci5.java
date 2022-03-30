package day3Assignments;

import java.util.Scanner;

public class Fibanocci5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter limit n");
		int n,firstTerm=0,secondTerm=1;
		n = sc.nextInt();
		for(int i=1; i<=n;i++)
		{
			System.out.print(firstTerm+ ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		

	}

}
