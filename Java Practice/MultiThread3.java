public class MultiThread3 implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {
        MultiThread3 m1=new MultiThread3();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
