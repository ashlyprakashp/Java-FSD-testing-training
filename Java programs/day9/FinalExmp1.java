package day9;

public class FinalExmp1 {
	int a=5;  //when final given error occurs(final int a=5;).value cannot be changed to 350
	void test()
	{
		a=350;
		System.out.println("a value after changing="+a);
	}
	public static void main(String[] args)
	{
		FinalExmp1 a=new FinalExmp1();
		System.out.println("a ="+a);
		a.test();
	}
}
	