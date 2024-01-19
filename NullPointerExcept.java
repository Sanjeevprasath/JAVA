class NullPointerExcept{
    public static void main(String[] args){
        try{
            String data=null;
            System.out.println(data.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}