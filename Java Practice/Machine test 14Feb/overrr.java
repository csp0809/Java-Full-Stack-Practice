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