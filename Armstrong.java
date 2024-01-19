import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        int num,temp=0,m,r=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        num=n.nextInt();
        temp=num;
        while(num>0)
        {
            m=num%10;
            r=r+(m*m*m);
            num=num/10;
        }
        if(temp==r){
            System.out.println(temp+" is armstrong");
        }
        else{
            System.out.println(temp+" is not a armstrong");

        }
    }
}