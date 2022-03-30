package day2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//print from 1-10
				for(int i=1;i<=10;i++)
				{
					System.out.print(i+",");
				}
				//to print from 10-1
				System.out.println();
				System.out.println("to print from 10-1");
				for(int i=10;i>=1;i--)
				{
					System.out.print(i+",");
				}
				//to print from 1 to n
				System.out.println();
				System.out.println("To print from 1-n");
				System.out.println("enter limit n");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					System.out.print(i+",");
				}
				//to print from n to 1
				System.out.println();
				System.out.println("To print from n-1");
				System.out.println("enter limit n");
				n=sc.nextInt();
				for(int i=n;i>=1;i--)
				{
					System.out.print(i+",");

	}

}}
