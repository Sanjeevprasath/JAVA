//Protected modifier is accessed  within the same package and outside the package with only through inheritance...
class ProtectedModifie{
     protected int age=10;
     protected String name="Sanju";
     protected int msg(int x){
        return x*5;}
     void msg(){
        System.out.println("yes");
    }
}
    class ProtectedModifier extends ProtectedModifie{
        private float salary=800.23f;
    public static void main(String[] args){
       ProtectedModifier p=new ProtectedModifier();
        System.out.println(p.age);
        System.out.println(p.name);
       System.out.println(p.msg(15));
       System.out.println(p.salary);
       p.msg();
    }
}