interface A{
    void S();
}
interface B extends A{ //interface is inherited
    void T();
}
class A3 implements B{
    public void S(){
        System.out.println("Multiple inheritance is not supported by class");
    }
    public void T(){
        System.out.println("Multiple inheritance is supported by interface");
    }
}
class InterfaceInheritance{
    public static void main(String[] args){
        A3 obj=new A3();
        obj.S();
        obj.T();
    }
}