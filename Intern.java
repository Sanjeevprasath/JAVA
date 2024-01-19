import java.util.*;
public class Intern{
    public static void main(String[] args){
       /*Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();*/
       String txt="BAD BOY";
       String t=new String("BAD BOY");
       String name=txt.intern();
       String n=t.intern();
       System.out.println(txt==name);
       System.out.println(txt==t);
    }
}