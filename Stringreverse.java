import java.util.*;
public class Stringreverse{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the content:");
       String txt=s.nextLine();
       int l=txt.length();
        System.out.println("Reverse string is:");
        for(int i=0;i<l;i++){
            System.out.println(txt.charAt(l-i-1));
        }
    }
}