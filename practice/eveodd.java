class eveodd
{
    public static void main(String args[])
{
    int no;
    no = Integer.parseInt(args[0]);
    if(no%2 == 0)
    {
        System.out.println(no+":is Even");
    }
    else
    {
        System.out.println(no+":is Odd");
    }

}
}