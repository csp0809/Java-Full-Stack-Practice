public class TestMember {
    private int data =30;
    class Inner{
        public void msg()
        {
            System.out.println(data);
        }
    }
}
class Pract{
    public static void main(String[] args) {
        TestMember obj = new TestMember();
        TestMember.Inner in=obj.new Inner();
        in.msg();
    }
}
