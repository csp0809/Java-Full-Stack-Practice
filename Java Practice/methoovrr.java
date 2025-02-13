// class Vehicle{  
//     void run(){System.out.println("Vehicle is running");}  
//   }  
//   //Creating a child class  
//   class Bike extends Vehicle{  
//     public static void main(String args[]){  
//     //creating an instance of child class  
//     Bike obj = new Bike();  
//     //calling the method with child class instance  
//     obj.run();  
//     }  
//   }  


//method overriding 

// class Vehicle{
//   void run(){
//     System.out.println("runining.....");
//   }
// }
// class Bike extends Vehicle{
//   public static void main(String[] args) {
//     Bike o=new Bike();
//     o.run();
//   }
// }

//method overriding

class Vehicle{
  void run(){
    System.out.println("Running....");
  }
}
class Bike extends Vehicle{
  public static void main(String[] args) {
    Bike o=new Bike();
    o.run();
  }
}