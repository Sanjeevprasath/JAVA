import java.util.*;
public class ListtoArray{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("DHONI");
        list.add("SACHIN");
        list.add("SEHWAG");
        System.out.println(list);
        String[] array=list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
}