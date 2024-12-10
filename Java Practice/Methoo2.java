public class Methoo2 {
    int no1;

    Methoo2(int x) {
        no1 = x;
    }
}

class B extends Methoo2 {
    int no2;

    B(int x, int y) {
        super(x);
        no2 = y;
    }

    void max() {
        if (no1 > no2) {
            System.out.println(no1 + "is max");
        } else {
            System.out.println(no2 + "is max");
        }
    }

    public static void main(String[] args) {
        {
            B obj = new B(11, 12);
            obj.max();
        }
    }
}
