class MemberInnerclass{
    private int data=22;
class Ic2{
    void msg(){
        System.out.println(data);
    }
}
public static void main(String[] args){
        MemberInnerclass n=new MemberInnerclass();
        MemberInnerclass.Ic2 m=n.new Ic2();
        m.msg();
}
}