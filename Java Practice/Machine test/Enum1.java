public class Enum1 {
    enum Day
{
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}  
public static void main(String args[])
{  
Day day=Day.MONDAY;  
switch(day)
{  
case SUNDAY:   
 System.out.println("sunday");  
 break;  
case FRIDAY:   
 System.out.println("friday");  
 break;  
case SATURDAY:   
 System.out.println("saturday");  
 break;  

default:  
System.out.println("other day");  	
break;
}  }
}
