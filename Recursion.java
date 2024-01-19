import java.util.*;
public class Recursion{
    static int sum(int i,int j){
        if(j>=i){
            return j+sum(i,j-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(sum(5,10));
    }
}