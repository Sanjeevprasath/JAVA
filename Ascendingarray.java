import java.util.*;
public class Ascendingarray{
    public static void main(String[] args){
        int  temp=0;
        int[] arr=new int[]{50,89,23,48,99,46,102,54};
        System.out.println("original array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Ascending array:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            }
    }
    }