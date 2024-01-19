class Throw{
    public static void vote(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args){
        vote(15);
    }
}