 import java.util.*;
 public class If{
     public static void main(String args[]){
         int a,b,c;
         Scanner a1=new Scanner(System.in);
         System.out.println("Enter a:");
         a=a1.nextInt();
         Scanner b1=new Scanner(System.in);
         System.out.println("Enter b:");
         b=b1.nextInt();
         Scanner c1=new Scanner(System.in);
         System.out.println("Enter c:");
         c=c1.nextInt();
         if(a>b && a>c){
             System.out.println("a is greater number");
         }
         else if(b>a && b>c){
             System.out.println("b is greater number");
         }
         else{
              System.out.println("c is greater number");
         }
        
         
     }
 }