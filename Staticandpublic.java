import java.util.*;
public class Staticandpublic{
    static void car(String name){
        System.out.println("I have a "+name+" Car :)");
    }
    public void speed(int s){
        System.out.println("Speed of my car is "+s+" Km/hr");
    }
    public static void main(String[] args){
        car("BMW");
        Staticandpublic fast=new Staticandpublic();
        fast.speed(100);
    }
}