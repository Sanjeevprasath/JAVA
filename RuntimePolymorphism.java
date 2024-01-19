//for hierarchical inheritance
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
class Cat extends Animal{
    void sound(){
        System.out.println("meow meow");
    }
}
class RuntimePolymorphism{
    public static void main(String args[]){
        Animal s;
        s=new Animal();
        s.sound();
        s=new Dog();//upcasting
        s.sound();
        s=new Cat();
        s.sound();
    }
}