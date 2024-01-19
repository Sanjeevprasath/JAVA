import java.util.*;
public class Oddarray{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in); 
        System.out.println("Enter the size of array:");
        int num=n.nextInt();
        
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
             System.out.println("Enter the value:");
            arr[i]=n.nextInt();
        }
        System.out.println("original array:");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Even array:");
        for(int i=0;i<num;i++){
        if(arr[i]%2!=0){
          System.out.println(arr[i]+" ");  
    }
        }
    }
    }