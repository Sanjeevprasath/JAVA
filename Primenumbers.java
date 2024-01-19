import java.util.*;
public class Primenumbers{
    public static void main(String args[]){
    int num,i,n,flag=0;
    Scanner number=new Scanner(System.in);
    System.out.println("Enter the number to check:");
    num=number.nextInt();
    n=num/2;
    if(num==0 || num==1){
        System.out.println(num+" is not a prime number");
    }
    else{
        for(i=2;i<=n;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num+" is a prime number");
        }
    }
    
    }
}