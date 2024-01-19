import java.util.*;
public class Indexof{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       int ss=txt.indexOf("is",5);
       System.out.println(ss);
    }
}