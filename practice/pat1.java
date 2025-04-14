public class pat1 {
    public static void main(String[] args) {
        int i,j,k,no;
        no=Integer.parseInt(args[0]);
        for(i=no;i>=1;i--)
        {
            for(j=no;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 

