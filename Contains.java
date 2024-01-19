import java.util.*;
public class Contains{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       int l=txt.length();
       System.out.println(txt.contains("pra"));
       if(txt.contains("s")){
           System.out.println("contains s");
       }
    }
}