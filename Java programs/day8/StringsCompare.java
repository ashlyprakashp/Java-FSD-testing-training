package day8;

public class StringsCompare {

	public static void main(String[] args) {
		String s1 = "Amazon";   //ascci A-Z = 65-90
		String s2 = "amazon";   // ascci a-z = 97-122
		String s4 = "Amazon";
		System.out.println(s1.equals(s2));  // false since case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=new String("Amazon");
		System.out.println(s1==s3);  //false since s1 is string literal and s2 is by keyword
		System.out.println(s1==s4);  // true both literals


	}

}
