package day6Assignments;

public class Q4_LbeledContinue {

	public static void main(String[] args) {
		outer:
			for(int i=2;i<=4;i++)
			     {
					inner:
					for(int j=2;j<=4;j++)
					{
						if(i==3 && j==3) 
						{
							continue outer;
						}
						System.out.println(i+","+j);
					}
				}

			}

		}
