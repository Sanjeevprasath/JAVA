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
 class Love extends Dog{
     void l(){
         System.out.println("I Love Dogs");
     }
 }
  public class Multilevelinheritance{
     public static void main(String[] args){
        Love d=new Love();
        d.barks();
        d.sound();
        d.l();
     }
 }