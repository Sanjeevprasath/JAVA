import java.util.*;
public class Strtochar{
    public static void main(String arys[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input:");
        String txt=s.nextLine();
        char[] t=txt.toCharArray();
        for(int i=0;i<t.length;i++){
            System.out.println("index="+i+"-value="+t[i]);
        }
        System.out.println(t);
    }
}