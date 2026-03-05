private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'Z':
            push(Boolean.valueOf(pop().booleanValue()));
            break;
        case 'B':
            push(Integer.valueOf(pop().byteValue()));
            break;
        case 'C':
            push(Integer.valueOf(pop().charValue()));
            break;
        case 'S':
            push(Integer.valueOf(pop().shortValue()));
            break;
        case 'I':
            push(pop());
            break;
        case 'J':
            push(Long.valueOf(pop().longValue()));
            break;
        case 'F':
            push(Float.valueOf(pop().floatValue()));
            break;
        case 'D':
            push(Double.valueOf(pop().doubleValue()));
            break;
        case 'L':
        case '[':
            push(pop());
            break;
        default:
            throw new IllegalStateException("Unexpected descriptor: " + descriptor);
    }
}