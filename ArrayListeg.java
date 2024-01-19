import java.util.*;
public class ArrayListeg{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("ROHIT");
        arr.add("VIRAT");
        arr.add("GILL");
        arr.add("CHAHAL");
        arr.add("JADDU");
        /*Iterator<String> itr=arr.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());}
        */
        System.out.println(arr.get(3));
        System.out.println("-----------------------------------------");
        arr.set(3,"ASHWIN");
        Collections.sort(arr,Collections.reverseOrder());//--->SORTING AN ARRAYLIST
        for(String i:arr)
        System.out.println(i);
        System.out.println("*******************************************");
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(15);
        ar.add(25);
        ar.add(2);
        ar.add(95);
        ar.add(13);
        System.out.println(ar.get(0));
        System.out.println("-----------------------------------------");
        ar.set(0,156);
        Collections.sort(ar);
        for(Integer i:ar)
        System.out.println(i);
    }
}