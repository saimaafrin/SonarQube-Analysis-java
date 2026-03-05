import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Problem {
    /**
     * Given a date in the format "MM dd yyyy", return the weekday of the date.
     * 
     * Example:
     * >>> convertDatesToWeekdays("11 15 1997")
     * "November 15, 1997 is a Saturday"
     * >>> convertDatesToWeekdays("01 01 2000")
     * "January 1, 2000 is a Saturday"
     * >>> convertDatesToWeekdays("07 04 1998")
     * "July 4, 1998 is a Saturday"
     */
    public static String convertDatesToWeekdays(String date)  {
        String[] dateParts = date.split(" ");
        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        String weekdayString = "";
        switch (weekday) {
            case 1:
                weekdayString = "Sunday";
                break;
            case 2:
                weekdayString = "Monday";
                break;
            case 3:
                weekdayString = "Tuesday";
                break;
            case 4:
                weekdayString = "Wednesday";
                break;
            case 5:
                weekdayString = "Thursday";
                break;
            case 6:
                weekdayString = "Friday";
                break;
            case 7:
                weekdayString = "Saturday";
                break;
        }
        return date + " is a " + weekdayString;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert convertDatesToWeekdays("02 05 2024").equals("February 5, 2024 is a Monday");
        assert convertDatesToWeekdays("01 12 2023").equals("January 12, 2023 is a Thursday");
        assert convertDatesToWeekdays("09 14 2013").equals("September 14, 2013 is a Saturday");
        System.out.println("All tests passed");
    }
}