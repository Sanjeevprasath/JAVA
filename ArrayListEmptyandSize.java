import java.util.*;
class ArrayListEmptyandSize{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        arr.add("SKY");
        arr.add("JADEJA");
        System.out.println(arr.isEmpty());
                System.out.println(arr.size());
                ArrayList<String> arr2=new ArrayList<String>();
                arr2.add("SKY");
        arr2.add("SHARDUL");
        boolean b=arr.equals(arr2);
        System.out.println(b);
        arr.retainAll(arr2);
        System.out.println(arr);
    }
}