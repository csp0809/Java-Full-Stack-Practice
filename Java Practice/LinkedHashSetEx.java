import java.util.*;
class Book{
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
}
public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs=new LinkedHashSet<>();

        Book b1=new Book(101,"Let us C" , "Yashwant K","BPB", 8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","McGraw Hill",4);  
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  

        hs.add(b1);
        hs.add(b2);
        hs.add(b3);

        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
