//default modifier is accessed only within the same package...
class DefaultModifier{
     int n=10;
     String name="Sanju";
     int msg(int x){
        return x*5;}
     void msg(){
        System.out.println("yes");
    }
    public static void main(String[] args){
       DefaultModifier p=new DefaultModifier();
        System.out.println(p.n);
        System.out.println(p.name);
       System.out.println(p.msg(15));
       p.msg();
    }
}