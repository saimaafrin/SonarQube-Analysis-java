class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){
            case 'V':
                pop();
                break;
            case 'Z':
                pop();
                break;
            case 'B':
                pop();
                break;
            case 'C':
                pop();
                break;
            case 'S':
                pop();
                break;
            case 'I':
                pop();
                break;
            case 'F':
                pop();
                break;
            case 'J':
                pop();
                break;
            case 'D':
                pop();
                break;
            case '[':
                pop();
                break;
            case 'L':
                pop();
                break;
            default:
                throw new RuntimeException("Invalid descriptor: " + descriptor);
        }
    }
}
