public class Emp {
    private int empcode;
    public int getEmpcode()
    {
        return empcode;
    }
    public void setEmpcode(int empcode)
    {
        this.empcode=empcode;
    }
}
class Department
{
    public static void main(String[] args) {
        Emp ee = new Emp();
        ee.setEmpcode(1001);
        System.out.println("ID:"+ee.getEmpcode());
    }
}
