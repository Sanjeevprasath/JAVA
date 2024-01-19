import java.util.*;
class PublicModifier1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
         System.out.println("Enter the value of X:");
         int x=s.nextInt();
         System.out.println("Enter the Salary:");
         float y=s.nextFloat();
        PublicModifier m=new PublicModifier();
        System.out.println(m.n);
         System.out.println(m.name);
          System.out.println(m.salary(y));
          m.main();
           System.out.println(m.main(x));
    }
}