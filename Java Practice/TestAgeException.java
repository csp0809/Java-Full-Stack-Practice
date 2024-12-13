public class TestAgeException extends Exception{
    TestAgeException(String s){
        super(s);
    }
}
class AgeTracker{
    public static void ageCheck(int age) throws TestAgeException{
        if(age>18){
            System.out.println("Ok to vote");
        }
        else{
            throw new TestAgeException("Not ok to vote");
        }
    }
    public static void main(String[] args) {
        try {
            ageCheck(11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
