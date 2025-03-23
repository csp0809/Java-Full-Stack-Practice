import java.util.*;

public class pract {
    int id,age;
    String nm;

    pract(int id, int age, String nm){
        this.id=id;
        this.nm=nm;
        this.age=age;
    }
}
class p1{
    public static void main(String[] args) {
        pract e1= new pract(101, 10, "Chaitanya");
        pract e2= new pract(102, 12, "gir");

        ArrayList<pract> l=new ArrayList<>();
        l.add(e1);
        l.add(e2);

        Iterator itr=l.iterator();

        while (itr.hasNext()) {
            pract s=(pract)itr.next();
            System.out.println(s.id+" "+s.age+" "+s.nm);
        }
    }
}
