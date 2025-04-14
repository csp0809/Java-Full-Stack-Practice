public class sum2 {
    public static void main(String[] args) {
        int no,rem,sum=0;
        no = Integer.parseInt(args[0]);
        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.print(sum);
    }
    
}