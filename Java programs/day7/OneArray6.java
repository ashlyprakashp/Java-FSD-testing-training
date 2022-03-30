package day7;

import java.util.Scanner;

public class OneArray6 
{
	public static void main(String[] args)
	{
		System.out.println("enter the number of students");
		Scanner sc=new Scanner(System.in);
		int studentsno=sc.nextInt();
		System.out.println("enter the name of the student followed by their marks in Bio,Chem,Physics");
		String[] names=new String[studentsno];
		int[] bio=new int[studentsno];
		int[] chem=new int[studentsno];
		int[] phy=new int[studentsno];
		double[] avg=new double[studentsno];
		for(int i=0;i<studentsno;i++)
		{
			names[i]=sc.next();
			bio[i]=sc.nextInt();
			chem[i]=sc.nextInt();
			phy[i]=sc.nextInt();
		}
		for(int i=0;i<studentsno;i++)
		{
			avg[i]=(double)(bio[i]+chem[i]+phy[i])/3;
		}
		System.out.println("the Average marks of science is:-");
		for(int i=0;i<studentsno;i++)
		{
			System.out.println(names[i]+" Science marks="+avg[i]);
		}
	}
}
	