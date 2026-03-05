private void pop(final String descriptor){
switch(descriptor.charAt(0)){  
        case 'I':  
            stack.push(Integer.valueOf(descriptor.substring(1)));  
            break;  
        case 'J':  
            stack.push(Long.valueOf(descriptor.substring(1)));  
            break;  
        case 'F':  
            stack.push(Float.valueOf(descriptor.substring(1)));  
            break;  
        case 'D':  
            stack.push(Double.valueOf(descriptor.substring(1)));  
            break;  
        case 'Z':  
            stack.push(Boolean.valueOf(descriptor.substring(1)));  
            break;  
        case 'C':  
            stack.push(Character.valueOf(descriptor.substring(1)));  
            break;  
        case 'S':  
            stack.push(Short.valueOf(descriptor.substring(1)));  
            break;  
        case 'B':  
            stack.push(Byte.valueOf(descriptor.substring(1)));  
            break;  
        case 'L':  
            stack.push(descriptor.substring(1));  
            break;  
        default:  
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);  
    }  
}  

**Question:**
What is the purpose of the `pop` method in the given code snippet, and how does it handle different data types based on the descriptor?