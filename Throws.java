import java.io.IOException;
class Throws{
    void a()throws IOException{
        throw new IOException("error");
    }
    void b()throws IOException{
        a();
    }
    void c(){
        try{
            b();
        }
        catch(Exception e){
            System.out.println("THROWS");
        }
    }
    public static void main(String[] args){
        Throws n=new Throws();
        n.c();
        System.out.println("rest of the code");

    }
}