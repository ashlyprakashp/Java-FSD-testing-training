//2.Create a arraylist of integers and find the sum and average of the entire list.


package sba1;

import java.util.ArrayList;

public class Q2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		sum.add(2);
		sum.add(8);
		sum.add(4);
		sum.add(6);
		int total=0;
		double avrg;
		for(int i=0;i<sum.size();i++)
		
			total= total+sum.get(i);
			avrg= total/sum.size();
			System.out.println("sum "+total);
			System.out.println("Average "+avrg);
	}
}

