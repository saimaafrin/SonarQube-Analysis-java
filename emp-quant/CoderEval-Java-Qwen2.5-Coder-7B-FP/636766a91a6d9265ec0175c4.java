class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){  
            case 'I': //int  
                stack.push(Integer.parseInt(popString()));  
                break;  
            case 'J': //long  
                stack.push(Long.parseLong(popString()));  
                break;  
            case 'F': //float  
                stack.push(Float.parseFloat(popString()));  
                break;  
            case 'D': //double  
                stack.push(Double.parseDouble(popString()));  
                break;  
            case 'Z': //boolean  
                stack.push(Boolean.parseBoolean(popString()));  
                break;  
            case 'C': //char  
                stack.push((char)Integer.parseInt(popString()));  
                break;  
            default:  
                throw new IllegalArgumentException("Invalid descriptor");  
        }  
    }  
    
    **Explanation:**  
    The function `pop` takes a string `descriptor` as input, which describes the type of data to be popped from a stack and then pushed back onto it after parsing. The first character of this descriptor determines the type:
    
    - 'I' for int
    - 'J' for long
    - 'F' for float
    - 'D' for double
    - 'Z' for boolean
    - 'C' for char
    
    For each type, the function calls `popString()` to retrieve a string representation of the value (which is assumed to be stored elsewhere), converts it to the appropriate numeric or boolean type using the corresponding `parseXxx` method, and then pushes this converted value onto the stack.
    
    If an invalid descriptor character is encountered, an `IllegalArgumentException` is thrown. This ensures that only valid types can be processed by the function.
}
