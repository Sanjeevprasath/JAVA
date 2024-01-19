import java.util.*;
public class Substring{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       String ss=txt.substring(2,5);
       System.out.println(ss);
    }
}