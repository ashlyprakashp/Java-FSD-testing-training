package day16Assignments;

public class Q2 {  //INSERTION SORT

	public static void main(String[] args) {
		int a[]= {50,28,62,33,45};
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
			for(int k=0;k<a.length;++k)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
