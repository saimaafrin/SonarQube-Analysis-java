private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'Z':
            stack.push(Boolean.valueOf(pop().booleanValue()));
            break;
        case 'B':
            stack.push(Byte.valueOf(pop().byteValue()));
            break;
        case 'C':
            stack.push(Character.valueOf(pop().charValue()));
            break;
        case 'S':
            stack.push(Short.valueOf(pop().shortValue()));
            break;
        case 'I':
            stack.push(Integer.valueOf(pop().intValue()));
            break;
        case 'F':
            stack.push(Float.valueOf(pop().floatValue()));
            break;
        case 'J':
            stack.push(Long.valueOf(pop().longValue()));
            break;
        case 'D':
            stack.push(Double.valueOf(pop().doubleValue()));
            break;
        case 'L':
            stack.push(pop());
            break;
        case '[':
            stack.push(pop());
            break;
        default:
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
}