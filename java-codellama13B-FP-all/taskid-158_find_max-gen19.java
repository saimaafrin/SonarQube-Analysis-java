import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that accepts an array array list of strings.
    // The array list contains different words. Return the word with maximum number
    // of unique characters. If multiple strings have maximum number of unique
    // characters, return the one which comes first in lexicographical order.
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"of", (String)"string"))))
    // ("string")
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"enam", (String)"game"))))
    // ("enam")
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"aaaaaaa", (String)"bb", (String)"cc"))))
    // ("aaaaaaa")
    public static String findMax(ArrayList<String> words) {

        final String[][] $jscomp$lookup = new String[256][1];
        {
            int[] v0 = new int[256];
            {
                for (int $jscomp$index = 0; $jscomp$index != 256; ++$jscomp$index) {
                    v0[$jscomp$index] = -1;
                }
            };
            int $jscomp$index2 = 0;
            for (String $jscomp$iter : words) {
                int[] v2 = new int[256];
                {
                    for (int $jscomp$index = 0; $jscomp$index != 256; ++$jscomp$index) {
                        v2[$jscomp$index] = v0[$jscomp$index];
                    }
                };
                int $jscomp$index3 = 0;
                for (int i = 0; i < $jscomp$iter.length(); ++i) {
                    int v4 = $jscomp$iter.charAt(i);
                    if (v4 > 255) {
                        v4 = 255;
                    }
                    if (v2[v4] == -1) {
                        v2[v4] = i;
                    } else {
                        v2[v4] = Math.min(v2[v4], i);
                    }
                }
                {
                    for (int $jscomp$index = 0; $jscomp$index != 256; ++$jscomp$index) {
                        v0[$jscomp$index] = Math.min(v0[$jscomp$index], v2[$jscomp$index]);
                    }
                };
                $jscomp$lookup[$jscomp$index2] = v2;
                ++$jscomp$index2;
            }
        }
        String[] v1 = new String[256];
        {
            for (int $jscomp$index = 0; $jscomp$index != 256; ++$jscomp$index) {
                v1[$jscomp$index] = (String)words.get($jscomp$index);
            }
        };
        String v3 = v1[0];
        int v5 = v1[0].length();
        for (int i = 1; i != v1.length; ++i) {
            String v6 = v1[i];
            if (v6.length() > v5) {
                v5 = v6.length();
                v3 = v6;
            } else if (v6.length() == v5) {
                int v7 = 0;
                for (int j = 0; j != 256; ++j) {
                    int v8 = $jscomp$lookup[i][j];
                    int v9 = $jscomp$lookup[0][j];
                    if (v8 != -1 && v8 < v9) {
                        ++v7;
                    } else if (v8 != -1 && v8 > v9) {
                        v7 = -1;
                        break;
                    }
                }
    }
    public static void main(String[] args) {
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"of", (String)"string")))).equals(("string")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"enam", (String)"game")))).equals(("enam")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"aaaaaaa", (String)"bb", (String)"cc")))).equals(("aaaaaaa")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"abc", (String)"cba")))).equals(("abc")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"play", (String)"this", (String)"game", (String)"of", (String)"footbott")))).equals(("footbott")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"we", (String)"are", (String)"gonna", (String)"rock")))).equals(("gonna")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"we", (String)"are", (String)"a", (String)"mad", (String)"nation")))).equals(("nation")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"this", (String)"is", (String)"a", (String)"prrk")))).equals(("this")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"b")))).equals(("b")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"play", (String)"play", (String)"play")))).equals(("play")));
    }

}
