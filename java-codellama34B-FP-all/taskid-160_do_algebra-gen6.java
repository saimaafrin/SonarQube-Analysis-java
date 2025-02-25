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

        System.out.println(operand);
        int n = operand.size() - 1;
        //System.out.println(n);
        long[][] op_matrix = new long[n + 1][n + 1];
        long[][] val_matrix = new long[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < n + 1; j++)
                op_matrix[i][j] = -1;
        for (int i = 0; i < n + 1; i++) {
            op_matrix[i][0] = operand.get(0);
            op_matrix[0][i] = operand.get(i);
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                val_matrix[i][j] = 0;
                op_matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (op.get(i).equals("+")) {
                op_matrix[i + 1][i + 2] = 1;
            }
            if (op.get(i).equals("-")) {
                op_matrix[i + 1][i + 2] = -1;
            }
            if (op.get(i).equals("*")) {
                op_matrix[i + 1][i + 2] = 2;
            }
            if (op.get(i).equals("/")) {
                op_matrix[i + 1][i + 2] = 3;
            }
            if (op.get(i).equals("**")) {
                op_matrix[i + 1][i + 2] = 4;
            }
        }
        long[][] result_matrix = new long[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                result_matrix[i][j] = 0;
            }
        }
        long[][] temp_matrix = new long[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                temp_matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < n + 1; k++) {
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
