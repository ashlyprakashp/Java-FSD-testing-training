package day6Assignments;

public class Q3_LabeledBreak {

	public static void main(String[] args) {
		outer:
			for(int i=2;i<=5;i++)
			{
				inner:
					for(int j=2;j<=5;j++)
					{
						if(i==3 && j==3)      
						{
							break outer;
						}
						System.out.println(i+","+j);
					}
			}

	}

}
		