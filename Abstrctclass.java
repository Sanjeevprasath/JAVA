abstract class A1{
    public A1(){ //Constructor
        System.out.println("Print this!!!!");
    }
    abstract void M();//Abstract method
    void Mx(){ //non-abstract method
        System.out.println("programming");
    }
}
class A2 extends A1{
    void M(){
        System.out.println("ABSTRACT CLASS WITH CONSTRUCTOR,DATA MEMBER & METHOD");
    }
}
class A3 extends A1{
    void M(){
        System.out.println("JAVA");
    }
}
class Abstrctclass{
    public static void main(String[] args){
        A1 s=new A2();
        s.M();
        s=new A3();
        s.M();
        s.Mx();
    }
}
