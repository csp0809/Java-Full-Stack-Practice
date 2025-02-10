// // default and parameter interface

// interface I1{
//     void add();
// }

// interface I2{
//     int area(int x, int y);
// } 

// public class interf1 implements i1,i2{
//     public void add(){
//         int x=10,y=20;
//         System.out.println(x+y);
//     }
//     public int area(int x, int y){
//         int z=x*y;
//         return z;
//     }
//     public static void main(String[] args) {
//         interf1 i=new interf1();
//         i.add();
//         int a=i.area(12, 2);
//         System.out.println(a);
//     }
// }


// default and parameter interface

interface i1{
    void add();
}
interface i2{
    int area(int x, int y);
}

public class interf1 implements i1,i2{
    public void add(){
        int x=10; int y=20;
        System.out.println(x+y);
    }
    public int area(int x, int y){
        int z =x*y;
        return z;
    }
    public static void main(String[] args) {
        interf1 i= new interf1();
        i.add();
        int a=i.area(30, 2);
        System.out.println(a);
    }
}