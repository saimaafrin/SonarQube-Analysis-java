class Problem {
    /**
     * Given a positive integer Y indicating the start year, and a positive integer N,
     * this function finds the Nth leap year after the start year Y.
     *
     * @param Y The start year.
     * @param N The position of the leap year to find.
     * @return The Nth leap year after the start year Y.
     *
     * Example:
     * findNthLeapYear(2000, 4) => 2008
     * findNthLeapYear(1996, 10) => 2032
     */
    public static int findNthLeapYear(int Y, int N)  {
        // Initialize counter for leap years
        int leapYears = 0;

        // Loop over years from start to end
        for (int year = Y; year <= 2100; year++) {
            // Check if this year is a leap year
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                leapYears++;
           
            }
            
            // If we found the leap year, count the others
            if (leapYears == N) {
                return year;
            }
        }

        // If not found the desired leap year, return 0
        return 0;
    }
    public static void main(String[] args) {
        // Test the function with the examples from the comment
        assert findNthLeapYear(2000, 4) == 2012;
        assert findNthLeapYear(1996, 10) == 2032;
        assert findNthLeapYear(2000, 1) == 2000;
        System.out.println("All tests passed");
    }
}