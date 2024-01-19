//for multilevel inheritance
class Animal{
    void sound(){
        System.out.println("Makes sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("lol lol");
    }
}
class Cat extends Dog{
    void sound(){
        System.out.println("meow meow");
    }
}
class RuntimePolymorphism1{
    public static void main(String args[]){
        Animal s1,s2,s3;
        s1=new Animal();
        s1.sound();
        s2=new Dog();
        s2.sound();
        s3=new Cat();
        s3.sound();
    }
}