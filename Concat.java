import java.util.*;
public class Concat{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       Scanner a=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt1=a.nextLine();
       txt=txt.concat(" is the best captain of INDIA").concat(" ").concat(txt1);
       System.out.println(txt);
    }
}