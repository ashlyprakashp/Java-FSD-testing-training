package day9;

public class StaticExmp1 {
		static int count=0; // a.count, b.count, c.count 
		                 // if -int count=0;- is given output is 1,1,1
		StaticExmp1()
		{
			count++;
			System.out.println(count);
		}
		public static void main(String[] args)
		{
			StaticExmp1 a=new StaticExmp1();
			StaticExmp1 b=new StaticExmp1();
			StaticExmp1 c=new StaticExmp1();	
		}
	}

