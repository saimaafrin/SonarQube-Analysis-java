import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string 'text', return its md5 hash equivalent string.
    // If 'text' is an empty string, return null.
    // >>> stringToMd5(("Hello world"))
    // "3e25960a79dbc69b674cd4ec67a72c62"
    public static Optional<String> stringToMd5(String text) {

        // Using the java.security.MessageDigest, it is easy to produce the MD5 hash of a given string.
        // First, we use MessageDigest.getInstance(“MD5”) to produce the MessageDigest object.
        // This object can be used to digest a string, producing its hash.
        // The digest() method takes the string to be hashed as an argument,
        // and produces a byte array containing the hashed data.
        // We then use the method String.format("%032x", new Object[] { hash }) to convert this hash
        // to a hexadecimal string, and return that.
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return Optional.empty();
        }
        byte[] hash = md.digest(text.getBytes());
        if (text.length() == 0)
            return Optional.empty();
        String hex = String.format("%032x", new Object[] { new BigInteger(1, hash) });
        return Optional.of(hex);
    }
    public static void main(String[] args) {
    assert(stringToMd5(("Hello world")).equals("3e25960a79dbc69b674cd4ec67a72c62"));
    assert(stringToMd5(("")).equals(Optional.empty()));
    assert(stringToMd5(("A B C")).equals("0ef78513b0cb8cef12743f5aeb35f888"));
    assert(stringToMd5(("password")).equals("5f4dcc3b5aa765d61d8327deb882cf99"));
    }

}
