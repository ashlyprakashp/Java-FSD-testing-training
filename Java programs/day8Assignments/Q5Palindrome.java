package day8Assignments;
import java.lang.*;
import java.util.Scanner;

public class Q5Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= sc.next();
		int length = s1.length();
		String rev ="";
		for(int i=length-1;i>=0;i--)
		rev=rev+s1.charAt(i);
		
		if(s1.equals(rev))
			System.out.println(s1+" is a palindrome");
		else
			System.out.println(s1+" is not a palindrome");


	}

}
