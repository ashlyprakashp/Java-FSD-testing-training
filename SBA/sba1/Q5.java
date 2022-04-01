/*5.Write a program to take an input of a string with multiple words and convert it into a string array,
and check if every element of that array is a Palindrome.
Note: Palindrome is a word which when reversed also is the same.*/

package sba1;

import java.util.Scanner;

public class Q5 {
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
