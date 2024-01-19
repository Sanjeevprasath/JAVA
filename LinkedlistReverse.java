import java.util.*;
public class LinkedlistReverse{
    public static void main(String[] args){
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(100);
        l.add(250);
        l.add(500);
        l.add(1000);
         System.out.println(l);
        l.add(3,375);
        System.out.println(l);
        Iterator i=l.descendingIterator();
        while(i.hasNext()){
        System.out.println(i.next());
        }
    }
}