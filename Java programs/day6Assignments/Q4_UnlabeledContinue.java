package day6Assignments;

public class Q4_UnlabeledContinue {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			{
				if(i%2==0)          //odd number  
				{                  
					continue;     
				}
			}
			System.out.println(i);
		}

	}

}

