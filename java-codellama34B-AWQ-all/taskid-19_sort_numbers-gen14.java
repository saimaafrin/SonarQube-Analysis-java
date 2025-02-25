import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input is a space-delimited string of numberals from 'zero' to 'nine'.
    // Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    // Return the string with numbers sorted from smallest to largest
    // >>> sortNumbers(("three one five"))
    // ("one three five")
    public static String sortNumbers(String numbers) {

        String sortedNumbers = "";
        String[] numbersArray = numbers.split(" ");
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        for (String number : numbersArray) {
            switch (number) {
                case "zero":
                    numbersList.add(0);
                    break;
                case "one":
                    numbersList.add(1);
                    break;
                case "two":
                    numbersList.add(2);
                    break;
                case "three":
                    numbersList.add(3);
                    break;
                case "four":
                    numbersList.add(4);
                    break;
                case "five":
                    numbersList.add(5);
                    break;
                case "six":
                    numbersList.add(6);
                    break;
                case "seven":
                    numbersList.add(7);
                    break;
                case "eight":
                    numbersList.add(8);
                    break;
                case "nine":
                    numbersList.add(9);
                    break;
            }
        }

        Collections.sort(numbersList);

        for (Integer number : numbersList) {
            switch (number) {
                case 0:
                    sortedNumbers += "zero ";
                    break;
                case 1:
                    sortedNumbers += "one ";
                    break;
                case 2:
                    sortedNumbers += "two ";
                    break;
                case 3:
                    sortedNumbers += "three ";
                    break;
                case 4:
                    sortedNumbers += "four ";
                    break;
                case 5:
                    sortedNumbers += "five ";
                    break;
                case 6:
                    sortedNumbers += "six ";
                    break;
                case 7:
                    sortedNumbers += "seven ";
                    break;
                case 8:
                    sortedNumbers += "eight ";
                    break;
                case 9:
                    sortedNumbers += "nine ";
                    break;
            }
        }

        return sortedNumbers;
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
