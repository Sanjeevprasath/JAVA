//import java.awt.*;
class Mthreading extends Thread{
    public void run(){
        System.out.println("Mixing "+Mthreading.currentThread().getId());
         System.out.println("Baking "+Mthreading.currentThread().getId());
          System.out.println("Decorating "+Mthreading.currentThread().getId());
    }
}
class Threading{
    public static void main(String[] args){
        int n=49;
        for(int i=1;i<=n;i++){
        Mthreading th=new Mthreading();
        th.start();
        th.run();
        }
    }
}