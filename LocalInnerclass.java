class LocalInnerclass{
    private int n=52;
    void display(){
class Local{
    int n=25;//innerclass data will be the f
    void msg(){
        System.out.println(n);
    }
}
    Local l=new Local();
    l.msg();
}
   public static void main(String[] args){
       LocalInnerclass obj=new LocalInnerclass();
       obj.display();
   } 
}