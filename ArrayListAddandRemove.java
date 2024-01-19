import java.util.*;
class ArrayListAddandRemove{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Rohit");
        arr.add("Siraj");
         arr.add("Shreyas");
        System.out.println(arr);
        arr.add(0,"kuldeep");
        System.out.println(arr);
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.add("Virat");
        arr2.add("Ashwin");
        arr2.add(1,"Bumrah");
        System.out.println(arr2);
        arr.addAll(arr2);
        System.out.println(arr);
        ArrayList<String> arr3=new ArrayList<String>();
        arr3.add("Jaddu");
        arr3.add("Rahul");
        arr3.add("SKY");
        System.out.println(arr3);
        arr.addAll(2,arr3);
        System.out.println(arr);
        arr.add(0,"Gill");
        System.out.println(arr);
        arr.removeAll(arr2);
        System.out.println(arr);
        arr.remove(5);
        System.out.println(arr);
    }
}