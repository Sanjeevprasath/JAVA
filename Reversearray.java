import java.util.*;
public class Reversearray{
    public static void main(String[] args){
        int[] arr=new int[]{10,20,30,40,50,60,70,80,90,100};
        System.out.println("original array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Reversed array:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
    }
    }
}