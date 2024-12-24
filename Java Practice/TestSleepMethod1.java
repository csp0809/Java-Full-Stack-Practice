public class TestSleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        System.out.println("Name of t1: "+ t1.getName());
        TestSleepMethod1 t2 = new TestSleepMethod1();

        t1.start();
        t2.start();
        t1.setName("Chaitanya");
        System.out.println("After changing name of t1: "+ t1.getName());
    }
    
}
