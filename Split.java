import java.util.*;
public class Split{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       String[] t=txt.split("",10);
       for(String i:t){
       System.out.println(i);
       }
    }
}