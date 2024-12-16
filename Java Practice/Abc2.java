import java.text.*;
import java.util.*;
import java.util.Date.*;
class Abc2 
{
public static void main(String args[])
{
    Date d=new Date();
    System.out.println(d);
     System.out.println(d.getDate());
      System.out.println(d.getDay());
      DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
Date date = new Date();
System.out.println(dateFormat.format(date)); 
System.out.println(d.getHours());
}
}
