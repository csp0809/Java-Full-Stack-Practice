class Gen<T>
{  
T obj;  
void add(T obj)
{
this.obj=obj;
}  
T get()
{
return obj;
}  
}  
class TestGenerics
{  
public static void main(String args[])
{  
Gen<Integer> m=new Gen<Integer>();  
m.add(2);  
//m.add("xyz");//Compile time error  
System.out.println(m.get());  
}}  
