import java.util.*;
public class Objectbymethod{
    int num;
    String name;
    
    void insert(int i,String n){
        num=i;
        name=n;
    }
    void display(){
        System.out.println(num+" "+name);
    }
    public static void main(String args[]){
        Objectbymethod s=new Objectbymethod();
        s.insert(22,"Sanjeev");
        s.display();
    }
}