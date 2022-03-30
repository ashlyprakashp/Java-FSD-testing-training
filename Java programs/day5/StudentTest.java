package day5;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Student s= new Student();
		String str=null;
		System.out.println("Enter first name");
		str=sc.next();
		s.setName(str);
		Student r=new Student();
		System.out.println("Enter second name");
		str=sc.next();
		r.setName(str);
		System.out.println(s.getName());
		System.out.println(r.getName());

	}

}
