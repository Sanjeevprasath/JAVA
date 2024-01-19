import java.util.*;
public class Array{
    public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the array size:");
      int size=a.nextInt();
      
      int[] arr=new int[size];
      for(int i=0;i<size;i++){
        System.out.println("Enter the array Data arr[i]:");
          arr[i]=a.nextInt();
      }
        System.out.println("Numbers stored in Array are:");
        for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
    }
    }
}