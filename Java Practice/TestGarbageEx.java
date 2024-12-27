public class TestGarbageEx {
    public void finalize(){
        System.out.println("object is garbage collect");
    }
    public static void main(String[] args) {
        TestGarbageEx s1=new TestGarbageEx();
        TestGarbageEx s2=new TestGarbageEx();

        s1=null;
        s2=null;

        System.gc();
    }
}
