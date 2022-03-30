package day14Assignments;

//Write a program to create, write and read from a file.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		try
		{
			File f1=new File("E:example2.txt");
			if(f1.createNewFile())
			{
				System.out.println("a new file named "+f1.getName()+" has been created");
			}
			else
			{
				System.out.println("File already exists");
			}

		}
		catch(IOException e)
		{
			System.out.println("an unexpected error has occured");
			System.out.println(e);
		}
//Writing into file
		try
		{
	FileWriter obj1=new FileWriter("E:example2.txt");
	obj1.write(" GOOD MORNING ALL");
	obj1.close();
	System.out.println("Content has been written to the file successfully");
		}
		catch(IOException e)
		{
	System.out.println("Some unexpected error has occured");
	System.out.println(e);
		}
//reading data
		try
		{
	File f1=new File("E:example2.txt");
	Scanner sc=new Scanner(f1);
	while(sc.hasNextLine())
	{
		String fileData=sc.nextLine();
		System.out.println(fileData);
	}
	sc.close();
		}
		catch(Exception e)
		{

	System.out.println(e);
		}
}}