//method overriding-- method having same name and same type of parameter is called method.
//It is achieved in simple and heirarchical Inheritance
// public class Methoo1 {
//     void display()
//     {
//         System.out.println("display called from parent class.");
//     }
// }
// class Child extends Methoo1
// { @Override
//     void display()
//     {
//         super.display();//parent class method called
//         System.out.println("Display called from child class.");
//     }
//     public static void main(String[] args) {
//         Child cc=new Child();
//         cc.display();
//     }
// }

public class Parent { // Follow Java naming conventions (class names should start with uppercase)
    void display() {
        System.out.println("Display called from the parent class.");
    }
}

class Child extends Parent { // Follow Java naming conventions
    @Override
    void display() {
        super.display(); // Call the parent class method
        System.out.println("Display called from the child class.");
    }

    public static void main(String[] args) {
        Child cc = new Child(); // Create an object of the child class
        cc.display(); // Call the overridden method
    }
}