// class Vehicle{
//     void run(){
//       System.out.println("Running....");
//     }
//   }
//   class Bike extends Vehicle{
//     public static void main(String[] args) {
//       Bike o=new Bike();
//       o.run();
//     }
//   }

// class Vehicle{
//   void run(){
//     System.out.println("Running...");
//   }
// }
// class Bike extends Vehicle{
//   public static void main(String[] args) {
//     Bike b=new Bike();
//     b.run();
//   }
// }

class Arith{
  void add(){
    int a=32,b=23;
    System.out.println("Additon is: "+(a+b));
  }
}
class Calc extends Arith{
  public static void main(String[] args) {
    Calc c= new Calc();
    c.add();
  }
}