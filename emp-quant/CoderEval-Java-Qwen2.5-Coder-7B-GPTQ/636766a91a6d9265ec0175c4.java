private void pop(final String descriptor){
switch(descriptor.charAt(0)){  
        case 'I': //int
            stack.push(Integer.parseInt(descriptor.substring(1)));
            break;  
        case 'J': //long
            stack.push(Long.parseLong(descriptor.substring(1)));
            break;  
        case 'F': //float
            stack.push(Float.parseFloat(descriptor.substring(1)));
            break;  
        case 'D': //double
            stack.push(Double.parseDouble(descriptor.substring(1)));
            break;  
        default:  
            throw new IllegalArgumentException("Invalid descriptor");  
    }  
}  

**Question:** How does the `pop` method determine which data type to parse and push onto the stack based on the descriptor? What happens if an invalid descriptor is provided?

**Answer:** The `pop` method determines the data type by examining the first character of the descriptor string. Each character corresponds to a specific data type:
- 'I' for int
- 'J' for long
- 'F' for float
- 'D' for double

The method then parses the remaining part of the descriptor string into the appropriate numeric type using methods like `Integer.parseInt`, `Long.parseLong`, `Float.parseFloat`, or `Double.parseDouble`. This parsed value is pushed onto a stack.

If an invalid descriptor is provided (i.e., a character other than 'I', 'J', 'F', or 'D'), the method throws an `IllegalArgumentException` with the message "Invalid descriptor". This ensures that only valid descriptors are processed, preventing runtime errors due to incorrect data types.