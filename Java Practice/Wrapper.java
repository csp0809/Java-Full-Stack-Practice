// public class Wrapper{    
//     public static void main(String args[]){    
//     //Converting Integer to int   
     
//     Integer a=new Integer(3);    
//     int i=a.intValue();//converting Integer to int  
//     int j=a;//unboxing, now compiler will write a.intValue() internally    
        
//     System.out.println(a+" "+i+" "+j);    
//     }}    
    


//Primitive to Wrapper ex:

// public class Wrapper{  
//     public static void main(String args[]){  
//     //Converting int into Integer  
//     int a=20;  
//     Integer i=Integer.valueOf(a);//converting int into Integer  
//     Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
      
//     System.out.println(a+" "+i+" "+j);  
//     }}  
    
    
// Wrapper to Primitive
public class Wrapper{    
public static void main(String args[]){    
//Converting Integer to int    
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int  
int j=a;//unboxing, now compiler will write a.intValue() internally    
    
System.out.println(a+" "+i+" "+j);    
}}    

