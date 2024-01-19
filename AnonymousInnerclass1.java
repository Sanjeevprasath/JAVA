interface Anonymous{
    void msg();
}
class AnonymousInnerclass1{
   public static void main(String[] args){
       Anonymous p=new Anonymous(){
       public void msg(){
           System.out.println("AnonymousInnerclass");
       }
   };
   p.msg();
}
}