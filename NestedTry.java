class NestedTry{
    public static void main(String[] args){
        try{
            try{
                int data=50/0;
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException");
            }
            try{
                int n[]=new int[5];
                n[20]=20;
            }
            catch(ArrayIndexOutOfBoundsException e ){
                System.out.println("IndexoutofBounds");
            }
            System.out.println("ok");
        }
        catch(Exception e){
            System.out.println("nested try block is executed");
        }
        System.out.println("normal flow");
    }
}