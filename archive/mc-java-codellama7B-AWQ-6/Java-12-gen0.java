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
        SimpleDateFormat df = new SimpleDateFormat("MM dd yyyy");
        String[] dateTokens = date.split(" ");
        Calendar cal = Calendar.getInstance();
        Date d = null;
        try {
            d = df.parse(dateTokens[0] + " " + dateTokens[1] + " " + dateTokens[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cal.setTime(d);
        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            return "Monday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
            return "Tuesday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 3) {
            return "Wednesday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 4) {
            return "Thursday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 5) {
            return "Friday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 6) {
            return "Saturday";
        } else if (cal.get(Calendar.DAY_OF_WEEK) == 7) {
            return "Sunday";
        }
        return null;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert convertDatesToWeekdays("02 05 2024").equals("February 5, 2024 is a Monday");
        assert convertDatesToWeekdays("01 12 2023").equals("January 12, 2023 is a Thursday");
        assert convertDatesToWeekdays("09 14 2013").equals("September 14, 2013 is a Saturday");
        System.out.println("All tests passed");
    }
}