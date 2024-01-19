class Staticnestedclass{
    static int data=25;
    static class Innerclass{
        static void msg(){//static method
            System.out.println(data);
        }
    }
    public static void main(String[] args){
       //Staticnestedclass.Innerclass n=new Staticnestedclass.Innerclass();
         Staticnestedclass.Innerclass.msg();//for static method no need of object
    }
}