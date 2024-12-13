public class Testoverride {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Testoverride {
    @Override
    void display() {
        super.display();
        System.out.println("display of child");
    }
    public static void main(String[] args) {
        Child d = new Child();
        d.display();
    }
}


