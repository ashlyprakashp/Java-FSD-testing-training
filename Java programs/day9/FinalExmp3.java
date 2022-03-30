package day9;

	class Sample  //when-final class Sample- given error bcoz cannot inherit
	{
		void run()
		{
			System.out.println("run method in Sample");
		}
	}
	class FinalExmp3 extends Sample
	{
		void run()
		{
			System.out.println("run method in FinalExmp3");
		}
		public static void main(String[] args)
		{
			FinalExmp3 a=new FinalExmp3();
			a.run();
		}
	}

