import java.util.*;

public class ArrayListEmp {
    int id;
    String name;
    int age;
    ArrayListEmp(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
class Test1{
    public static void main(String[] args) {
        ArrayListEmp e1=new ArrayListEmp(1,"Sonu",28);
        ArrayListEmp e2=new ArrayListEmp(3,"Chaitanya",26);
        ArrayListEmp e3=new ArrayListEmp(2,"Git",28);

        ArrayList<ArrayListEmp> al=new ArrayList<ArrayListEmp>();
        al.add(e1);
        al.add(e2);
        al.add(e3);

        Iterator itr=al.iterator();

        while (itr.hasNext()) {
            ArrayListEmp st=(ArrayListEmp)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.age);
        }

    }
}

