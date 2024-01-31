//import java.awt.*;
class Mthreading1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(10);
            } catch(Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Mthreading1 m1=new Mthreading1();
        Mthreading1 m2=new Mthreading1();
        Mthreading1 m3=new Mthreading1();
        m1.start();
        try{
            m1.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        m2.start();
        m3.start();
    }
}
