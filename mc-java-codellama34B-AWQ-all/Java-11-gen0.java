import java.util.*;

class Problem {
    /**
     * The approximate value is calculated by counting the number of common letters
     * and dividing it by the sum of the lengths of the two words.
     *
     * @param word1 The first word.
     * @param word2 The second word.
     * @return The approximate value as a reduced fraction.
     *
     * >>> appx("CAR", "CART")
     * "appx(CAR, CART) = 6/7"
     * >>> appx("TURKEY", "CHICKEN")
     * "appx(TURKEY, CHICKEN) = 4/13"
     * >>> appx("MONEY", "POVERTY")
     * "appx(MONEY, POVERTY) = 1/3"
     * >>> appx("ROUGH", "PESKY")
     * "appx(ROUGH, PESKY) = 0"
     * >>> appx("A", "A")
     * "appx(A, A) = 1"
     */
    public static String appx(String word1, String word2)  {
        // Your code here
        int common = commonLetters(word1, word2);
        int sum = word1.length() + word2.length();
        String fraction = String.format("%d/%d", common, sum);
        return String.format("appx(%s, %s) = %s", word1, word2, fraction);
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert appx("DOG", "CAT").equals("appx(DOG, CAT) = 0/6");
        assert appx("HELLO", "WORLD").equals("appx(HELLO, WORLD) = 3/10");
        assert appx("JAVA", "PYTHON").equals("appx(JAVA, PYTHON) = 0/10");
        System.out.println("All tests passed");
    }
}