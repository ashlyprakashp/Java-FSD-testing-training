package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		Iterator itr=sample.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}
}
