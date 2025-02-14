

public class CustomEx extends Exception{
    CustomEx(String s){
        super(s);
    }
}
class AgeTracker{
    public static void ageCheck(int age)throws CustomEx{
        if(age>18){
            System.out.println("Eligible");
        }
        else{
            throw new CustomEx("Not");
        }
    }
    public static void main(String[] args) {
        try {
            ageCheck(19);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
