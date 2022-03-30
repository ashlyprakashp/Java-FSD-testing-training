package day11Assignments;

public class NestedTryCatch {

	public static void main(String[] args) {
		try
		{    
			try   //inner try block 1 
			{    
		 System.out.println("divide by 0");
		 int b =50/0;    
			   }
			catch(ArithmeticException e)  //catch block of inner try block 1 
			    {  
			      System.out.println(e);  
			    }
			try   //inner try block 2
			{    
			    int a[]=new int[5];      
			     a[6]=10;    
			     }
			catch(ArrayIndexOutOfBoundsException e)  //catch block of inner try block 2 
			    {  
			       System.out.println(e);  
			    }  
			    System.out.println("other statement");    
			  }
		catch(Exception e)  //catch block of outer try block
			  {  
			    System.out.println(e);  
			  }    
			    
			  System.out.println("END");    
	 }    
}  
			