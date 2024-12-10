/*public class test {
    public static void main(String[] args) {
        int no,flag=0,i;
        no=Integer.parseInt(args[0]);
        for(i=2;i<no;i++){
            if(no%i==0){
            flag=1;
            break;
            }}
            if(flag==0){
                System.out.println("Prime Number.");
            }
            else
            System.out.println("Not a prime number");
    }
    
}
*/
public class test {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);

        if(age>60){
            System.out.println("Senior Citizen.");
        }
        else if(age>45){
            System.out.println("Middle aged Citizen.");}
        else if(age>18){
            System.out.println("Adult Citizen.");}
        else if(age>13){
            System.out.println("Teenager/minor.");}
        else{
            System.out.println("Child.");}
    }
}
