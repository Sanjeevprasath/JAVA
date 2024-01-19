import java.util.*;
public class Factorial{
    public static void main(String args[]){
        int num,fact=1;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=n.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}