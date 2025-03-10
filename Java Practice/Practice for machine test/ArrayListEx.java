// ArrayList example

// import java.util.*;

// public class ArrayListEx {

//     int id;
//     String nm;
//     int age;
//     ArrayListEx(int id, String nm, int age){
//         this.id=id;
//         this.nm=nm;
//         this.age=age;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         ArrayListEx e1=new ArrayListEx(1, "Chait", 26); 
//         ArrayListEx e2=new ArrayListEx(2, "Chait1", 26); 
//         ArrayListEx e3=new ArrayListEx(3, "Chait2", 26);
        
//         ArrayList<ArrayListEx> a= new ArrayList<ArrayListEx>();
//         a.add(e1);
//         a.add(e2);
//         a.add(e3);

//         Iterator itr=a.iterator();

//         while (itr.hasNext()) {
//             ArrayListEx st=(ArrayListEx)itr.next();
//             System.out.println(st.id+" "+st.nm +" "+st.age);
//         }

//     }
// }


// // ArrayList example
// import java.util.*;

// public class ArrayListEx {

//     int id;
//     String nm;
//     int age;
//     ArrayListEx(int id, String nm, int age){
//         this.id=id;
//         this.nm=nm;
//         this.age=age;

//     }
// }

// class Test{
//     public static void main(String[] args) {
//         ArrayListEx e1=new ArrayListEx(1,"chait" , 26);
//         ArrayListEx e2=new ArrayListEx(2,"chait2" , 26);
//         ArrayListEx e3=new ArrayListEx(3,"chait1" , 26);

//         ArrayList<ArrayListEx> al= new ArrayList<ArrayListEx>();
//         al.add(e1);
//         al.add(e2);
//         al.add(e3);

//         Iterator itr=al.iterator();

//         while (itr.hasNext()) {
//             ArrayListEx s= (ArrayListEx)itr.next();
//             System.out.println(s.id+" "+s.nm+" "+s.age );
//         }
//     }
// }

// ArrayList example
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
        ArrayListEx e1=new ArrayListEx(1,"chait" , 26);
        ArrayListEx e2=new ArrayListEx(2,"chait2" , 26);
        ArrayListEx e3=new ArrayListEx(3,"chait1" , 26);

        ArrayList<ArrayListEx> al= new ArrayList<ArrayListEx>();
        al.add(e1);
        al.add(e2);
        al.add(e3);

        Iterator itr=al.iterator();

        while (itr.hasNext()) {
            ArrayListEx s= (ArrayListEx)itr.next();
            System.out.println(s.id+" "+s.nm+" "+s.age );
        }
    }
}