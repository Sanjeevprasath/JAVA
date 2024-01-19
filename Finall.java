//final variable-can't change variable value
/*class Finall{
    final int j=25;
    int sum(){
        j=55;
        return j;
    }
    public static void main(String[] args){
        Finall c=new Finall();
        c.sum();
    }
}*/
//final method-can't override
//final class-can't inherit class(extend)
class Finall{
    final void s(){
        System.out.println("messages");
    }
}
class Car extends Bike{
    void s(){
        System.out.println("message");
    }
}
class A{
    public static void main(String[] args){
        Car c=new Car();
        c.s();
    }
}