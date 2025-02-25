import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string s.
    // if s[i] is a letter, reverse its case from lower to upper or vise versa, 
    // otherwise keep it as it is.
    // If the string contains no letters, reverse the string.
    // The function should return the resulted string.
    // Examples
    // >>> solve(("1234"))
    // ("4321")
    // >>> solve(("ab"))
    // ("AB")
    // >>> solve(("#a@C"))
    // ("#A@c")
    public static String solve(String s) {

        String res = "";
        int n = s.length();
        if(n==0)
            return "";
        int alphaCount = 0;
        for(int i=0;i<n;i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                alphaCount++;
            }
        }
        if(alphaCount==0)
        {
            res=new StringBuilder(s).reverse().toString();
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(Character.isAlphabetic(s.charAt(i)))
                {
                    char ch = s.charAt(i);
                    if(Character.isUpperCase(ch))
                    {
                        ch=Character.toLowerCase(ch);
                    }
                    else
                    {
                        ch=Character.toUpperCase(ch);
                    }
                    res+=ch;
                }
                else
                {
                    res+=s.charAt(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(solve(("AsDf")).equals(("aSdF")));
    assert(solve(("1234")).equals(("4321")));
    assert(solve(("ab")).equals(("AB")));
    assert(solve(("#a@C")).equals(("#A@c")));
    assert(solve(("#AsdfW^45")).equals(("#aSDFw^45")));
    assert(solve(("#6@2")).equals(("2@6#")));
    assert(solve(("#$a^D")).equals(("#$A^d")));
    assert(solve(("#ccc")).equals(("#CCC")));
    }

}
