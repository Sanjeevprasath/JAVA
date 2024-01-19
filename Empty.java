import java.util.*;
public class Empty{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt1=s1.nextLine();
       int l=txt.length();
       if(txt.isEmpty()){
       System.out.println("NOTHING");
       }
       else{
           System.out.println("Content");
       }
    }
}