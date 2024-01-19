import java.util.*;
public class Whileloop{
    public static void main(String[] args){
        int num,i=1;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=n.nextInt();
        while(i<=num){
            if(i==15){
                i++;
                continue;
            }
            if(i==30){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}