class Finalblock{
    public static void main(String[] args){
        try{
            int data=85/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final block is executed");
        }
        System.out.println("ok");
    }
}