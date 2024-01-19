import java.util.*;
public class Linkedlisteg{
    public static void main(String[] args){
        LinkedList<String> l=new LinkedList<String>();
        l.add("KOHLI");
        l.add("ROHIT");
          System.out.println(l);
          l.add("KOHLI");
            System.out.println(l);
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("DHONI");
        l1.add("RAINA");
                  System.out.println(l1);
                l1.add("SACHIN");
                          System.out.println(l1);
                          l.addAll(l1);
                          System.out.println(l);
                          l.addFirst("DRAVID");
                          System.out.println(l);
                          l.addLast("BUMRAH");
                          System.out.println(l);
                          l.add("SHAMI");
                          System.out.println(l);
                          l.removeLast();
                          System.out.println(l);
                          l.removeFirst();
                          System.out.println(l);
                          l.clear();
                          System.out.println(l);
    }
}