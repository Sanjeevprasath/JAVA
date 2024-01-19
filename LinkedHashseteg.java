import java.util.*;
class LinkedHashseteg{
    public static void main(String[] args){
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("virat");
        lhs.add("jaddu");
        Iterator itr=lhs.   iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}
        lhs.remove("jaddu");
        System.out.println(lhs);
    }
}