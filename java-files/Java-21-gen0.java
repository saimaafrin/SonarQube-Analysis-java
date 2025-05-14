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
        Map<String, String> morseCodeMapper = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            morseCodeMapper.put(String.valueOf(c), generateMorseCode(c));
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String morseCode = "";
            for (int j = 0; j < word.length(); j++) {
                morseCode += morseCodeMapper.get(String.valueOf(word.charAt(j)));
            }

            if (count == 0) {
                count++;
            }

            if (!morseCode.equals(morseCodeMapper.get(words[i]))) {
                count++;
           
                morseCodeMapper.put(words[i], morseCode);
            }
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