import java.util.*;
public class ArrayListEx {
    
    int id;
    String nm;
    int age;
    ArrayListEx(int id, String nm, int age){
        this.id=id;
        this.nm=nm;
        this.age=age;
    }
}
class Test{
    public static void main(String[] args) {
        ArrayListEx e1= new ArrayListEx(1, "CHait", 26);
        ArrayListEx e2= new ArrayListEx(2, "CHait1", 26);
        
        ArrayList<ArrayListEx> a= new ArrayList<ArrayListEx>();
        a.add(e1);
        a.add(e2);

        Iterator itr=a.iterator();

        while (itr.hasNext()) {
            ArrayListEx s=(ArrayListEx)itr.next();
            System.out.println(s.id+" "+s.nm+" "+s.age);
        }

    }
}