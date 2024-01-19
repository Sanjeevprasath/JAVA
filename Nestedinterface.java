interface S{
    void msg();
interface M{
    void dis();
}
}
class Nestedinterface implements S.M{
        public void dis(){
            System.out.println("this ::");}
public static void main(String[] args){
    S.M obj=new Nestedinterface();
    obj.dis();
}
}