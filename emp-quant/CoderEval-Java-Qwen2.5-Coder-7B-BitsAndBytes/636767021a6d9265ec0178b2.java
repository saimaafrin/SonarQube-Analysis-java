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
            stack.push(popFloat());
            break;
        case 'I': //int
            stack.push(popInt());
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
        default:
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
}

**Note:** The `pop()` method is assumed to be a method that pops an integer from the stack, and similar methods like `popDouble()`, `popFloat()`, `popLong()`, and `popBoolean()` are assumed to exist for their respective types. The `stack` is assumed to be a data structure where elements can be pushed onto and popped off.