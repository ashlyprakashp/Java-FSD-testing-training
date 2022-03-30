package day11Assignments;
import java.io.*;  
class M{  
 void method()throws IOException
 {  
  System.out.println("device operation performed");  
 }  
}  
class ThrowsBlock{  
   public static void main(String args[])throws IOException{  //declare exception  
     M obj=new M();  
     obj.method();  
  
    System.out.println("normal flow...");  
  }  
}  
