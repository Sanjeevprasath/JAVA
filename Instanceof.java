//Instanceof----returns true or false
class A{
    int s(int x){
        return x;
    }
}
class B extends A{
    int s(int y){
        return y;
    }
}
class Instanceof{
    public static void main(String[] args){
        A b=new B();
        //B b=(B)new A();//Downcasting
        System.out.println(b instanceof A);
    }
}