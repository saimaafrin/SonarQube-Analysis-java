class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){
            case 'Z':
                stack.pop();
                break;
            case 'B':
            case 'C':
            case 'S':
            case 'I':
                stack.pop();
                break;
            case 'F':
            case 'J':
                stack.pop();
                stack.pop();
                break;
            case 'D':
                stack.pop();
                stack.pop();
                stack.pop();
                break;
            case '[':
                pop(descriptor.substring(1));
                break;
            case 'L':
                pop(descriptor.substring(1));
                break;
            default:
                throw new IllegalStateException("Unexpected descriptor: " + descriptor);
        }
    }
}
