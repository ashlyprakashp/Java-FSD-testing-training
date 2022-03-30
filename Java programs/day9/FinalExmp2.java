package day9;

class Example
	{
		void test()
		{
			System.out.println("test method in Example class");
		}
	}
	class FinalExmp2 extends Example
	{
		void test() //when given final void test() - error cannot override
		{
			System.out.println("test method in FinalExmp2 class");
		}
		public static void main(String[] args)
		{
			FinalExmp2 a=new FinalExmp2();
			a.test();
		}
	}
