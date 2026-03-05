private void pop(final String descriptor){
switch(descriptor.charAt(0)){
        case 'Z':
        case 'B':
        case 'C':
        case 'S':
        case 'I':
        case 'F':
            stack.pop();
            break;
        case 'J':
        case 'D':
            stack.pop();
            stack.pop();
            break;
        case 'L':
        case '[':
            stack.pop();
            break;
        default:
            throw new IllegalStateException("Unexpected descriptor: " + descriptor);
    }
}