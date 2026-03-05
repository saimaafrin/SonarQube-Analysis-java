private void pop(final String descriptor){
switch(descriptor.charAt(0)){  
        case 'B':  
        case 'C':  
        case 'S':  
        case 'I':  
        case 'F':  
        case 'J':  
        case 'Z':  
        case 'L':  
        case '[':  
            stack.push(popValue());  
            break;  
        case 'D':  
            stack.push(popDouble());  
            break;  
        default:  
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);  
    }  
}