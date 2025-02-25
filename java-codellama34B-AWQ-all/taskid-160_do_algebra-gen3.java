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

        Stack<String> operators = new Stack<String>();
        Stack<Long> values = new Stack<Long>();
        for (int i = 0; i < op.size(); i++) {
            String cOp = op.get(i);
            operators.push(cOp);
            if (operators.size() == 2) {
                String op1 = operators.pop();
                String op2 = operators.pop();
                long num1 = values.pop();
                long num2 = values.pop();
                long result = 0;
                if (op1.equals("+")) {
                    result = num2 + num1;
                } else if (op1.equals("-")) {
                    result = num2 - num1;
                } else if (op1.equals("*")) {
                    result = num2 * num1;
                } else if (op1.equals("//")) {
                    result = num2 / num1;
                } else if (op1.equals("**")) {
                    result = (long) Math.pow(num2, num1);
                }
                values.push(result);
                operators.push(op2);
            }
        }
        while (operators.size() > 0) {
            String op1 = operators.pop();
            String op2 = operators.pop();
            long num1 = values.pop();
            long num2 = values.pop();
            long result = 0;
            if (op1.equals("+")) {
                result = num2 + num1;
            } else if (op1.equals("-")) {
                result = num2 - num1;
            } else if (op1.equals("*")) {
                result = num2 * num1;
            } else if (op1.equals("//")) {
                result = num2 / num1;
            } else if (op1.equals("**")) {
                result = (long) Math.pow(num2, num1);
            }
            values.push(result);
        }
        return values.pop();
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
