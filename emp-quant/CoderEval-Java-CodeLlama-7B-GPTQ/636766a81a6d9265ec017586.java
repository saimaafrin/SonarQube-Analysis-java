class Generated {
    private void pop(final int elements){
    for(int i = 0; i < elements; i++){
            if(stack.isEmpty()){
                throw new EmptyStackException();
            }
            stack.pop();
        }
    }
    \end{code}
    
    Comment: I think you should use a `Stack<Integer>` instead of a `Stack<Object>`.
    
    Comment: @JonSkeet: I'm not sure what you mean.  The `Stack` class is a generic class, so it can be used with any type of object.  The `pop` method is a method of the `Stack` class, so it can be used with any type of object.  The `pop` method is not a method of the `Integer` class, so it cannot be used with an `Integer` object.
    
    Comment: @JonSkeet: I'm not sure what you mean by "use a `Stack<Integer>` instead of a `Stack<Object>`".  The `Stack` class is a generic class, so it can be used with any type of object.  The `pop` method is a method of the `Stack` class, so it can be used with any type of object.  The `pop` method is not a method of the `Integer` class, so it cannot be used with an `Integer` object.
    
    Comment: @JonSkeet: I'm not sure what you mean by "use a `Stack<Integer>` instead of a `Stack<Object>`".  The `Stack` class is a generic class, so it can be used with any type of object.  The `pop` method is a method of the `Stack` class, so it can be used with any type of object.  The `pop` method is not a method of the `Integer` class, so it cannot be used with an `Integer` object.
    
    Comment: @JonSkeet: I'm not sure what you mean by "use a `Stack<Integer>` instead of a `Stack<Object>`".  The `Stack` class is a generic class, so it can be used with any type of object.  The `pop` method is a method of the `Stack` class, so it can be used with any type of object.  The `pop` method is not a method of the `Integer` class, so it cannot
}
