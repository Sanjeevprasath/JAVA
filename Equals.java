import java.util.*;
public class Equals{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt1=s1.nextLine();
       int l=txt.length();
       if(txt.equals(txt1)){
       System.out.println("same content");
       }
       else{
           System.out.println("not same content");
       }
    }
}