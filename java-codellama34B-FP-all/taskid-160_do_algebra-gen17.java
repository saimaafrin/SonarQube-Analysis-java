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

        long result = 0;
        long accumulator = 0;
        String operator = "";
        // If the length of operator array list is equal to the length of operand array list minus one.
        if (op.size() == operand.size() - 1) {
            // Iterate through the operator array list
            for (int i = 0; i < op.size(); i++) {
                // For each operator, get the next operand and the previous operand.
                long nextOperand = operand.get(i);
                long previousOperand = operand.get(i - 1);
                // Perform the operation using the operand and the operator
                switch (op.get(i)) {
                    case "+":
                        accumulator = previousOperand + nextOperand;
                        break;
                    case "-":
                        accumulator = previousOperand - nextOperand;
                        break;
                    case "*":
                        accumulator = previousOperand * nextOperand;
                        break;
                    case "/":
                        accumulator = previousOperand / nextOperand;
                        break;
                    case "**":
                        accumulator = (long) Math.pow(previousOperand, nextOperand);
                        break;
                }
                // Reassign previous operand with the accumulator
                operand.set(i - 1, accumulator);
            }
            // Assign the accumulator to result
            result = accumulator;
        }
        return result;
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
