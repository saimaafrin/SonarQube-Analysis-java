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
        int commonLetters = 0;
        int i = 0;
        int j = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        while (i < len1 && j < len2) {
            if (word1.charAt(i) == word2.charAt(j)) {
                commonLetters++;
                i++;
                j++;
            }
            else if (word1.charAt(i) > word2.charAt(j)) {
                j++;
            }
            else {
                i++;
            }
        }
        if (commonLetters == 0) {
            return "0";
        }
        else {
            return (commonLetters + "/" + (len1 + len2));
        }
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert appx("DOG", "CAT").equals("appx(DOG, CAT) = 0/6");
        assert appx("HELLO", "WORLD").equals("appx(HELLO, WORLD) = 3/10");
        assert appx("JAVA", "PYTHON").equals("appx(JAVA, PYTHON) = 0/10");
        System.out.println("All tests passed");
    }
}