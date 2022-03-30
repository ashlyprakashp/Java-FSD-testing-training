package day6;

public class ContinueExample1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			{
				if(i==5)           // to print from 1 to 10 since continue is given =5   
				{                  // it skips 5 and move on to next number
					continue;     
				}
			}
			System.out.println(i);
		}

	}

}
