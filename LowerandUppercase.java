import java.util.*;
public class LowerandUppercase{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       txt=txt.toLowerCase();
       System.out.println(txt);
              txt=txt.toUpperCase();
              System.out.println(txt);

    }
}