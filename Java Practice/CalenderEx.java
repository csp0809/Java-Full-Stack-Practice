import java.util.*;
import java.util.Calendar;
public class CalenderEx {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("At present  Calender's Year : "+calendar.get(Calendar.YEAR));
        System.out.println("At present  Calender's Day : "+calendar.get(Calendar.DATE));
    }
}
