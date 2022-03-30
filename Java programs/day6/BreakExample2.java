package day6;

public class BreakExample2 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==2 && j==2)          // when i=2, j=2 -breaks out of statement and
				{                         // increment i=3
					break;
				}
				System.out.println(i+","+j);
			}
		}

	}

}
