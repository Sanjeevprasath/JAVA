import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int num,temp=0,m,r=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        num=n.nextInt();
        temp=num;
        while(num>0)
        {
            m=num%10;
            r=(r*10)+m;
            num=num/10;
        }
        if(temp==r){
            System.out.println(temp+" is palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");

        }
    }
}