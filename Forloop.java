import java.util.*;
public class Forloop{
    public static void main(String[] args){
        int num,i;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=n.nextInt();
        for(i=0;i<=num;i+=5){
            if(i==15){
                continue;
            }
            
            System.out.println(i);
            if(i==45){
                break;
            }
        }
    }
}