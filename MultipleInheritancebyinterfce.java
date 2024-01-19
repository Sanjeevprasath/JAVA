interface A{
    void S();
}
interface B{
    void T();
}
class A3 implements A,B{
    public void S(){
        System.out.println("Multiple inheritance is not supported by class");
    }
    public void T(){
        System.out.println("Multiple inheritance is supported by interface");
    }
}
class MultipleInheritancebyinterfce{
    public static void main(String[] args){
        A3 obj=new A3();
        obj.S();
        obj.T();
    }
}