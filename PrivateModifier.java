//Private modifier is accessed only within the class...
class PrivateModifier{
    private int n=10;
    private String name="Sanju";
    private int msg(int x){
        return x*5;}
    void msg(){
        System.out.println("yes");
    }
    public static void main(String[] args){
       PrivateModifier p=new PrivateModifier();
        System.out.println(p.n);
        System.out.println(p.name);
       System.out.println(p.msg(15));
       p.msg();
    }
}