import java.util.*;
public class linkedListEx {
        public static void main(String[] args) {
            LinkedList<String> al=new LinkedList<>();
            al.add("Chait");
            al.add("Ganu");
            al.add("Chait");
            al.add("Ajay");

            Iterator<String> itr=al.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
}
