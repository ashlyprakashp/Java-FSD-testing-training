package day7Assignments;

import java.util.Scanner;

public class Q1ArrayGreatest {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter size of array");
			int size= sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter elements in array");
			for(int i=0;i<size;i++)
			{
				arr[i]= sc.nextInt();
			}
			int max= arr[0]; 

			for(int i=0;i<arr.length;i++)  // compare elements of array with max
			{
				if(arr[i]>max)
				max=arr[i];
			}
			System.out.println("Greatest element in this array: "+ max);
	}

}
