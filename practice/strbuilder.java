/* 
public class strbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Chaitanya");
        
        s.append(" Welcome.");
        System.out.println(s);
        s.insert(0,"Hi! ");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }    
}

*/

public class strbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Chaitanya");

        str.append(" welcome!");
        System.out.println(str);

        str.insert(0, "Hi! ");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
