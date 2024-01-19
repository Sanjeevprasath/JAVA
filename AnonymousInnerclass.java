abstract class Anonymous{
    abstract void msg();
}
class AnonymousInnerclass{
   public static void main(String[] args){
       Anonymous p=new Anonymous(){
       void msg(){
           System.out.println("AnonymousInnerclass");
       }
   };
   p.msg();
}
}