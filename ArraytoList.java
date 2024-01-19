import java.util.*;
public class ArraytoList{
    public static void main(String[] args){
        String[] array={"KOHLI","ROHIT","BUMRAH"};
        System.out.println(Arrays.toString(array));
        ArrayList<String> list=new ArrayList<String>();
        for(String i:array){
            list.add(i);
        }
            System.out.println(list);
        }
}