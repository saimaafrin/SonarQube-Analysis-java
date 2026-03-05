private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'Z':
            push(pop() == 0);
            break;
        case 'B':
            push(pop() & 0xFF);
            break;
        case 'C':
            push(pop() & 0xFFFF);
            break;
        case 'D':
            push(popDouble());
            break;
        case 'F':
            push(popFloat());
            break;
        case 'I':
            push(pop() & 0xFFFFFFFF);
            break;
        case 'J':
            push(popLong());
            break;
        case 'S':
            push(pop() & 0xFFFF);
            break;
        case 'V':
            push(null);
            break;
        case 'L':
            push(popReference());
            break;
        default:
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
}