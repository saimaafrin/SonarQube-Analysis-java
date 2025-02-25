import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a number in decimal form and your task is to convert it to
    // binary format. The function should return a string, with each character representing a binary
    // number. Each character in the string will be '0' or '1'.
    // There will be an extra couple of characters 'db' at the beginning and at the end of the string.
    // The extra characters are there to help with the format.
    // Examples:
    // >>> decimalToBinary((15l))
    // ("db1111db")
    // >>> decimalToBinary((32l))
    // ("db100000db")
    public static String decimalToBinary(long decimal) {

        long binary = 0;
        char[] binaryStr = new char[64];
        int counter = 0;
        if(decimal == 0) {
            return "db0db";
        }
        while(decimal != 0) {
            binary = decimal % 2;
            decimal = decimal / 2;
            if(binary == 1) {
                binaryStr[counter] = '1';
            }
            else {
                binaryStr[counter] = '0';
            }
            counter++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = counter - 1; i >= 0; i--) {
            sb.append(binaryStr[i]);
        }
        return "db" + sb.toString() + "db";
    }
    public static void main(String[] args) {
    assert(decimalToBinary((0l)).equals(("db0db")));
    assert(decimalToBinary((32l)).equals(("db100000db")));
    assert(decimalToBinary((103l)).equals(("db1100111db")));
    assert(decimalToBinary((15l)).equals(("db1111db")));
    }

}
