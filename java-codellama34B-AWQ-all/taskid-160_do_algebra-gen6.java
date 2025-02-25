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

        String[][] operators = { {"+", "-"}, {"*", "/"}, {"**"} };
        long total = 0;
        long current = 0;
        int opIndex = 0;
        for(int i = 0; i < operand.size(); i++) {
            if(i == 0) {
                current = operand.get(i);
            }
            else {
                String curOp = op.get(opIndex);
                if(Arrays.asList(operators[0]).contains(curOp)) {
                    if(curOp.equals("+")) {
                        total += current;
                        current = operand.get(i);
                    }
                    else {
                        total += current;
                        current = -operand.get(i);
                    }
                }
                else if(Arrays.asList(operators[1]).contains(curOp)) {
                    if(curOp.equals("*")) {
                        total *= current;
                        current = operand.get(i);
                    }
                    else {
                        total /= current;
                        current = operand.get(i);
                    }
                }
                else if(Arrays.asList(operators[2]).contains(curOp)) {
                    total = (long)Math.pow(total, current);
                    current = operand.get(i);
                }
                opIndex++;
            }
        }
        total += current;
        return total;
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
