package day8Assignments;

import java.util.Scanner;

public class Q3Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= sc.next();
		char [] ch = new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		System.out.println("Entered String is: ");
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("Reverse order: ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		System.out.println("The reversed array in to string: ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			String s= String.valueOf(ch[i]);
			System.out.println(s);	
		}

	}

}
