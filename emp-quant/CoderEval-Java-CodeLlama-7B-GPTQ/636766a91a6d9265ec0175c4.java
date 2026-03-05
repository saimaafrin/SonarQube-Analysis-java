private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'Z':
        case 'C':
        case 'F':
        case 'I':
        case 'S':
            push(descriptor, stack.pop());
            break;
        case 'J':
        case 'D':
            push(descriptor, stack.pop());
            push(descriptor, stack.pop());
            break;
        case 'L':
        case '[':
            push(descriptor, stack.pop());
            break;
        default:
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
}