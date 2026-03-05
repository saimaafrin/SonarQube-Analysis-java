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
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> morseCodeSet = new HashSet<>();
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            morseCodeSet.add(morse[c - 'a']);
        }
        Set<String> uniqueMorseRepresentations = new HashSet<>();
        for (String word : words) {
            StringBuilder morseCode = new StringBuilder();
            for (char c : word.toCharArray()) {
                morseCode.append(morse[c - 'a']);
            }
            uniqueMorseRepresentations.add(morseCode.toString());
        }
        return uniqueMorseRepresentations.size();
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