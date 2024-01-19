import java.util.*;
public class Equalsignorecase{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt1=s1.nextLine();
       Boolean out=txt.equalsIgnoreCase(txt1);
       System.out.println(out);
    }
}