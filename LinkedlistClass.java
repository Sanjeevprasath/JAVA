import java.util.*;
class Person{
    int num;
    String name;
    int runs;
public Person(int number,String name,int runs){
    num=number;
    this.name=name;
    this.runs=runs;
}
}
public class LinkedlistClass{
    public static void main(String[] args){
        LinkedList<Person> l=new LinkedList<Person>();
            Person p1=new Person(1,"KOHLI",500);
                        Person p2=new Person(2,"ROHIT",450);
                                    Person p3=new Person(3,"RAHUL",350);
                                    l.add(p1);
                                    l.add(p2);
                                    l.add(p3);
                                    for(Person p:l){
                                        System.out.println(p.num+" "+p.name+" "+p.runs);
                                    }


    }
}