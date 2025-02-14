

public class Enum11 {
    enum season
    {
        summer, winter, rainy
    };
    
    public static void main(String args[]){
    season Season= season.summer;
    switch(Season){
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
