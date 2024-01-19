import java.util.*;
public class Righttriangle{
    public static void main(String args[]){
        int i,j,rows;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the rows:");
        rows=r.nextInt();
        for(i=0;i<rows;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.println("* ");
            }
            System.out.println("");
        }
    }
}