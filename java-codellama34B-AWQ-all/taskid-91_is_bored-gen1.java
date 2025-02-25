import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You'll be given a string of words, and your task is to count the number
    // of boredoms. A boredom is a sentence that starts with the word "I".
    // Sentences are delimited by '.', '?' or '!'.
    // For example:
    // >>> isBored(("Hello world"))
    // (0l)
    // >>> isBored(("The sky is blue. The sun is shining. I love this weather"))
    // (1l)
    public static long isBored(String S) {

        int i = 0;
        int count = 0;
        int c = 0;
        while (i < S.length()) {
            if (S.charAt(i) == '.') {
                c = 0;
            }
            if (S.charAt(i) == '?') {
                c = 0;
            }
            if (S.charAt(i) == '!') {
                c = 0;
            }
            if (c == 0) {
                if (S.charAt(i) == 'I') {
                    count += 1;
                }
            }
            c += 1;
            i += 1;
        }
        return (long) count;
    }
    public static void main(String[] args) {
    assert(isBored(("Hello world")) == (0l));
    assert(isBored(("Is the sky blue?")) == (0l));
    assert(isBored(("I love It !")) == (1l));
    assert(isBored(("bIt")) == (0l));
    assert(isBored(("I feel good today. I will be productive. will kill It")) == (2l));
    assert(isBored(("You and I are going for a walk")) == (0l));
    }

}
