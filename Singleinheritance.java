import java.util.*;
class Animal{
     void sound(){
         System.out.println("Animals show love towards humans");
     }
}
 class Dog extends Animal{
      void barks(){
          System.out.println("Dog is loyal to humans");
      }
 }
 public class Singleinheritance{
     public static void main(String[] args){
        Dog d=new Dog();
        d.barks();
        d.sound();
     }
 }