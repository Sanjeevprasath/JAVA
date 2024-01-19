import java.util.*;
class Student{
    int num;
    String name;
    int runs;
    Student(int num,String name,int runs){
        this.num=num;
        this.name=name;
        this.runs=runs;
    }
}
public class ArrayListClass{
    public static void main(String[] args){
        Student s1=new Student(18,"VIRAT",225);
          Student s2=new Student(45,"ROHIT",206);
            Student s3=new Student(01,"RAHUL",198);
            ArrayList<Student> s=new ArrayList<Student>();
            s.add(s1);
            s.add(s2);
            s.add(s3);
            Iterator itr=s.iterator();
            while(itr.hasNext()){
                Student st=(Student)itr.next();
                System.out.println(st.num+" "+st.name+" "+st.runs);
            }
    }
}