import java.util.*;

class Problem {
    /**
     * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter,
     * return the number of different transformations among all words.
     *
     * Example:
     * uniqueMorseRepresentations(["gin","zen","gig","msg"]) -> 2
     * uniqueMorseRepresentations(["a"]) -> 1
     */
    public int uniqueMorseRepresentations(String[] words)  {
        // Define the Morse Code mapping
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                              ".--","-.","-..-","-.--","--.."};

        Set<String> morseWords = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            // Iterate over each character in the word
            for (char c : word.toCharArray()) {
                // Find the Morse code for the character and add it to the StringBuilder
                sb.append(morseCode[c - 'a']);
            }
            // Add the morse code for the word to the set
            morseWords.add(sb.toString());
        }

        // Return the number of unique Morse words
        return morseWords.size();
    }
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.uniqueMorseRepresentations(new String[]{"hello", "world", "hello"}) == 2;
        assert solution.uniqueMorseRepresentations(new String[]{"abc", "def", "ghi"}) == 3;
        assert solution.uniqueMorseRepresentations(new String[]{"aaa", "aaa", "aaa"}) == 1;
        System.out.println("All tests passed");
    }
}