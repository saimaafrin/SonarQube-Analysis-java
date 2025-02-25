import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have been tasked to write a function that receives 
    // a hexadecimal number as a string and counts the number of hexadecimal 
    // digits that are primes (prime number, or a prime, is a natural number 
    // greater than 1 that is not a product of two smaller natural numbers).
    // Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
    // Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
    // So you have to determine a number of the following digits: 2, 3, 5, 7, 
    // B (=decimal 11), D (=decimal 13).
    // Note: you may assume the input is always correct or empty string, 
    // and symbols A,B,C,D,E,F are always uppercase.
    // Examples:
    // >>> hexKey(("AB"))
    // (1l)
    // >>> hexKey(("1077E"))
    // (2l)
    // >>> hexKey(("ABED1A33"))
    // (4l)
    // >>> hexKey(("123456789ABCDEF0"))
    // (6l)
    // >>> hexKey(("2020"))
    // (2l)
    public static long hexKey(String num) {

        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        Map<Character,Integer> hexMap = new HashMap<Character,Integer>();
        hexMap.put('0', 0);
        hexMap.put('1', 1);
        hexMap.put('2', 2);
        hexMap.put('3', 3);
        hexMap.put('4', 4);
        hexMap.put('5', 5);
        hexMap.put('6', 6);
        hexMap.put('7', 7);
        hexMap.put('8', 8);
        hexMap.put('9', 9);
        hexMap.put('A', 10);
        hexMap.put('B', 11);
        hexMap.put('C', 12);
        hexMap.put('D', 13);
        hexMap.put('E', 14);
        hexMap.put('F', 15);
        if (num.equals("")){
            return 0;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num.length(); i++){
            list.add(hexMap.get(num.charAt(i)));
        }
        long count = 0;
        for (int i = 0; i < list.size(); i++){
            if (primes.contains(list.get(i))) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(hexKey(("AB")) == (1l));
    assert(hexKey(("1077E")) == (2l));
    assert(hexKey(("ABED1A33")) == (4l));
    assert(hexKey(("2020")) == (2l));
    assert(hexKey(("123456789ABCDEF0")) == (6l));
    assert(hexKey(("112233445566778899AABBCCDDEEFF00")) == (12l));
    }

}
