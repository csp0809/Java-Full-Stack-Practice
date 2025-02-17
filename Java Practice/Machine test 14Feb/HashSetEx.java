// import java.util.*;
// public class HashSetEx {
//     int id;
//     String nm,author;
//     int quantity;

//     HashSetEx(int id, String nm, String author, int quantity){
//         this.id=id;
//         this.nm=nm;
//         this.author=author;
//         this.quantity=quantity;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         LinkedHashSet<HashSetEx> h= new LinkedHashSet<HashSetEx>();

//         HashSetEx h1= new HashSetEx(1, "My book", "Me", 1000);
//         HashSetEx h2= new HashSetEx(2, "Me book", "Myself", 1001);
//         HashSetEx h3= new HashSetEx(3, "Myslef book", "I", 1002);

//         h.add(h1);
//         h.add(h2);
//         h.add(h3);
        
//         for(HashSetEx e:h){
//             System.out.println(e.id+" "+e.nm+" "+e.author+" "+e.quantity);
//         }
    
//     }
// }

import java.util.HashSet;

public class HashSetEx {

    int id,quantity;
    String book,author;

    HashSetEx(int id, String book, String author, int quantity){
        this.id=id;
        this.book=book;
        this.author=author;
        this.quantity=quantity;
    }
}
class Pract1{
    public static void main(String[] args) {
        HashSetEx h0=new HashSetEx(1, "myself book", "me",1000);
        HashSetEx h1=new HashSetEx(1, "I book", "myself",1002);
        HashSetEx h2=new HashSetEx(1, "my book", "I",1001);

        HashSet<HashSetEx> h= new HashSet<>();
        h.add(h0);
        h.add(h1);
        h.add(h2);

        for (HashSetEx e : h) {
            System.out.println(e.id+" "+e.book+" "+e.author+" "+e.quantity);
        }
    }
}