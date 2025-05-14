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
        Map<String, String> morseCode = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                         ".--","-.","-..-","-.--","--..","-----","----.","-----"};

        for(int i=0; i<26; i++) {
            morseCode.put(Character.toString((char)('a' + i)), morse[i]);
        }

        int count = 0;

        for(String word : words) {
            String morseWord = "";
            for(char c : word.toCharArray()) {
                morseWord += morseCode.get(Character.toString(c));
           
            }
            count += uniqueMorseWord(morseWord);
        }

        return count;
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