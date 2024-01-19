import java.util.*;
public class Replace{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       String t=txt.replace("a","m");
       System.out.println(t);
    }
}