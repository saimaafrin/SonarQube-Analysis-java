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

        int opSize = op.size();
        int opArrSize = operand.size();
        if (opArrSize - opSize != 1) {
            return -1;
        }
        // System.out.println("opSize: " + opSize);
        // System.out.println("opArrSize: " + opArrSize);
        long result = 0;
        for (int i = 0; i < opSize; i++) {
            // System.out.println("i: " + i);
            String currOp = op.get(i);
            long currOp1 = operand.get(i);
            long currOp2 = operand.get(i + 1);
            // System.out.println("currOp1: " + currOp1);
            // System.out.println("currOp2: " + currOp2);
            // System.out.println("currOp: " + currOp);
            switch (currOp) {
                case "+":
                    result = currOp1 + currOp2;
                    break;
                case "-":
                    result = currOp1 - currOp2;
                    break;
                case "*":
                    result = currOp1 * currOp2;
                    break;
                case "/":
                    result = currOp1 / currOp2;
                    break;
                case "**":
                    result = (long) Math.pow(currOp1, currOp2);
                    break;
            }
            // System.out.println("result: " + result);
            operand.set(i, result);
            operand.remove(i + 1);
            op.remove(i);
            i = -1;
        }
        return operand.get(0);
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
