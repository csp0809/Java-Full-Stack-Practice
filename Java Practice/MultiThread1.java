public class MultiThread1 {
    public static void main(String[] args) {
        int i;
        Thread t=new Thread();
        t.start();
        try{
            for(i=1;i<=10;i++){
                
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
