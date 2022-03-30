package day4;    //DATA NUMBER CANNOT BE OVERRIDDEN
class School
{
	int Students_no =300;
}
class Computers_class extends School
{
	int Students_no=45;
}
public class MethodOverriding3 {

	public static void main(String[] args) {
		School s=new School();  //upcasting
		System.out.println(s.Students_no);
		

	}

}
