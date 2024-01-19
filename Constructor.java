// Creating Constructor--->

import java.util.*;
public class Constructor{
    int num;
    String name;
public Constructor(int i,String n){
    num=i;
    name=n;
}
void display(){
    System.out.println(num+" "+name);
}
public static void main(String[] args){
    Constructor c=new Constructor(55,"ram");
    c.display();
 }
}