public class reverse {
    public static void main(String[] args) {
        int no,rem;
        no = Integer.parseInt(args[0]);
        while(no>0)
        {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
    
}
