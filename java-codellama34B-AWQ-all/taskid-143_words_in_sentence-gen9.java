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

        // split sentence into an array of words
        String[] words = sentence.split(" ");

        // create an ArrayList of prime numbers, using the Sieve of Eratosthenes
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] sieve = new boolean[100];
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i < Math.sqrt(sieve.length); i++) {
            if (sieve[i]) {
                for (int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = false;
                }
            }
        }
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                primeNumbers.add(i);
            }
        }

        // create a StringBuilder to hold the string
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (primeNumbers.contains(word.length())) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
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
