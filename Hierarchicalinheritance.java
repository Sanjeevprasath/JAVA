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
 class Love extends Animal{
     void l(){
         System.out.println("I Love Dogs");
     }
 }
  public class Hierarchicalinheritance{
     public static void main(String[] args){
        Love d=new Love();
       // d.barks();
        d.sound();
        d.l();
     }
 }

------------------------------------------------------
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
 class Love extends Animal{
     void l(){
         System.out.println("I Love Dogs");
     }
 }
  public class Methodoverriding{
     public static void main(String[] args){
        Love myLove=new Love();
       Dog myDog=new Dog();
       Animal myAnimal=new Animal();
       myLove.l();
       myDog.barks();
       myAnimal.sound();
     }
 }
