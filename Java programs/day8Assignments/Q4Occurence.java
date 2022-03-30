package day8Assignments;
import java.lang.*;
import java.util.Scanner;

public class Q4Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= sc.next();
		System.out.println("Enter character to check occurence");
		char ch= sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
				count++;
		}
		System.out.println("Character "+ch+" appears "+count+ " times.");

	}

}
