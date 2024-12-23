import java.util.*;
public class ArrayListStudent {
    int rollno;
    String name;
    int age;
    ArrayListStudent(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
class Test{
    public static void main(String[] args) {
        ArrayListStudent s1=new ArrayListStudent(101,"Sonu",28);
        ArrayListStudent s2=new ArrayListStudent(103,"Chaitanya",26);
        ArrayListStudent s3=new ArrayListStudent(101,"Git",28);

        ArrayList<ArrayListStudent> al=new ArrayList<ArrayListStudent>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr=al.iterator();

        while (itr.hasNext()) {
            ArrayListStudent st=(ArrayListStudent)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
