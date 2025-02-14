import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> h=new HashMap<>();
        h.put(100, "Chait1111");
        h.put(101, "Chait111122");
        
        for(Map.Entry m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
