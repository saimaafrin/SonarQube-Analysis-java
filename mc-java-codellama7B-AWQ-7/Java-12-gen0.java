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
        // split the date into its parts
        String[] dateParts = date.split(" ");
        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // create a Date from the month, day, and year
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        Date dateToCheck = calendar.getTime();

        // get the weekday of the date
        String weekday = "";
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                weekday = "Sunday";
                break;
            case Calendar.MONDAY:
                weekday = "Monday";
                break;
            case Calendar.TUESDAY:
                weekday = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                weekday = "Wednesday";
                break;
            case Calendar.THURSDAY:
                weekday = "Thursday";
                break;
            case Calendar.FRIDAY:
                weekday = "Friday";
                break;
            case Calendar.SATURDAY:
                weekday = "Saturday";
                break;
        }

        // create a String containing the weekday of the date and the date
        String result = weekday + ", " + dateToCheck;
        return result;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert convertDatesToWeekdays("02 05 2024").equals("February 5, 2024 is a Monday");
        assert convertDatesToWeekdays("01 12 2023").equals("January 12, 2023 is a Thursday");
        assert convertDatesToWeekdays("09 14 2013").equals("September 14, 2013 is a Saturday");
        System.out.println("All tests passed");
    }
}