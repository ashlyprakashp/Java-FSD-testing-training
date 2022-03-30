package day2;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		System.out.println("Enter limit n");  // to print from 1 to n
		int n,i=1;
		Scanner sc=new Scanner(System.in);
		n =sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=n);
		
	System.out.println("Enter start limit n");  //to print from n to 1
	n =sc.nextInt();
	do
	{
		System.out.println(n);
		n--;
	}
	while(n>=1);

}}
