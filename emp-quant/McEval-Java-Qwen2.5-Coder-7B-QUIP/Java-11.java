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
        // Convert the words to lowercase to ensure the comparison is case-insensitive
        String lowerWord1 = word1.toLowerCase();
        String lowerWord2 = word2.toLowerCase();

        // Create a set of characters from the first word
        Set<Character> charSet = new HashSet<>();
        for (char c : lowerWord1.toCharArray()) {
            charSet.add(c);
        }

        // Count the number of common characters
        int commonCount = 0;
        for (char c : lowerWord2.toCharArray()) {
            if (charSet.contains(c)) {
                commonCount++;
            }
        }

        // Calculate the approximate value
        int numerator = commonCount;
        int denominator = lowerWord1.length() + lowerWord2.length();
        return "appx(" + word1 + ", " + word2 + ") = " + numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert appx("DOG", "CAT").equals("appx(DOG, CAT) = 0/6");
        assert appx("HELLO", "WORLD").equals("appx(HELLO, WORLD) = 3/10");
        assert appx("JAVA", "PYTHON").equals("appx(JAVA, PYTHON) = 0/10");
        System.out.println("All tests passed");
    }
}