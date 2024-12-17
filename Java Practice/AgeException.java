//throw keyword
//custom exception
// class AgeException extends Exception{
//     AgeException(String s)
//     {
//         super(s);
//     }
// }
// class AgeTracker
// {
//     public static void ageCheck(int age)throws AgeException {
//         if(age>=18)
//         {
//             System.out.println("youre eligible to vote");
//         }
//         else
//         {
//             throw new AgeException("Youre not eligible to vote");
//         }
//     }
//     public static void main(String[] args) {
//         try
//         {
//             ageCheck(12);
//         }
//         catch(AgeException e)
//         {
//             System.out.println(e);
//         }
//     }
// }


// public class AgeException extends Exception{
//     AgeException(String s){
        
//     super(s);
//     }
// }
// class AgeTracker{
//     public static void ageCheck(int age)throws AgeException{
//         if(age>18){
//             System.out.println("Eligible");
//         }
//         else
//         {
//             throw new AgeException("not");
//         }
//     }
//     public static void main(String[] args) {
//         try {
//             ageCheck(13);
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println(e);
//         }
//     }
// }

public class AgeException extends Exception{

    AgeException(String s){
        super(s);
    }
}
class AgeTracker{
    public static void ageCheck(int age)throws AgeException{
        if(age>18){
            System.out.println("Eligible");
        }
        else{
            throw new AgeException("Not");
        }
    }
    public static void main(String[] args) {
        try {
            ageCheck(14);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}