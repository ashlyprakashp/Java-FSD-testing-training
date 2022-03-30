package day8Assignments;
import java.lang.*;
import java.util.Scanner;

public class Q1SubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1= sc.next();
		System.out.println("Enter second string:");
		String str2= sc.next();
		boolean result= false;
		result = str1.contains(str2);
		System.out.println(result);
	
	}

}
