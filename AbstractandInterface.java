interface A{
    void A1();
    void B1();
    void C1();
    void D1();
    static void S(){
        System.out.println("Programming Languages:");
    }
}
abstract class B implements A{
    public void A1(){
        System.out.println("JAVA");
    }
}
class C extends B{
     public void B1(){
        System.out.println("PYTHON");}
       public  void C1(){
        System.out.println("SQL");}
       public  void D1(){
        System.out.println("RUBY");}
}
class AbstractandInterface{
    public static void main(String[] args){
        A.S();
        A a=new C();
        a.A1();
        a.B1();
        a.C1();
        a.D1();
    }
}