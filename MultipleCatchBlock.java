class MultipleCatchBlock{
    public static void main(String[] args){
        try{
            int data[]=new int[5];
            System.out.println(data[6]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("abcdefghijklmnopqrstuvwxy");
    }
}