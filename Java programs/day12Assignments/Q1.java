package day12Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {

	public static void main(String[] args) {
		ArrayList <Double> list= new ArrayList <Double>();
		list.add(2.8);
		list.add(1.7);
		list.add(30.7);
		list.add(4.6);
		System.out.println("Array list "+list);
		Collections.sort(list, Collections.reverseOrder());
		for(Double num:list)
		{
			System.out.println(num);
		}
		

	}

}
