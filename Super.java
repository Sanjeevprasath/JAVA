import java.util.*;
class Person{
    int id;
    String name;
    
    public Person(int i,String n){
        id=i;
        name=n;
    }
}
class Employee extends Person{
    float salary;
    public Employee(int i,String n,float s){
      super(i,n);
      salary=s;
    }

void display(){
    System.out.println(id+","+name+","+salary);
}
}
class Super{
    public static void main(String[] args){
        Employee e=new Employee(23,"sanjeev",500.52f);
        e.display();
    }
}
----------------------------------------------------------------
class B{
     void s(){
        System.out.println("message");
    }
}
class F extends B{
    void s(){
        System.out.println("messages");
    }
    void sup(){
        super.s();
        s();
    }
}
class Super{
    public static void main(String[] args){
        F f=new F();
        f.sup();
    }
}