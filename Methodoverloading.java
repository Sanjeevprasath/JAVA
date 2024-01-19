import java.util.*;
public class Methodoverloading{
    static int func(int x,int y){
        return(x+y);
    }
    public double func(double x,double y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(func(10,20));
        Methodoverloading m=new Methodoverloading();
        System.out.println(m.func(100.23,20.18));
    }
}