package day7Assignments;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter the number of employees");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter employeename, salary and year of joining");
		String[] name = new String[n];
		int[] salary = new int[n];
		int[] year = new int[n];
		for(int i=0;i<n;i++)
		{
			name[i] = sc.next();
			salary[i]= sc.nextInt();
			year[i]= sc.nextInt();
					
		}
		System.out.println("details entered are");
		for(int i=0;i<n;i++)
		{
		System.out.print("name " +name[i]+ " salary " +salary[i]+ " year "+year[i]);
		System.out.println("");

	}

}}
