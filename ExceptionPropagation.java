class ExceptionPropagation{
    void a(){
        int data=50/0;
    }
    void b(){
        a();
    }
    void c(){
        try{
            b();
        }
        catch(Exception e){
            System.out.println("Divided by ZERO");
        }
    }
    public static void main(String[] args){
    ExceptionPropagation n=new ExceptionPropagation();
    n.c();
    System.out.println("Executed");
}
}