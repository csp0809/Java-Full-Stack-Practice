class Pract2
{
    public static void main(String args[])
{
    String  name;
    int id;
    double fees;
    name=args[0];
    id = Integer.parseInt(args[1]);
    fees = Double.parseDouble(args[2]);
    System.out.println("name:"+name);
    System.out.println("id:"+id);
    System.out.println("fees:"+fees);

}
}