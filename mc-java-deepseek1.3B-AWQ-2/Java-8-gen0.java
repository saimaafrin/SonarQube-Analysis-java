import java.util.*;

class Problem {

    /**
     * Count the number of words in the given word list that have the given prefix.
     * 
     * @param wordList: a list of words
     * @param prefix: the prefix string
     * @return the number of words with the given prefix
     * 
     * Example:
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "ba")
     * 2
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "b")
     * 3
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "band")
     * 1
     */
    public static int countPrefixWords(List<String> wordList, String prefix)  {
        // Initialize counter
        int counter = 0;

        // Iterate over each word in wordList
        for (String word : wordList) {
            // If the current word starts with the prefix, increment counter
            if (word.startsWith(prefix)) {
                counter++;
            }
       
        }
        // Return counter
        return counter;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countPrefixWords(Arrays.asList("apple", "ape", "april", "ant", "an"), "ap") == 3;
        assert countPrefixWords(Arrays.asList("cat", "cap", "cape", "camp"), "ca") == 4;
        assert countPrefixWords(Arrays.asList("dog", "dodge", "dot", "dough"), "do") == 4;
        System.out.println("All tests passed");
    }
}