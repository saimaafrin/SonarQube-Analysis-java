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

        // Code here
        String[] ops = new String[] { "+" , "-" , "*" , "/" , "%" , "^" };
        int[] prec = new int[] { 1 , 1 , 2 , 2 , 2 , 3 };
        int n = operand.size();
        long[] val = new long[n];
        for(int i=0;i<n;i++){
            val[i] = operand.get(i);
        }
        for(int i=0;i<n-1;i++){
            int max = i;
            for(int j=i+1;j<n;j++){
                if(prec[indexOf(ops,op.get(j-1))]>prec[indexOf(ops,op.get(max-i))]){
                    max = j;
                }
            }
            long temp = val[max];
            val[max] = val[max+1];
            val[max+1] = temp;
            String temp1 = op.get(max);
            op.set(max,op.get(max+1));
            op.set(max+1,temp1);
        }
        for(int i=0;i<n-1;i++){
            if(op.get(i).equals("+")){
                val[i+1]+=val[i];
            }
            else if(op.get(i).equals("-")){
                val[i+1]-=val[i];
            }
            else if(op.get(i).equals("*")){
                val[i+1]*=val[i];
            }
            else if(op.get(i).equals("/")){
                val[i+1]/=val[i];
            }
            else if(op.get(i).equals("%")){
                val[i+1]%=val[i];
            }
            else if(op.get(i).equals("^")){
                val[i+1]=val[i]%val[i+1];
            }
        }
        return val[n-1];
    }
    public static void main(String[] args) {
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"**", (String)"*", (String)"+"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (37l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"+", (String)"*", (String)"-"))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)5l)))) == (9l));
    assert(doAlgebra((new ArrayList<String>(Arrays.asList((String)"//", (String)"*"))), (new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)4l)))) == (8l));
    }

}
