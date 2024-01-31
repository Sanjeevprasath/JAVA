//import java.awt.*;
class Mthreading2 extends Thread{
    public void run(){
        System.out.println("!!!!!!!!!JAVA!!!!!!!");
    }
public static void main(String[] args){
    Mthreading2 m1=new Mthreading2();
    Mthreading2 m2=new Mthreading2();
    System.out.println(m1.getName()); 
    System.out.println(m2.getName());
    m1.start();
    m2.start();
    m2.setName("MULTI-THREADING");
    System.out.println("After changing the thread name:"+m2.getName());
    System.out.println(m1.currentThread().getId());
    System.out.println(m1.getPriority());
    System.out.println(m2.getPriority());
    m1.setPriority(9);
    m2.setPriority(6);
    System.out.println(m1.getPriority());
     System.out.println(m2.getPriority());
}
}
