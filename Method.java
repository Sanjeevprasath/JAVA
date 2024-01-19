import java.util.*;
public class Method{
    static int func(int x,int y){
        return x+y;
    }
    static void fun(String name,int age,String country){
        System.out.println("He is "+name+" and his age is "+age+","+ "living in "+country+".");
    }
    public static void main(String[] args){
        System.out.println(func(5,6));
        System.out.println(func(45,65));
        System.out.println(func(-55,600));
        fun("Sanjeev Prasath",23,"INDIA");

    }
}