package day9;

class Animals
	{
		void eat()
		{
			System.out.println("Animal is eating");
		}
	}
	class SuperExmp2 extends Animals
	{
		void eat()
		{
			System.out.println("Cat is eating");
		}
		void test()
		{
			super.eat();
		}
		public static void main(String[] args)
		{
			SuperExmp2 obj1=new SuperExmp2();
			obj1.eat();
			obj1.test();
		}
	}

