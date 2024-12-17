// interface I1{
//     void add();
// }
// interface I2{
//     int area(int x, int y);
// }
// class TestInt implements I1,I2{
//     public void add(){
//         int x=20,y=10;
//         System.out.println(x-y);
//     }
//     public int area(int x,int y){
//         int z=x*y;
//         return z;
//     }
//     public static void main(String[] args) {
//         Pract p=new Pract();
//         p.add();
//         int a=p.area(20, 2);
//         System.out.println(a);
//     }
// }

interface I1{
    void add();
}
interface I2{
    int area(int a, int b);
}
public class TestInt implements I1,I2{
    public void add(){
        int x=10,y=20;
        System.out.println(x+y);
    }
    public int area(int x, int y){
        int z=x*y;
        return z;
    }
    public static void main(String[] args) {
        TestInt oo=new TestInt();
        oo.add();
        int a=oo.area(5, 10);
        System.out.println(a);
    }
}