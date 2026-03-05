class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){  
            case 'I': //int
                stack.push(Integer.parseInt(popValue()));
                break;  
            case 'J': //long
                stack.push(Long.parseLong(popValue()));
                break;  
            case 'F': //float
                stack.push(Float.parseFloat(popValue()));
                break;  
            case 'D': //double
                stack.push(Double.parseDouble(popValue()));
                break;  
            case 'L': //reference
                stack.push(popReference());
                break;  
            default:  
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);  
        }  
    }  
    
    **Explanation:**
    The `pop` method is designed to handle different data types based on the first character of a descriptor string, which typically represents the type in Java bytecode. Here's how it works:
    
    1. **Switch Statement**: The method uses a switch statement to check the first character of the descriptor.
    2. **Integer ('I')**: If the descriptor starts with 'I', it means an integer is expected. The method pops a value from somewhere (not shown here), parses it as an integer using `Integer.parseInt`, and pushes it onto the stack.
    3. **Long ('J')**: Similarly, if the descriptor starts with 'J', it handles long values by parsing the popped value as a long using `Long.parseLong`.
    4. **Float ('F')**: For float values, it parses the popped value as a float using `Float.parseFloat`.
    5. **Double ('D')**: For double values, it parses the popped value as a double using `Double.parseDouble`.
    6. **Reference ('L')**: If the descriptor starts with 'L', it indicates a reference type. In this case, it calls `popReference()` to get the reference and pushes it onto the stack.
    7. **Default Case**: If none of the above cases match, it throws an `IllegalArgumentException` indicating that the descriptor is invalid.
    
    This method is useful in scenarios where you need to interpret and process data types dynamically based on their descriptors, such as when working with Java bytecode or similar systems.
}
