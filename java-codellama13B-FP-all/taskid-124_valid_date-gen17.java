import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have to write a function which validates a given date string and
    // returns true if the date is valid otherwise false.
    // The date is valid if all of the following rules are satisfied:
    // 1. The date string is not empty.
    // 2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    // 3. The months should not be less than 1 or higher than 12.
    // 4. The date should be in the format: mm-dd-yyyy
    // >>> validDate(("03-11-2000"))
    // (true)
    // >>> validDate(("15-01-2012"))
    // (false)
    // >>> validDate(("04-0-2040"))
    // (false)
    // >>> validDate(("06-04-2020"))
    // (true)
    // >>> validDate(("06/04/2020"))
    // (false)
    public static boolean validDate(String date) {

        // Write your code here.
        // Validating the date using regular expression.
        // "(\d{2})-(\d{2})-(\d{4})"
        String regex = "(\\d{2})-(\\d{2})-(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()){
            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            // Validating the year.
            if (Integer.parseInt(year) <= 0 || Integer.parseInt(year) > 2100)
                return false;

            // Validating the month.
            if (Integer.parseInt(month) <= 0 || Integer.parseInt(month) > 12)
                return false;

            // Validating the day.
            int[] daysInMonth = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (Integer.parseInt(month) == 2)
                // Checking for leap year.
                if (Integer.parseInt(year) % 4 == 0){
                    if (Integer.parseInt(day) > 29 || Integer.parseInt(day) <= 0)
                        return false;
                }
            else if (Integer.parseInt(day) > daysInMonth[Integer.parseInt(month)] || Integer.parseInt(day) <= 0)
                return false;

            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(validDate(("03-11-2000")) == (true));
    assert(validDate(("15-01-2012")) == (false));
    assert(validDate(("04-0-2040")) == (false));
    assert(validDate(("06-04-2020")) == (true));
    assert(validDate(("01-01-2007")) == (true));
    assert(validDate(("03-32-2011")) == (false));
    assert(validDate(("")) == (false));
    assert(validDate(("04-31-3000")) == (false));
    assert(validDate(("06-06-2005")) == (true));
    assert(validDate(("21-31-2000")) == (false));
    assert(validDate(("04-12-2003")) == (true));
    assert(validDate(("04122003")) == (false));
    assert(validDate(("20030412")) == (false));
    assert(validDate(("2003-04")) == (false));
    assert(validDate(("2003-04-12")) == (false));
    assert(validDate(("04-2003")) == (false));
    }

}
