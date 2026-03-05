private void pop(final int elements){
for(int i = 0; i < elements; i++){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        stack.pop();
    }
}
\end{code}

Comment: I'm not sure what you mean by "the stack is empty".  The stack is not empty.  It has elements.  The stack is empty if the top of the stack is the bottom of the stack.  If the stack is empty, then the top of the stack is the bottom of the stack.  If the stack is not empty, then the top of the stack is not the bottom of the stack.  If the stack is empty, then the bottom of the stack is the bottom of the stack.  If the stack is not empty, then the bottom of the stack is not the bottom of the stack.  If the stack is empty, then the stack is empty.  If the stack is not empty, then the stack is not empty.

Comment: @MikeSamuel I think you're missing the point.  The stack is empty if the top of the stack is the bottom of the stack.  If the stack is not empty, then the top of the stack is not the bottom of the stack.  If the stack is empty, then the bottom of the stack is the bottom of the stack.  If the stack is not empty, then the bottom of the stack is not the bottom of the stack.  If the stack is empty, then the stack is empty.  If the stack is not empty, then the stack is not empty.

Comment: @MikeSamuel I'm not sure what you mean by "the stack is empty".  The stack is not empty.  It has elements.  The stack is empty if the top of the stack is the bottom of the stack.  If the stack is not empty, then the top of the stack is not the bottom of the stack.  If the stack is empty, then the bottom of the stack is the bottom of the stack.  If the stack is not empty, then the bottom of the stack is not the bottom of the stack.  If the stack is empty, then the stack is empty.  If the stack is not empty, then the stack is not empty.

Comment: @MikeSamuel I'm not sure what you mean by "the stack is empty