import java.util.*;
public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();

        list.add("Rahul");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Rahul");

        Iterator itr=list.iterator();  

        while(itr.hasNext()){  
         System.out.println(itr.next());  
      
    }
}
}
