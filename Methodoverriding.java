import java.util.*;
class bank{
    void interest(){
        System.out.println("BANK INTEREST:");
    }
}
class SBI extends bank{
    int interest(int i){
        return i;
    }
}
class IOB extends bank{
    int interest(int i){
         return i;
    }
}
class BOB extends bank{
    int interest(int i){
       return i;
    }
}
public class Methodoverriding{
    public static void main(String[] args){
        bank bnk=new bank();
        BOB b=new BOB();
        SBI s=new SBI();
        IOB i=new IOB();
        bnk.interest();
        System.out.println(b.interest(6));
        System.out.println(s.interest(8));
        System.out.println(i.interest(9));
    }
}