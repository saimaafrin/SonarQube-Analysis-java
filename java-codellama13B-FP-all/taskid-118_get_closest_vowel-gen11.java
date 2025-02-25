import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a word. Your task is to find the closest vowel that stands between 
    // two consonants from the right side of the word (case sensitive).
    // Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    // find any vowel met the above condition. 
    // You may assume that the given string contains English letter only.
    // Example:
    // >>> getClosestVowel(("yogurt"))
    // ("u")
    // >>> getClosestVowel(("FULL"))
    // ("U")
    // >>> getClosestVowel(("quick"))
    // ("")
    // >>> getClosestVowel(("ab"))
    // ("")
    public static String getClosestVowel(String word) {

        List<Integer> vowels=new ArrayList<>();
        List<Integer> consonants=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||
            word.charAt(i)=='o'||word.charAt(i)=='u'){
                vowels.add(i);
            }else if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&
            word.charAt(i)!='o'&&word.charAt(i)!='u'){
                consonants.add(i);
            }
        }
        if(vowels.size()==0) return "";
        int closest=Integer.MAX_VALUE;
        for(int i=0;i<consonants.size();i++){
            for(int j=0;j<vowels.size();j++){
                if(Math.abs(consonants.get(i)-vowels.get(j))<Math.abs(consonants.get(i)-closest)){
                    closest=vowels.get(j);
                }
            }
        }
        return word.substring(closest,closest+1);
    }
    public static void main(String[] args) {
    assert(getClosestVowel(("yogurt")).equals(("u")));
    assert(getClosestVowel(("full")).equals(("u")));
    assert(getClosestVowel(("easy")).equals(("")));
    assert(getClosestVowel(("eAsy")).equals(("")));
    assert(getClosestVowel(("ali")).equals(("")));
    assert(getClosestVowel(("bad")).equals(("a")));
    assert(getClosestVowel(("most")).equals(("o")));
    assert(getClosestVowel(("ab")).equals(("")));
    assert(getClosestVowel(("ba")).equals(("")));
    assert(getClosestVowel(("quick")).equals(("")));
    assert(getClosestVowel(("anime")).equals(("i")));
    assert(getClosestVowel(("Asia")).equals(("")));
    assert(getClosestVowel(("Above")).equals(("o")));
    }

}
