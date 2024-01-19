import java.util.*;
class Hashseteg{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<String>();
        hs.add("DHONI");
        hs.add("RAINA");
        hs.add("DHONI");
                hs.add("sachin");
    
        Iterator it=hs.iterator();
        while(it.hasNext()){
                    System.out.println(it.next());}
                                        System.out.println(hs.size());
        HashSet<String> hs1=new HashSet<String>();
        hs1=(HashSet)hs.clone();//clone HASHSET
         Iterator itr=hs1.iterator();
        while(itr.hasNext()){
                    System.out.println(itr.next());}
         System.out.println(hs1.contains("DHONI"));
         System.out.println(hs1.isEmpty()); 
         hs1.clear();
                  System.out.println(hs1.isEmpty());
    }
}