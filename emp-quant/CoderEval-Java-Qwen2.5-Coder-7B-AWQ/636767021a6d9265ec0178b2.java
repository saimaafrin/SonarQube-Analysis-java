private void pop(final String descriptor){
switch(descriptor.charAt(0)){  
        case 'B': //byte  
            stack.push((byte)pop());  
            break;  
        case 'C': //char  
            stack.push((char)pop());  
            break;  
        case 'D': //double  
            stack.push(popDouble());  
            break;  
        case 'F': //float  
            stack.push((float)pop());  
            break;  
        case 'I': //int  
            stack.push(pop());  
            break;  
        case 'J': //long  
            stack.push(popLong());  
            break;  
        case 'S': //short  
            stack.push((short)pop());  
            break;  
        case 'Z': //boolean  
            stack.push(popBoolean());  
            break;  
        default: //reference or array type  
            stack.push(popReference());  
            break;  
    }  
}  

**Push the various value according to the first character of the descriptor.**