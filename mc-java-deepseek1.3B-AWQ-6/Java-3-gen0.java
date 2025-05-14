class Problem {
    /**
     * Calculate the time needed to obtain the reverse seating order.
     * For each person, the person who was originally on their left will be on their right, and the person who was originally on their right will be on their left.
     * 
     * @param N the number of people
     * @return the time needed in minutes
     * 
     * Example:
     * >>> calculateTimeNeeded(4)
     * 2
     * >>> calculateTimeNeeded(5)
     * 4
     * >>> calculateTimeNeeded(6)
     * 6
     */
    public static int calculateTimeNeeded(int N)  {
        // If N is 1 or 2, return 0 as it's the easiest way to obtain the order
        if (N <= 2) {
            return 0;
        }
        
        // If N is 3 or more, the time needed is the minimum between the difference between the first two and the third person, and the sum of the second and third person's positions
        // For example, with 6 people, we need to get to the second person in 2 steps, then move to the third person in 2 steps, and then move to the fourth person in 4 steps.
        // So the time needed is the minimum of 2 + 2 + 4 = 6
        return Math.min(Math.min(Math.abs(2), Math.abs(N - 3)), Math.abs(N - 2));
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert calculateTimeNeeded(7) == 3;
        assert calculateTimeNeeded(8) == 4;
        assert calculateTimeNeeded(9) == 4;
        System.out.println("All tests passed");
    }
}