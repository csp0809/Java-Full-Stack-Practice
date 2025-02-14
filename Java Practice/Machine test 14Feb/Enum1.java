// public class Enum1 {
//     enum Day
// {
//  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
// }  
// public static void main(String args[])
// {  
// Day day=Day.MONDAY;  
// switch(day)
// {  
// case SUNDAY:   
//  System.out.println("sunday");  
//  break;  
// case FRIDAY:   
//  System.out.println("friday");  
//  break;  
// case SATURDAY:   
//  System.out.println("saturday");  
//  break;  

// default:  
// System.out.println("other day");  	
// break;
// }  }
// }

public class Enum1 {

    enum season
    {
        summer, winter, rainy
    };
    public static void main(String[] args) {
        season Season=season.summer;
        switch (Season) {
            case winter:
                System.out.println("Season is : Winter");
                break;
            
                case summer:
                System.out.println("Season is : summer");
                break;
            default:
            System.out.println("Enter valid");
                break;
        }
    }
}