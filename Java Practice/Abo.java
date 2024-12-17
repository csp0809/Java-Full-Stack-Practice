// public class Abo
// {  
// public enum Season
//  {
//  WINTER, SPRING, SUMMER, FALL 
// }  
// public static void main(String[] args) 
// {  
// for (Season s : Season.values())  
// System.out.println(s);  
// }
// }  


// public class Abo {

//     public enum Season{
//         WINTER,SUMMER,RAINY
//     }
//     public static void main(String[] args) {
//         for(Season s:Season.values()){
//             System.out.println(s);
//         }
//     }
// }

public class Abo {

    public enum Season{
        WINTER,SUMMER,RAINY
    }
    public static void main(String[] args) {
        Season s=Season.SUMMER;
        switch (s) {
            case SUMMER:
                System.out.println("Summer");
                break;
        
            default:
            
                break;
        }
    }
}
