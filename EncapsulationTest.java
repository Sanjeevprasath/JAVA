import java.util.*;
class Encapsulationn{
    private String name;
    private int n;
    private String email;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
class EncapsulationTest{
    public static void main(String[] args){
        Encapsulationn k=new Encapsulationn();
        k.setName("Sanju");
        k.setN(55);
        k.setEmail("ssanju@gmail.com");
        System.out.println(k.getName());
        System.out.println(k.getN());
        System.out.println(k.getEmail());
    }
}