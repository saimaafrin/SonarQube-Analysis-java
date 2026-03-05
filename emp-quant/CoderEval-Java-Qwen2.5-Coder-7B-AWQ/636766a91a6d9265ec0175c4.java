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
The function `pop` takes a string `descriptor` as input, which describes the type of data to be popped from a stack. The function uses a switch statement to determine the type of data based on the first character of the descriptor:

- 'I' for int
- 'J' for long
- 'F' for float
- 'D' for double
- 'Z' for boolean
- 'C' for char

For each type, it calls `popString()` to retrieve a string representation of the value and then converts it to the appropriate type using the corresponding method (e.g., `Integer.parseInt`, `Long.parseLong`). The converted value is then pushed onto the stack.

If the descriptor does not match any of the expected types, an `IllegalArgumentException` is thrown with the message "Invalid descriptor". This ensures that only valid descriptors are processed by the function.