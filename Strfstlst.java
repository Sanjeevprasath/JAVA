import java.util.*;
public class Strfstlst{
    public static void main(String arys[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input:");
        String txt=s.nextLine();
        int length=txt.length();
        char c=txt.charAt(0);
         char a=txt.charAt(length-1);
        System.out.println(c);
        System.out.println(a);
        for(int i=0;i<length;i++){
            if(i%2==0){
                System.out.println(txt.charAt(i));
            }
        }
    }
}