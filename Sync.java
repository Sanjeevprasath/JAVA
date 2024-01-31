class Java{
    synchronized void print(int n){
         for(int i=1;i<=5;i++){
             System.out.println(i*n);
             try {
                 Thread.sleep(50);
             } catch(Exception e) {System.out.println(e);}
         }
     }
    }
    class M1 extends Thread{
        Java j;
        M1(Java j){
            this.j=j;
        }
        public void run(){
            j.print(4);
        }
    }
    class M2 extends Thread{
        Java j;
        M2(Java j){
            this.j=j;
        }
        public void run(){
            j.print(7);
        }
    }
    class Sync{
        public static void main(String[] args){
            Java obj=new Java();
            M1 t1=new M1(obj);
            M2 t2=new M2(obj);
            t1.start();
            t2.start();
        }
    }