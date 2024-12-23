import java.util.*;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Chait");
        al.add("Ganu");
        al.add("Chait");
        al.add("Ajay");

        System.out.println("element at 2nd position:"+al.get(2));

        ListIterator<String> itr=al.listIterator();

        System.out.println("Traversing elements in forward direction....");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    
        System.out.println("Traversing elements in reverse direction....");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
