import java.util.*;
public class Switch{
    public static void main(String args[]){
        int amount;
        Scanner amt=new Scanner(System.in);
        System.out.println("Enter the number:");
        amount=amt.nextInt();
        switch(amount){
            case 2000:
                System.out.println("Ooty polam");
                break;
            case 4000:
                System.out.println("vagamon polam");
                break;
            case 1000:
                System.out.println("Dinner polam");
                break;
            case 3000:
                System.out.println("wonderla polam");
                break;
            case 100:
                System.out.println("Turf polam");
                break;
            case 7000:
                System.out.println("Goa polam");
                break;
            default:
                System.out.println("Stay home stay safe");
        }
    }
}