import java.util.*;
public class Arrayclone{
    public static void main(String[] args){
        int[] arr=new int[]{20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         System.out.println("After clonning:");
        int[] newarray=arr.clone();
        for(int i:newarray){
            System.out.println(i);
        }
        }

        }
