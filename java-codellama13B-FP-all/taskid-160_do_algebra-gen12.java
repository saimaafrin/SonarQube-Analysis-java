import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given two array lists operator, and operand. The first array list has basic algebra operations, and 
    // the second array list is an array array list of integers. Use the two given array lists to build the algebric 
    // expression and return the evaluation of this expression.
    // The basic algebra operations:
    // Addition ( + ) 
    // Subtraction ( - ) 
    // Multiplication ( * ) 
    // Floor division ( // ) 
    // Exponentiation ( ** ) 
    // Example:
    // operator['+', '*', '-']
    // array array list = [2, 3, 4, 5]
    // result = 2 + 3 * 4 - 5
    // => result = 9
    // Note:
    // The length of operator array list is equal to the length of operand array list minus one.
    // Operand is an array array list of of non-negative integers.
    // Operator array list has at least one operator, and operand array list has at least two operands.
    public static long doAlgebra(ArrayList<String> op, ArrayList<Long> operand) {

        if (operand.size() == 1) {
            return operand.get(0);
        }
        if (op.size() == 0) {
            return operand.get(0);
        }
        if (operand.size() == 2 && op.size() == 1) {
            switch (op.get(0)) {
                case "+":
                    return operand.get(0) + operand.get(1);
                case "-":
                    return operand.get(0) - operand.get(1);
                case "*":
                    return operand.get(0) * operand.get(1);
                case "/":
                    return operand.get(0) / operand.get(1);
                case "**":
                    return (long) Math.pow(operand.get(0), operand.get(1));
            }
        }
        long l = doAlgebra(new ArrayList<>(op.subList(1, op.size())), operand.subList(1, operand.size()));
        long r = doAlgebra(new ArrayList<>(op.subList(1, op.size())), operand.subList(2, operand.size()));
        switch (op.get(0)) {
            case "+":
                return l + r;
            case "-":
                return l - r;
            case "*":
                return l * r;
            case "/":
                return l / r;
            case "**":
                return (long) Math.pow(l, r);
        }
        return 0;
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
