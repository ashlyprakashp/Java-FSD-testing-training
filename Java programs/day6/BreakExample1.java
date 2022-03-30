package day6;

public class BreakExample1 {

	public static void main(String[] args) {
		for(int i=1; i<=10;i++)           // to print from 1 to 10 since break statement 
		{                                 // on 5 till 4 is printed
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
