public class MultiThread2 extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String [] args){
        MultiThread2 t1 = new MultiThread2();
        t1.start();
    }
}
