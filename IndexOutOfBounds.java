class IndexOutOfBounds{
    public static void main(String[] args){
        try{
        int a[]=new int[8];
        a[40]=22;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}