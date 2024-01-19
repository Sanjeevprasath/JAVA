import java.util.*;
public class Dowhile{
    public static void main(String[] args){
        int num,i=1;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=n.nextInt();
        do{
            System.out.println(i);
            i++;
            if(i==15){
                i++;
                continue;
            }
            if(i==44){
                i++;
                break;
            }
        }while(i<=num);
    }
}
        