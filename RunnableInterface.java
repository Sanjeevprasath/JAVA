class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("run this function");
    }
public static void main(String[] args){
    RunnableInterface r=new RunnableInterface();
    Thread t1=new Thread(r);
    t1.start();
}
}