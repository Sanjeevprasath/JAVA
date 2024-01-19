import java.util.*;
interface A{
    void S();
     static int Square(int x){
        return(x*x);
    }
}
interface B extends A{ //interface is inherited
    void T();
    static int Cube(int x){
        return(x*x*x);
    }
}
class A3 implements B{
    public void S(){
        System.out.println("Multiple inheritance is not supported by class");
    }
    public void T(){
        System.out.println("Multiple inheritance is supported by interface");
    }
}
class InterfaceInheritance2{
    public static void main(String[] args){
        A3 obj=new A3();
        obj.S();
        obj.T();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        int x=s.nextInt();
        System.out.println(A.Square(x));
        System.out.println("Enter the value:");
        int y=s.nextInt();
        System.out.println(B.Cube(y));
    }
}