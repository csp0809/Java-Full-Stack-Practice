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
//         ArrayListEx e1= new ArrayListEx(1, "CHait", 26);
//         ArrayListEx e2= new ArrayListEx(2, "CHait1", 26);
        
//         ArrayList<ArrayListEx> a= new ArrayList<ArrayListEx>();
//         a.add(e1);
//         a.add(e2);

//         Iterator itr=a.iterator();

//         while (itr.hasNext()) {
//             ArrayListEx s=(ArrayListEx)itr.next();
//             System.out.println(s.id+" "+s.nm+" "+s.age);
//         }

//     }
// }

// import java.util.ArrayList;
// import java.util.Iterator;

// public class ArrayListEx {

//     int id,age;
//     String nm;
//     ArrayListEx(int id, String nm, int age){
//         this.id=id;
//         this.nm=nm;
//         this.age=age;
//     }
    
// }
// class Pract{
//     public static void main(String[] args) {
//         ArrayListEx e1= new ArrayListEx(101, "Chait", 25);
//         ArrayListEx e2= new ArrayListEx(102, "Chait1", 25);

//         ArrayList<ArrayListEx> l=new ArrayList<ArrayListEx>();
//         l.add(e1);
//         l.add(e2);

//         Iterator itr=l.iterator();

//         while (itr.hasNext()) {
//             ArrayListEx s= (ArrayListEx)itr.next();
//             System.out.println(s.id+" "+s.nm+" "+s.age);
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.Iterator;

// public class ArrayListEx {

//     int id,age;
//     String nm;
//     ArrayListEx(int id, String nm, int age){
//         this.id=id;
//         this.nm=nm;
//         this.age=age;
//     }
// }
// class Pract{
//     public static void main(String[] args) {
//         ArrayListEx e1=new ArrayListEx(101, "Chaitanya", 26);
//         ArrayListEx e2=new ArrayListEx(102, "Chait", 26);

//         ArrayList<ArrayListEx> l= new ArrayList<>();
//         l.add(e1);
//         l.add(e2);

//         Iterator itr=l.iterator();

//         while(itr.hasNext()){
//             ArrayListEx s=(ArrayListEx)itr.next();
//             System.out.println(s.id+" "+s.nm+" "+s.age);
//         }
//     }
// }

import java.util.*;


public class ArrayListEx {

    int id,age;
    String nm;

    ArrayListEx(int id, String nm, int age){
        this.id=id;
        this.nm=nm;
        this.age=age;
    }
}
class Pract{
    public static void main(String[] args) {
        ArrayListEx e1=new ArrayListEx(101, "Chaitanya", 25);
        ArrayListEx e2=new ArrayListEx(102, "Chaitanya1", 26);

        ArrayList<ArrayListEx> l=new ArrayList<>();
        l.add(e1);
        l.add(e2);

        Iterator itr=l.iterator();

        while (itr.hasNext()) {
            ArrayListEx s=(ArrayListEx)itr.next();
            System.out.println(s.id+" "+s.nm+" "+s.age);
        }
    }
}