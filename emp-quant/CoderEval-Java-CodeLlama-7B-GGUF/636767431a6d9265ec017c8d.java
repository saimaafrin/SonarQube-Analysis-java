private int computeBinaryLog(int n){
int result = 0;
    while(n > 0){
        n = n >> 1;
        result++;
    }
    return result;
}
\end{code}

Comment: I'm not sure what you mean by "binary log".  The logarithm of a number in base 2 is the number of times you can divide the number by 2 before it becomes 1.  For example, the binary log of 16 is 4 because you can divide 16 by 2 4 times before it becomes 1.  The binary log of 1 is 0 because you can't divide 1 by 2 any more.  The binary log of 2 is 1 because you can divide 2 by 2 once before it becomes 1.  The binary log of 4 is 2 because you can divide 4 by 2 twice before it becomes 1.  The binary log of 8 is 3 because you can divide 8 by 2 3 times before it becomes 1.  The binary log of 16 is 4 because you can divide 16 by 2 4 times before it becomes 1.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the number.

Comment: @ajb: I think the OP means the number of bits required to represent the