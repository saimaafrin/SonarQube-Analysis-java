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

        return text != null && !text.isEmpty()
            ? Optional.ofNullable(text).map((t) -> {
                try {
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(text.getBytes());
                    byte[] digest = md.digest();
                    BigInteger bigInt = new BigInteger(1, digest);
                    String hashtext = bigInt.toString(16);
                    // Now we need to zero pad it if you actually want the full 32 chars.
                    while (hashtext.length() < 32) {
                        hashtext = "0" + hashtext;
                    }
                    return hashtext;
                } catch (NoSuchAlgorithmException ex) {
                    return null;
                }
            })
            : Optional.empty();
    }
    public static void main(String[] args) {
    assert(stringToMd5(("Hello world")).equals("3e25960a79dbc69b674cd4ec67a72c62"));
    assert(stringToMd5(("")).equals(Optional.empty()));
    assert(stringToMd5(("A B C")).equals("0ef78513b0cb8cef12743f5aeb35f888"));
    assert(stringToMd5(("password")).equals("5f4dcc3b5aa765d61d8327deb882cf99"));
    }

}
