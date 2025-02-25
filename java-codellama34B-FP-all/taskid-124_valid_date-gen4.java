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

        String[] dateArr = date.split("-");
        // System.out.println(dateArr[0]);
        // System.out.println(dateArr[1]);
        // System.out.println(dateArr[2]);
        if (dateArr.length != 3) return false;
        if (dateArr[0].length() != 2 || dateArr[1].length() != 2 || dateArr[2].length() != 4) return false;
        int mm, dd, yyyy;
        try {
            mm = Integer.parseInt(dateArr[0]);
            dd = Integer.parseInt(dateArr[1]);
            yyyy = Integer.parseInt(dateArr[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        if (mm < 1 || mm > 12) return false;
        if (mm == 2 && dd > 29) return false;
        if (mm == 2 && dd < 1) return false;
        if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && dd > 31) return false;
        if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && dd < 1) return false;
        if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 30) return false;
        if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd < 1) return false;
        return true;
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
