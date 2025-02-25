import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string representing a sentence,
    // the sentence contains some words separated by a space,
    // and you have to return a string that contains the words from the original sentence,
    // whose lengths are prime numbers,
    // the order of the words in the new string should be the same as the original one.
    // Example 1:
    // >>> wordsInSentence(("This is a test"))
    // ("is")
    // Example 2:
    // >>> wordsInSentence(("lets go for swimming"))
    // ("go for")
    // Constraints:
    // * 1 <= len(sentence) <= 100
    // * sentence contains only letters
    public static String wordsInSentence(String sentence) {

        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        // Create a Scanner
        Scanner sc = new Scanner(sentence);
        // Loop over the sentence
        while(sc.hasNext()){
            // Add the word to the ArrayList
            list.add(sc.next());
        }
        // Create a second ArrayList
        ArrayList<String> primeWords = new ArrayList<>();
        // Loop over the ArrayList
        for(String word : list){
            // Check if the word length is a prime number
            if(isPrime(word.length())){
                // Add the word to the second ArrayList
                primeWords.add(word);
            }
        }
        // Join the second ArrayList
        String result = String.join(" ", primeWords);
        // Return the result
        return result;
    }
    public static void main(String[] args) {
    assert(wordsInSentence(("This is a test")).equals(("is")));
    assert(wordsInSentence(("lets go for swimming")).equals(("go for")));
    assert(wordsInSentence(("there is no place available here")).equals(("there is no place")));
    assert(wordsInSentence(("Hi I am Hussein")).equals(("Hi am Hussein")));
    assert(wordsInSentence(("go for it")).equals(("go for it")));
    assert(wordsInSentence(("here")).equals(("")));
    assert(wordsInSentence(("here is")).equals(("is")));
    }

}
