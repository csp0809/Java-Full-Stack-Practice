public class rangesum {
    public static void main(String[] args) {
        int a,b,sum=0,i;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        for(i=a;i<=b;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }

    
}
