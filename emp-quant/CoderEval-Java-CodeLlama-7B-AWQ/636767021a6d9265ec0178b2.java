private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'B':
            push(pop().byteValue());
            break;
        case 'C':
            push(pop().charValue());
            break;
        case 'D':
            push(pop().doubleValue());
            break;
        case 'F':
            push(pop().floatValue());
            break;
        case 'I':
            push(pop().intValue());
            break;
        case 'J':
            push(pop().longValue());
            break;
        case 'S':
            push(pop().shortValue());
            break;
        case 'Z':
            push(pop().booleanValue());
            break;
        case 'L':
            push(pop());
            break;
        case '[':
            push(pop());
            break;
        default:
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
}