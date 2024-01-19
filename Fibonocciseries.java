import java.util.*;
public class Fibonocciseries {
    public static void main(String args[]){
        int n1=0,n2=1,n3,l;
        Scanner lt=new Scanner(System.in);
        System.out.println("Enter the limit:");
        l=lt.nextInt();
        System.out.println(n1+" "+n2);
        for(int i=2;i<=l;i++){
            n3=n1+n2;
         System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
