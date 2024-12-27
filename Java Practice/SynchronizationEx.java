//Synchronization in java is the capability to control the access of multiple threads to any shared resource.    
//If we dont use keyword "synchronized" then both threads will give output at the same time creating confusion, using synchronized keyword will allow only one threat to access the method at a time, and Output we get will be clear.

class Table {
    synchronized void displayTable(int no) {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(500);
                System.out.println(no * i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class A extends Thread {
    Table t1;

    A(Table t1) {
        this.t1 = t1;
    }

    public void run() {
        t1.displayTable(8);
    }
}

class B extends Thread {
    Table t1;

    B(Table t1) {
        this.t1 = t1;
    }

    public void run() {
        t1.displayTable(10);
    }
}

public class SynchronizationEx {
    public static void main(String[] args) {
        Table t = new Table();
        A obj = new A(t);
        obj.start();
        B obj1 = new B(t);
        obj1.start();
    }
}
