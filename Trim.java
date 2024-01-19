import java.util.*;
public class Trim{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
              System.out.println(txt.length());
        String tr=txt.trim();
                      System.out.println(tr);
              System.out.println(tr.length());
    }
}