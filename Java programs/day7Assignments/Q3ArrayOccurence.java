package day7Assignments;

import java.util.Scanner;

public class Q3ArrayOccurence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		System.out.println("Enter size of array");
		int size= sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter element to find occurance:");
		int element = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==element)
			{
				count++;
			}
		}
		System.out.println("Number of occurance= "+count);

	}

}
